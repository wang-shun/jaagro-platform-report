package com.jaagro.report.biz.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DeptWaybillfeeMonthly {
    /**
     * 运单费用报表id
     */
    private Integer id;

    /**
     * 月份(yyyy-mm)
     */
    private String reportTime;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 部门id
     */
    private Integer departmentId;

    /**
     * 货物类型(1-毛鸡,2-饲料,3-母猪,4-公猪,5-仔猪,6-生猪)
     */
    private Integer goodsType;

    /**
     * 运单总数
     */
    private Integer totalWaybillQuantity;

    /**
     * 异常运单数
     */
    private Integer anomalyWaybillQuantity;

    /**
     * 货物数量
     */
    private Integer goodsQuantity;

    /**
     * 货物重量
     */
    private BigDecimal goodsWeight;

    /**
     * 收入-客户费用
     */
    private BigDecimal incomeCustomerFee;

    /**
     * 收入-异常费用
     */
    private BigDecimal incomeAnomalyFee;

    /**
     * 成本-运力费用
     */
    private BigDecimal expendFreight;

    /**
     * 成本-异常费用
     */
    private BigDecimal expendAnomalyFee;

    /**
     * 毛利
     */
    private BigDecimal grossProfit;

    /**
     * 毛利率
     */
    private BigDecimal grossProfitRate;

    /**
     * 是否有效(0-无效,1-有效)
     */
    private Boolean enabled;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 运单费用报表id
     * @return id 运单费用报表id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 运单费用报表id
     * @param id 运单费用报表id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 月份(yyyy-mm)
     * @return report_time 月份(yyyy-mm)
     */
    public String getReportTime() {
        return reportTime;
    }

    /**
     * 月份(yyyy-mm)
     * @param reportTime 月份(yyyy-mm)
     */
    public void setReportTime(String reportTime) {
        this.reportTime = reportTime == null ? null : reportTime.trim();
    }

    /**
     * 部门名称
     * @return department_name 部门名称
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * 部门名称
     * @param departmentName 部门名称
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    /**
     * 部门id
     * @return department_id 部门id
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * 部门id
     * @param departmentId 部门id
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 货物类型(1-毛鸡,2-饲料,3-母猪,4-公猪,5-仔猪,6-生猪)
     * @return goods_type 货物类型(1-毛鸡,2-饲料,3-母猪,4-公猪,5-仔猪,6-生猪)
     */
    public Integer getGoodsType() {
        return goodsType;
    }

    /**
     * 货物类型(1-毛鸡,2-饲料,3-母猪,4-公猪,5-仔猪,6-生猪)
     * @param goodsType 货物类型(1-毛鸡,2-饲料,3-母猪,4-公猪,5-仔猪,6-生猪)
     */
    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    /**
     * 运单总数
     * @return total_waybill_quantity 运单总数
     */
    public Integer getTotalWaybillQuantity() {
        return totalWaybillQuantity;
    }

    /**
     * 运单总数
     * @param totalWaybillQuantity 运单总数
     */
    public void setTotalWaybillQuantity(Integer totalWaybillQuantity) {
        this.totalWaybillQuantity = totalWaybillQuantity;
    }

    /**
     * 异常运单数
     * @return anomaly_waybill_quantity 异常运单数
     */
    public Integer getAnomalyWaybillQuantity() {
        return anomalyWaybillQuantity;
    }

    /**
     * 异常运单数
     * @param anomalyWaybillQuantity 异常运单数
     */
    public void setAnomalyWaybillQuantity(Integer anomalyWaybillQuantity) {
        this.anomalyWaybillQuantity = anomalyWaybillQuantity;
    }

    /**
     * 货物数量
     * @return goods_quantity 货物数量
     */
    public Integer getGoodsQuantity() {
        return goodsQuantity;
    }

    /**
     * 货物数量
     * @param goodsQuantity 货物数量
     */
    public void setGoodsQuantity(Integer goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /**
     * 货物重量
     * @return goods_weight 货物重量
     */
    public BigDecimal getGoodsWeight() {
        return goodsWeight;
    }

    /**
     * 货物重量
     * @param goodsWeight 货物重量
     */
    public void setGoodsWeight(BigDecimal goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    /**
     * 收入-客户费用
     * @return income_customer_fee 收入-客户费用
     */
    public BigDecimal getIncomeCustomerFee() {
        return incomeCustomerFee;
    }

    /**
     * 收入-客户费用
     * @param incomeCustomerFee 收入-客户费用
     */
    public void setIncomeCustomerFee(BigDecimal incomeCustomerFee) {
        this.incomeCustomerFee = incomeCustomerFee;
    }

    /**
     * 收入-异常费用
     * @return income_anomaly_fee 收入-异常费用
     */
    public BigDecimal getIncomeAnomalyFee() {
        return incomeAnomalyFee;
    }

    /**
     * 收入-异常费用
     * @param incomeAnomalyFee 收入-异常费用
     */
    public void setIncomeAnomalyFee(BigDecimal incomeAnomalyFee) {
        this.incomeAnomalyFee = incomeAnomalyFee;
    }

    /**
     * 成本-运力费用
     * @return expend_freight 成本-运力费用
     */
    public BigDecimal getExpendFreight() {
        return expendFreight;
    }

    /**
     * 成本-运力费用
     * @param expendFreight 成本-运力费用
     */
    public void setExpendFreight(BigDecimal expendFreight) {
        this.expendFreight = expendFreight;
    }

    /**
     * 成本-异常费用
     * @return expend_anomaly_fee 成本-异常费用
     */
    public BigDecimal getExpendAnomalyFee() {
        return expendAnomalyFee;
    }

    /**
     * 成本-异常费用
     * @param expendAnomalyFee 成本-异常费用
     */
    public void setExpendAnomalyFee(BigDecimal expendAnomalyFee) {
        this.expendAnomalyFee = expendAnomalyFee;
    }

    /**
     * 毛利
     * @return gross_profit 毛利
     */
    public BigDecimal getGrossProfit() {
        return grossProfit;
    }

    /**
     * 毛利
     * @param grossProfit 毛利
     */
    public void setGrossProfit(BigDecimal grossProfit) {
        this.grossProfit = grossProfit;
    }

    /**
     * 毛利率
     * @return gross_profit_rate 毛利率
     */
    public BigDecimal getGrossProfitRate() {
        return grossProfitRate;
    }

    /**
     * 毛利率
     * @param grossProfitRate 毛利率
     */
    public void setGrossProfitRate(BigDecimal grossProfitRate) {
        this.grossProfitRate = grossProfitRate;
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
     * 修改时间
     * @return modify_time 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改时间
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}