package com.zel.business.mapper;

import com.zel.business.domain.BusiReceive;
import com.zel.business.domain.BusiSend;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusiReceiveMapper {

    /**
     * 查询收货列表
     * @param receive
     */
    List<BusiReceive> selectReceiveList(BusiReceive receive);

    /**
     * 查询已发货信息
     */
    List<BusiSend> selectSendInfo(@Param(value = "logisticsNumber") String logisticsNumber);

    List<BusiSend> selectLogisticsInfo();
}
