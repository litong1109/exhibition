package com.zel.business.service;

import com.zel.business.domain.BusiSend;
import com.zel.business.domain.BusiSendMaterialDetial;

import java.util.List;

public interface IBusiSendService {

    /**
     * 获取发货列表
     * @param send 发货信息
     */
    List<BusiSend> selectSendList(BusiSend send);

    /**
     *查询发货物料明细
     * @param id
     */
    BusiSendMaterialDetial selectSendMaterialDetail(String id);
}
