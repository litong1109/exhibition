package com.zel.business.domain;

import java.util.Date;

/**
 * 勘展 busi_prospect
 *
 * @author andy
 */
public class BusiProspect {

    private static final long serialVersionUID = 1L;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * 勘展ID
     */
    private Long urlId;

    /**
     * 展会ID
     */
    private Long exhibitionId;

    /**
     * 图片名称
     */
    private String fileName;

    /**
     * 勘展图片
     */
    private String prospectUrl;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    public Long getUrlId() {
        return urlId;
    }

    public void setUrlId(Long urlId) {
        this.urlId = urlId;
    }

    public Long getExhibitionId() {
        return exhibitionId;
    }

    public void setExhibitionId(Long exhibitionId) {
        this.exhibitionId = exhibitionId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getProspectUrl() {
        return prospectUrl;
    }

    public void setProspectUrl(String prospectUrl) {
        this.prospectUrl = prospectUrl;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public BusiProspect() {
        super();
    }

    public BusiProspect(Long exhibitionId, String fileName, String prospectUrl) {
        this.exhibitionId = exhibitionId;
        this.fileName = fileName;
        this.prospectUrl = prospectUrl;
    }

    @Override
    public String toString() {
        return "BusiProspect{" +
                "urlId=" + urlId +
                ", exhibitionId=" + exhibitionId +
                ", fileName='" + fileName + '\'' +
                ", prospectUrl='" + prospectUrl + '\'' +
                '}';
    }
}
