package com.zel.business.service.impl;

import com.zel.business.domain.BusiReceive;
import com.zel.business.domain.BusiSend;
import com.zel.business.mapper.BusiReceiveMapper;
import com.zel.business.service.IBusiReceiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusiReceiveServiceImpl implements IBusiReceiveService {

    @Autowired
    private BusiReceiveMapper receiveMapper;

    /**
     * 查询收货列表
     * @param receive
     */
    @Override
    public List<BusiReceive> selectReceiveList(BusiReceive receive) {

        return receiveMapper.selectReceiveList(receive);
    }

    @Override
    public List<BusiSend> selectLogisticsInfo() {
        List<BusiSend> listInfo = receiveMapper.selectLogisticsInfo();
        for(BusiSend list : listInfo){

        }
        return null;
    }

    /**
     * 查询已发货信息
     */
    @Override
    public List<BusiSend> selectSendInfo(String logisticsNumber) {

        return receiveMapper.selectSendInfo(logisticsNumber);
    }
}
