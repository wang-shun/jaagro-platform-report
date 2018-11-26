package com.jaagro.report.biz.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DepartOrderDaily {
    /**
     * 订单数据报表id
     */
    private Integer id;

    /**
     * 日期(yyyy-mm-dd)
     */
    private String reportTime;

    /**
     * 项目部名称
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
     * 订单总数
     */
    private Integer totalOrderQuantity;

    /**
     * 运单总数
     */
    private Integer totalWaybillQuantity;

    /**
     * 完成运单数
     */
    private Integer completeWaybillQuantity;

    /**
     * 异常运单数
     */
    private Integer anomalyWaybillQuantity;

    /**
     * 拒单量
     */
    private Integer refuseWaybillQuantity;

    /**
     * 货物数量
     */
    private Integer goodsQuantity;

    /**
     * 货物重量
     */
    private BigDecimal goodsWeight;

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
     * 订单数据报表id
     * @return id 订单数据报表id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 订单数据报表id
     * @param id 订单数据报表id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 日期(yyyy-mm-dd)
     * @return report_time 日期(yyyy-mm-dd)
     */
    public String getReportTime() {
        return reportTime;
    }

    /**
     * 日期(yyyy-mm-dd)
     * @param reportTime 日期(yyyy-mm-dd)
     */
    public void setReportTime(String reportTime) {
        this.reportTime = reportTime == null ? null : reportTime.trim();
    }

    /**
     * 项目部名称
     * @return department_name 项目部名称
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * 项目部名称
     * @param departmentName 项目部名称
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
     * 订单总数
     * @return total_order_quantity 订单总数
     */
    public Integer getTotalOrderQuantity() {
        return totalOrderQuantity;
    }

    /**
     * 订单总数
     * @param totalOrderQuantity 订单总数
     */
    public void setTotalOrderQuantity(Integer totalOrderQuantity) {
        this.totalOrderQuantity = totalOrderQuantity;
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