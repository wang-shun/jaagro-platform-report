package com.jaagro.report.biz.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DriverOrderMonthly {
    /**
     * 司机报表id
     */
    private Integer id;

    /**
     * 统计时间(yyyy-mm-dd)
     */
    private String reportTime;

    /**
     * 司机名称
     */
    private String driverName;

    /**
     * 司机id
     */
    private Integer driverId;

    /**
     * 车牌号
     */
    private String truckNumber;

    /**
     * 车辆id
     */
    private Integer truckId;

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
     * 是否有效(0-无效,1-有效)
     */
    private Boolean enabled;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date modifyTime;

    /**
     * 司机报表id
     * @return id 司机报表id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 司机报表id
     * @param id 司机报表id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 统计时间(yyyy-mm-dd)
     * @return report_time 统计时间(yyyy-mm-dd)
     */
    public String getReportTime() {
        return reportTime;
    }

    /**
     * 统计时间(yyyy-mm-dd)
     * @param reportTime 统计时间(yyyy-mm-dd)
     */
    public void setReportTime(String reportTime) {
        this.reportTime = reportTime == null ? null : reportTime.trim();
    }

    /**
     * 司机名称
     * @return driver_name 司机名称
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * 司机名称
     * @param driverName 司机名称
     */
    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
    }

    /**
     * 司机id
     * @return driver_id 司机id
     */
    public Integer getDriverId() {
        return driverId;
    }

    /**
     * 司机id
     * @param driverId 司机id
     */
    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    /**
     * 车牌号
     * @return truck_number 车牌号
     */
    public String getTruckNumber() {
        return truckNumber;
    }

    /**
     * 车牌号
     * @param truckNumber 车牌号
     */
    public void setTruckNumber(String truckNumber) {
        this.truckNumber = truckNumber == null ? null : truckNumber.trim();
    }

    /**
     * 车辆id
     * @return truck_id 车辆id
     */
    public Integer getTruckId() {
        return truckId;
    }

    /**
     * 车辆id
     * @param truckId 车辆id
     */
    public void setTruckId(Integer truckId) {
        this.truckId = truckId;
    }

    /**
     * 接单量
     * @return receive_waybill_quantity 接单量
     */
    public Integer getReceiveWaybillQuantity() {
        return receiveWaybillQuantity;
    }

    /**
     * 接单量
     * @param receiveWaybillQuantity 接单量
     */
    public void setReceiveWaybillQuantity(Integer receiveWaybillQuantity) {
        this.receiveWaybillQuantity = receiveWaybillQuantity;
    }

    /**
     * 拒单量
     * @return refuse_waybill_quantity 拒单量
     */
    public Integer getRefuseWaybillQuantity() {
        return refuseWaybillQuantity;
    }

    /**
     * 拒单量
     * @param refuseWaybillQuantity 拒单量
     */
    public void setRefuseWaybillQuantity(Integer refuseWaybillQuantity) {
        this.refuseWaybillQuantity = refuseWaybillQuantity;
    }

    /**
     * 异常量
     * @return anomaly_waybill_quantity 异常量
     */
    public Integer getAnomalyWaybillQuantity() {
        return anomalyWaybillQuantity;
    }

    /**
     * 异常量
     * @param anomalyWaybillQuantity 异常量
     */
    public void setAnomalyWaybillQuantity(Integer anomalyWaybillQuantity) {
        this.anomalyWaybillQuantity = anomalyWaybillQuantity;
    }

    /**
     * 完成运单数
     * @return complete_waybill_quantity 完成运单数
     */
    public Integer getCompleteWaybillQuantity() {
        return completeWaybillQuantity;
    }

    /**
     * 完成运单数
     * @param completeWaybillQuantity 完成运单数
     */
    public void setCompleteWaybillQuantity(Integer completeWaybillQuantity) {
        this.completeWaybillQuantity = completeWaybillQuantity;
    }

    /**
     * 平均接单时长(单位分钟)
     * @return avg_receive_duration 平均接单时长(单位分钟)
     */
    public BigDecimal getAvgReceiveDuration() {
        return avgReceiveDuration;
    }

    /**
     * 平均接单时长(单位分钟)
     * @param avgReceiveDuration 平均接单时长(单位分钟)
     */
    public void setAvgReceiveDuration(BigDecimal avgReceiveDuration) {
        this.avgReceiveDuration = avgReceiveDuration;
    }

    /**
     * 装货准时率
     * @return load_punctuality_rate 装货准时率
     */
    public BigDecimal getLoadPunctualityRate() {
        return loadPunctualityRate;
    }

    /**
     * 装货准时率
     * @param loadPunctualityRate 装货准时率
     */
    public void setLoadPunctualityRate(BigDecimal loadPunctualityRate) {
        this.loadPunctualityRate = loadPunctualityRate;
    }

    /**
     * 卸货准时率
     * @return unload_punctuality_rate 卸货准时率
     */
    public BigDecimal getUnloadPunctualityRate() {
        return unloadPunctualityRate;
    }

    /**
     * 卸货准时率
     * @param unloadPunctualityRate 卸货准时率
     */
    public void setUnloadPunctualityRate(BigDecimal unloadPunctualityRate) {
        this.unloadPunctualityRate = unloadPunctualityRate;
    }

    /**
     * 运费
     * @return freight 运费
     */
    public BigDecimal getFreight() {
        return freight;
    }

    /**
     * 运费
     * @param freight 运费
     */
    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    /**
     * 异常费用
     * @return anomaly_cost 异常费用
     */
    public BigDecimal getAnomalyCost() {
        return anomalyCost;
    }

    /**
     * 异常费用
     * @param anomalyCost 异常费用
     */
    public void setAnomalyCost(BigDecimal anomalyCost) {
        this.anomalyCost = anomalyCost;
    }

    /**
     * 费用合计
     * @return total_cost 费用合计
     */
    public BigDecimal getTotalCost() {
        return totalCost;
    }

    /**
     * 费用合计
     * @param totalCost 费用合计
     */
    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * 是否有效(0-无效,1-有效)
     * @return enabled 是否有效(0-无效,1-有效)
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 是否有效(0-无效,1-有效)
     * @param enabled 是否有效(0-无效,1-有效)
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * @return modify_time 更新时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 更新时间
     * @param modifyTime 更新时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}