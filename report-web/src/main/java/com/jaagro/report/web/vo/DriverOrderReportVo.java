package com.jaagro.report.web.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author yj
 * @since 2018/11/30
 */
@Data
@Accessors(chain = true)
public class DriverOrderReportVo implements Serializable{
    /**
     * 月份(yyyy-mm)
     */
    private String reportTime;

    /**
     * 司机名称
     */
    private String driverName;

    /**
     * 车牌号
     */
    private String truckNumber;

    /**
     * 车辆id
     */
    private Integer truckId;

    /**
     * 公里数
     */
    private BigDecimal mileage;

    /**
     * 接单量
     */
    private Integer receiveWaybillQuantity;

    /**
     * 拒单量
     */
    private Integer refuseWaybillQuantity;

    /**
     * 异常量
     */
    private Integer anomalyWaybillQuantity;

    /**
     * 完成运单数
     */
    private Integer completeWaybillQuantity;

    /**
     * 平均接单时长(单位分钟)
     */
    private BigDecimal avgReceiveDuration;

    /**
     * 装货准时率
     */
    private BigDecimal loadPunctualityRate;

    /**
     * 卸货准时率
     */
    private BigDecimal unloadPunctualityRate;

    /**
     * 运费
     */
    private BigDecimal freight;

    /**
     * 异常费用
     */
    private BigDecimal anomalyCost;

    /**
     * 费用合计
     */
    private BigDecimal totalCost;

    /**
     * 创建时间
     */
    private Date createTime;
}
