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
    private String sendMaterialDetailId;

    /**
     * 发货ID
     */
    private Long sendId;

    /**
     * 发货数量
     */
    private Integer sendQuantity;

    /**
     * 物料ID
     */
    private Long materialId;

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

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;



}
