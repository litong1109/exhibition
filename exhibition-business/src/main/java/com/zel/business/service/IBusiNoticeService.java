package com.zel.business.service;

import com.zel.business.domain.BusiSend;
import com.zel.business.domain.dto.BusiNoticeOutDto;
import com.zel.business.service.impl.BusiNoticeServiceImpl;

import java.util.List;

public interface IBusiNoticeService {


    /**
     * 加载到货通知列列表
     */
    List<BusiNoticeOutDto> selectNoticeList(BusiSend send);
}
