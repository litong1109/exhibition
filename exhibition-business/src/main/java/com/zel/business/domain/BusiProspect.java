package com.zel.business.domain;

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
     * 勘展图片
     */
    private String prospectUrl;

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

    public String getProspectUrl() {
        return prospectUrl;
    }

    public void setProspectUrl(String prospectUrl) {
        this.prospectUrl = prospectUrl;
    }
}
