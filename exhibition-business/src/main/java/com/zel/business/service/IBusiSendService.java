package com.zel.business.service;

import com.zel.business.domain.BusiMaterial;
import com.zel.business.domain.BusiSend;
import com.zel.business.domain.BusiSendMaterialDetial;
import com.zel.business.domain.dto.BusiSendMaterialDto;
import com.zel.business.domain.dto.BusiUserTreeOutDto;
import com.zel.common.core.domain.Ztree;

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
    List<BusiSendMaterialDto> selectSendMaterialDetail(Long id, String materialName, String materialCode);

    /**
     * 保存发货信息
     */
    int saveSend(BusiSend busiSend);

    /**
     * 创建发货单号
     */
    String createSerialNumber();

    /**
     * 查询人员Tree
     */
    BusiUserTreeOutDto selectUserTree();

    /**
     * 发货单选择收货人员 组织树查询
     * 根据parentId 父级id 关联子集
     * @return
     */
    List<Ztree> sendZTree();
}
