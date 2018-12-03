package com.jaagro.report.api.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author @Gao.
 */
@Data
@Accessors(chain = true)
public class WaybillFeeReportDto {

    /**
     * 日期(yyyy-mm-dd)
     */
    private String reportTime;

    /**
     * 网点id
     */
    private Integer deptId;

    /**
     * 部门id
     */
    private List<Integer> departIds;

    /**
     * 货物类型(1-毛鸡,2-饲料,3-母猪,4-公猪,5-仔猪,6-生猪)
     */
    private Integer goodsType;

}
