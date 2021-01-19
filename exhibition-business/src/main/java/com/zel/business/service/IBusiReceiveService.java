package com.zel.business.service;

import com.zel.business.domain.BusiReceive;
import com.zel.business.domain.BusiSend;

import java.util.List;

public interface IBusiReceiveService {

    /**
     * 查询收货列表
     * @param receive
     */
    List<BusiReceive> selectReceiveList(BusiReceive receive);

    List<BusiSend> selectLogisticsInfo();


    /**
     * 查询已发货信息
     */
    List<BusiSend> selectSendInfo(String logisticsNumber);
}
