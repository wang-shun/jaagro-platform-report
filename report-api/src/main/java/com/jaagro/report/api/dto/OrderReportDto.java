package com.jaagro.report.api.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderReportDto implements Serializable {

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
