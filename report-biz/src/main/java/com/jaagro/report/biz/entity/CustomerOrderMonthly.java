package com.jaagro.report.biz.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CustomerOrderMonthly {
    /**
     * 客户报表id
     */
    private Integer id;

    /**
     * 月份(yyyy-mm)
     */
    private String reportTime;

    /**
     * 客户id
     */
    private Integer customerId;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 订单总数
     */
    private Integer orderQuantity;

    /**
     * 运单总数
     */
    private Integer waybillQuantity;

    /**
     * 异常单数
     */
    private Integer anomalyWaybillQuantity;

    /**
     * 货物类型
     */
    private Integer goodsType;

    /**
     * 数量(单位)
     */
    private Integer amount;

    /**
     * 吨位(单位)
     */
    private BigDecimal tonnage;

    /**
     * 收入-运费
     */
    private BigDecimal incomeFreight;

    /**
     * 收入-异常费用
     */
    private BigDecimal incomeAnomalyCost;

    /**
     * 成本-运费
     */
    private BigDecimal expendFreight;

    /**
     * 成本-异常费用
     */
    private BigDecimal expendAnomalyCost;

    /**
     * 毛利
     */
    private BigDecimal grossProfit;

    /**
     * 毛利率
     */
    private BigDecimal grossProfitRate;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 客户报表id
     * @return id 客户报表id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 客户报表id
     * @param id 客户报表id
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
     * 客户id
     * @return customer_id 客户id
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * 客户id
     * @param customerId 客户id
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * 客户名称
     * @return customer_name 客户名称
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 客户名称
     * @param customerName 客户名称
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    /**
     * 订单总数
     * @return order_quantity 订单总数
     */
    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    /**
     * 订单总数
     * @param orderQuantity 订单总数
     */
    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    /**
     * 运单总数
     * @return waybill_quantity 运单总数
     */
    public Integer getWaybillQuantity() {
        return waybillQuantity;
    }

    /**
     * 运单总数
     * @param waybillQuantity 运单总数
     */
    public void setWaybillQuantity(Integer waybillQuantity) {
        this.waybillQuantity = waybillQuantity;
    }

    /**
     * 异常单数
     * @return anomaly_waybill_quantity 异常单数
     */
    public Integer getAnomalyWaybillQuantity() {
        return anomalyWaybillQuantity;
    }

    /**
     * 异常单数
     * @param anomalyWaybillQuantity 异常单数
     */
    public void setAnomalyWaybillQuantity(Integer anomalyWaybillQuantity) {
        this.anomalyWaybillQuantity = anomalyWaybillQuantity;
    }

    /**
     * 货物类型
     * @return goods_type 货物类型
     */
    public Integer getGoodsType() {
        return goodsType;
    }

    /**
     * 货物类型
     * @param goodsType 货物类型
     */
    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    /**
     * 数量(单位)
     * @return amount 数量(单位)
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * 数量(单位)
     * @param amount 数量(单位)
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * 吨位(单位)
     * @return tonnage 吨位(单位)
     */
    public BigDecimal getTonnage() {
        return tonnage;
    }

    /**
     * 吨位(单位)
     * @param tonnage 吨位(单位)
     */
    public void setTonnage(BigDecimal tonnage) {
        this.tonnage = tonnage;
    }

    /**
     * 收入-运费
     * @return income_freight 收入-运费
     */
    public BigDecimal getIncomeFreight() {
        return incomeFreight;
    }

    /**
     * 收入-运费
     * @param incomeFreight 收入-运费
     */
    public void setIncomeFreight(BigDecimal incomeFreight) {
        this.incomeFreight = incomeFreight;
    }

    /**
     * 收入-异常费用
     * @return income_anomaly_cost 收入-异常费用
     */
    public BigDecimal getIncomeAnomalyCost() {
        return incomeAnomalyCost;
    }

    /**
     * 收入-异常费用
     * @param incomeAnomalyCost 收入-异常费用
     */
    public void setIncomeAnomalyCost(BigDecimal incomeAnomalyCost) {
        this.incomeAnomalyCost = incomeAnomalyCost;
    }

    /**
     * 成本-运费
     * @return expend_freight 成本-运费
     */
    public BigDecimal getExpendFreight() {
        return expendFreight;
    }

    /**
     * 成本-运费
     * @param expendFreight 成本-运费
     */
    public void setExpendFreight(BigDecimal expendFreight) {
        this.expendFreight = expendFreight;
    }

    /**
     * 成本-异常费用
     * @return expend_anomaly_cost 成本-异常费用
     */
    public BigDecimal getExpendAnomalyCost() {
        return expendAnomalyCost;
    }

    /**
     * 成本-异常费用
     * @param expendAnomalyCost 成本-异常费用
     */
    public void setExpendAnomalyCost(BigDecimal expendAnomalyCost) {
        this.expendAnomalyCost = expendAnomalyCost;
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