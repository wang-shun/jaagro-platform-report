package com.jaagro.report.biz.service.impl;

import com.jaagro.report.api.dto.DepartmentReturnDto;
import com.jaagro.report.api.dto.OrderReportDto;
import com.jaagro.report.api.entity.DeptOrderDaily;
import com.jaagro.report.api.entity.DeptOrderMonthly;
import com.jaagro.report.api.service.OrderReportService;
import com.jaagro.report.biz.mapper.report.DeptOrderDailyMapperExt;
import com.jaagro.report.biz.mapper.report.DeptOrderMonthlyMapperExt;
import com.jaagro.report.biz.mapper.tms.OrderReportMapperExt;
import com.jaagro.report.biz.service.UserClientService;
import com.jaagro.utils.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 订单报表实现类
 *
 * @author gavin
 * @since 2018/11/28
 */
@Service
@Slf4j
public class OrderReportServiceImpl implements OrderReportService {

    @Autowired
    private UserClientService userClientService;

    @Autowired
    private DeptOrderDailyMapperExt deptOrderDailyMapperExt;

    @Autowired
    private DeptOrderMonthlyMapperExt deptOrderMonthlyMapperExt;

    @Autowired
    private OrderReportMapperExt orderReportMapperExt;

    /**
     * 生成日报表数据
     *
     * @param orderReportDto
     */
    @Override
    public void createDailyReport(OrderReportDto orderReportDto) {
        String day = orderReportDto.getReportTime();
        List<DeptOrderDaily> deptOrderDailyList = new ArrayList<>();
        //1、从tms查询数据 day = '20181128'   yyyyMMdd
        deptOrderDailyList = orderReportMapperExt.getDeptOrderDailyDataListFromTms(orderReportDto);
        if (!CollectionUtils.isEmpty(deptOrderDailyList)) {
            //2、删除当天的数据
            deptOrderDailyMapperExt.batchDelete(day);
            //3、把数据保存到report表
            deptOrderDailyMapperExt.batchInsert(deptOrderDailyList);
        }

    }

    /**
     * 生成月报表数据
     *
     * @param orderReportDto yyyyMM
     */
    @Override
    public void createMonthlyReport(OrderReportDto orderReportDto) {
        String month = orderReportDto.getReportTime();
        List<DeptOrderMonthly> deptOrderMonthlyList = new ArrayList<>();
        //1、从日报表查询出月报表的数据 day = '201811' yyyyMM
        deptOrderMonthlyList = deptOrderDailyMapperExt.getOrderMonthlyDataFromOrderDaily(orderReportDto);
        if (!CollectionUtils.isEmpty(deptOrderMonthlyList)) {
            //2、删除当月的数据
            deptOrderMonthlyMapperExt.batchDelete(month);
            //3、把数据保存到report表
            deptOrderMonthlyMapperExt.batchInsert(deptOrderMonthlyList);
        }

    }

    @Override
    public List<DeptOrderDaily> getDeptOrderDailyDataListFromTms(OrderReportDto orderReportDto) {
        List<DeptOrderDaily> orderDailyList = orderReportMapperExt.getDeptOrderDailyDataListFromTms(orderReportDto);
        return orderDailyList;
    }

    /**
     * 从日报表中获取月报表的数据
     *
     * @param orderReportDto
     * @return
     */
    @Override
    public List<DeptOrderMonthly> getOrderMonthlyDataFromOrderDaily(OrderReportDto orderReportDto) {
        return deptOrderDailyMapperExt.getOrderMonthlyDataFromOrderDaily(orderReportDto);
    }


    @Override
    public List<DeptOrderDaily> listOrderDailyReport(OrderReportDto dto) {
        if (null != dto.getDeptId()) {
            List<Integer> deptIds = userClientService.getDownDepartmentByDeptId(dto.getDeptId());
            if (!CollectionUtils.isEmpty(deptIds)) {
                dto.setDepartIds(deptIds);
            }
        }
        List<DeptOrderDaily> orderDailyList = deptOrderDailyMapperExt.listOrderDailyReport(dto);
        if (!CollectionUtils.isEmpty(orderDailyList)) {
            List<DepartmentReturnDto> departmentReturnDtos = userClientService.getAllDepartments();
            for (DeptOrderDaily deptOrderDaily : orderDailyList) {
                DepartmentReturnDto departmentReturnDto = departmentReturnDtos.stream().filter(c -> c.getId().equals(deptOrderDaily.getDepartmentId())).collect(Collectors.toList()).get(0);
                if (null != departmentReturnDto) {
                    deptOrderDaily.setDepartmentName(departmentReturnDto.getDepartmentName());
                }
            }
        }
        return orderDailyList;
    }

    @Override
    public List<DeptOrderMonthly> listOrderMonthlyReport(OrderReportDto dto) {
        if (null != dto.getDeptId()) {
            List<Integer> deptIds = userClientService.getDownDepartmentByDeptId(dto.getDeptId());
            if (!CollectionUtils.isEmpty(deptIds)) {
                dto.setDepartIds(deptIds);
            }
        }
        List<DeptOrderMonthly> orderMonthlyList = deptOrderMonthlyMapperExt.listOrderMonthlyReport(dto);
        if (!CollectionUtils.isEmpty(orderMonthlyList)) {
            List<DepartmentReturnDto> departmentReturnDtos = userClientService.getAllDepartments();
            for (DeptOrderMonthly deptOrderMonthly : orderMonthlyList) {
                DepartmentReturnDto departmentReturnDto = departmentReturnDtos.stream().filter(c -> c.getId().equals(deptOrderMonthly.getDepartmentId())).collect(Collectors.toList()).get(0);
                if (null != departmentReturnDto) {
                    deptOrderMonthly.setDepartmentName(departmentReturnDto.getDepartmentName());
                }
            }
        }
        return orderMonthlyList;
    }
}
