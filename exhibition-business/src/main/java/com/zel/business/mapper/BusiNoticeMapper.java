package com.zel.business.mapper;

import com.zel.business.domain.BusiSend;
import com.zel.business.domain.dto.BusiNoticeOutDto;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BusiNoticeMapper {

    /**
     * 加载到货通知列列表
     */
    List<BusiNoticeOutDto> selectNoticeList(BusiSend send);
}
