package com.zel.business.mapper;

import com.zel.business.domain.BusiSend;
import com.zel.business.domain.BusiSendMaterialDetial;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BusiSendMapper {

    /**
     * 获取发货列表
     * @param send 发货信息
     */
    List<BusiSend> selectSendList(BusiSend send);

    /**
     *查询发货物料明细
     * @param id
     */
    BusiSendMaterialDetial selectSendMaterialDetail(@Param(value = "id") String id);
}
