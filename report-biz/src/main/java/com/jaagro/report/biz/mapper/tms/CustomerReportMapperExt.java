package com.jaagro.report.biz.mapper.tms;

import com.jaagro.report.api.dto.ListCustomerReportCriteriaDto;
import com.jaagro.report.api.entity.CustomerOrderDaily;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author baiyiran
 * 客户报表数据统计
 */
public interface CustomerReportMapperExt {

    /**
     * 订单总数
     *
     * @param beginDate
     * @param endDate
     * @return
     */
    List<HashMap<String, Object>> listOrderCount(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);

    /**
     * 运单总数
     *
     * @param beginDate
     * @param endDate
     * @return
     */
    List<HashMap<String, Object>> listWaybillCount(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);

    /**
     * 异常单数
     *
     * @param beginDate
     * @param endDate
     * @return
     */
    List<HashMap<String, Object>> listAnomalyCount(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);

    /**
     * 数量(单位) & 吨位(单位)
     *
     * @param beginDate
     * @param endDate
     */
    List<HashMap<String, Object>> listAmmountAndTonn(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);

    /**
     * 收入-运费
     *
     * @param beginDate
     * @param endDate
     */
    List<HashMap<String, Object>> listIncomeFreight(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);

    /**
     * 收入-异常费用
     *
     * @param beginDate
     * @param endDate
     */
    List<HashMap<String, Object>> ListIncomeAnomalyCost(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);

    /**
     * 成本-运费
     *
     * @param beginDate
     * @param endDate
     */
    List<HashMap<String, Object>> listExpendFreight(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);

    /**
     * 成本-异常费用
     *
     * @param beginDate
     * @param endDate
     */
    List<HashMap<String, Object>> listExpendAnomalyCost(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);

    /**
     * 毛利
     *
     * @param beginDate
     * @param endDate
     */
    List<HashMap<String, Object>> listGrossProfit(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);

}
