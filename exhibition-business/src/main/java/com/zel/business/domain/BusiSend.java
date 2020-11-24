package com.zel.business.domain;

import java.util.Date;

/**
 * 发货信息 busi_send
 * @author andy
 */
public class BusiSend {

    /**
     *发货单号
     */
    private String id;

    /**
     * 展会名称
     */
    private Integer exhibitionId;

    /**
     * 快递名称
     */
    private String logisticsName;

    /**
     * 快递单号
     */
    private String logisticsNumber;

    /**
     * 状态
     * （1：保存  2：已发货）
     */
    private Integer status;

    /**
     * 发货人
     */
    private String sendBy;

    /**
     * 发货时间
     */
    private Date sendTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getExhibitionId() {
        return exhibitionId;
    }

    public void setExhibitionId(Integer exhibitionId) {
        this.exhibitionId = exhibitionId;
    }

    public String getLogisticsName() {
        return logisticsName;
    }

    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName;
    }

    public String getLogisticsNumber() {
        return logisticsNumber;
    }

    public void setLogisticsNumber(String logisticsNumber) {
        this.logisticsNumber = logisticsNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSendBy() {
        return sendBy;
    }

    public void setSendBy(String sendBy) {
        this.sendBy = sendBy;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
}
