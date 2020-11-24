package com.zel.business.domain;

import java.util.Date;

/**
 * 发货物料明细 busi_send_material_detail
 * @author andy
 */
public class BusiSendMaterialDetial {


    /**
     * 单据ID
     */
    private String asnOrderId;

    /**
     * 物料ID
     */
    private Long materialId;

    /**
     * 发货数量
     */
    private Integer sendQuantity;

    /**
     * 备注
     */
    private String remark;



    /**
     * 创建人
     */
    private String creatBy;

    /**
     * 创建时间
     */
    private Date creatTime;

    public String getAsnOrderId() {
        return asnOrderId;
    }

    public void setAsnOrderId(String asnOrderId) {
        this.asnOrderId = asnOrderId;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public Integer getSendQuantity() {
        return sendQuantity;
    }

    public void setSendQuantity(Integer sendQuantity) {
        this.sendQuantity = sendQuantity;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreatBy() {
        return creatBy;
    }

    public void setCreatBy(String creatBy) {
        this.creatBy = creatBy;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }
}
