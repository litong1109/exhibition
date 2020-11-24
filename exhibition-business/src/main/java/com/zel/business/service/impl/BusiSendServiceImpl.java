package com.zel.business.service.impl;

import com.zel.business.domain.BusiSend;
import com.zel.business.domain.BusiSendMaterialDetial;
import com.zel.business.mapper.BusiSendMapper;
import com.zel.business.service.IBusiSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusiSendServiceImpl implements IBusiSendService {

    @Autowired
    private BusiSendMapper sendMapper;

    /**
     * 获取发货列表
     * @param send 发货信息
     */
    @Override
    public List<BusiSend> selectSendList(BusiSend send) {
        return sendMapper.selectSendList(send);
    }

    /**
     *查询发货物料明细
     * @param id
     */
    @Override
    public BusiSendMaterialDetial selectSendMaterialDetail(String id) {
        BusiSendMaterialDetial detial = sendMapper.selectSendMaterialDetail(id);
        return detial;
    }
}
