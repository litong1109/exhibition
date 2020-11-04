package com.zel.business.service.impl;

import com.zel.business.domain.BusiExhibition;
import com.zel.business.domain.BusiMaterial;
import com.zel.business.mapper.BusiExhibitionMapper;
import com.zel.business.service.IBusiExhibitionService;
import com.zel.common.constant.UserConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusiExhibitionServiceImpl implements IBusiExhibitionService {
    @Autowired
    private BusiExhibitionMapper exhibitionMapper;

    /**
     * 检验展会名称是否唯一
     * @param exhibition 展会信息
     */
    @Override
    public String checkExhibitionNameUnique(BusiExhibition exhibition) {

        int count = exhibitionMapper.checkExhibitionNameUnique(exhibition);

        if (count> 0) {
            return UserConstants.EXHIBITION_NAME_NOT_UNIQUE;
        }else {
            return UserConstants.EXHIBITION_NAME_UNIQUE;
        }

    }

    /**
     * 保存新增展会
     * @param exhibition 展会信息
     */
    @Override
    public int insertExhibition(BusiExhibition exhibition) {
        return exhibitionMapper.insertExhibition(exhibition);
    }

    /**
     * 获取展会列表
     * @param exhibition 展会信息
     */
    @Override
    public List<BusiExhibition> selectExhibitionList(BusiExhibition exhibition) {
        return exhibitionMapper.selectExhibitionList(exhibition);
    }

    /**
     * 根据展会ID查询展会信息
     * @param exhibitionId 展会ID
     */
    @Override
    public BusiExhibition selectExhibitionById(Long exhibitionId) {
        return exhibitionMapper.selectExhibitionById(exhibitionId);
    }

    /**
     * 保存修改展会信息
     * @param exhibition 展会信息
     */
    @Override
    public int updateExhibition(BusiExhibition exhibition) {
        return exhibitionMapper.updateExhibition(exhibition);
    }

    /**
     * 删除展会
     * @param exhibitionIds 展会ID
     */
    @Override
    public int deleteExhibition(Long[] exhibitionIds) {
        return exhibitionMapper.deleteExhibition(exhibitionIds);
    }
}
