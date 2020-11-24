package com.zel.business.service;

import com.zel.business.domain.BusiExhibition;
import com.zel.business.domain.BusiProspect;
import com.zel.common.annotation.Log;
import com.zel.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface IBusiExhibitionService {

    /**
     * 检验展会名称是否唯一
     * @param exhibition
     */
    String checkExhibitionNameUnique(BusiExhibition exhibition);

    /**
     * 保存新增展会
     * @param exhibition 展会信息
     */
    int insertExhibition(BusiExhibition exhibition);


    /**
     * 获取展会列表
     * @param exhibition 展会信息
     */
    List<BusiExhibition> selectExhibitionList(BusiExhibition exhibition);

    /**
     * 根据展会ID查询展会信息
     * @param exhibitionId 展会ID
     */
    BusiExhibition selectExhibitionById(Long exhibitionId);

    /**
     * 查询勘展信息
     * @param exhibitionId 展会ID
     */
    BusiExhibition selectProspect(Long exhibitionId);

    /**
     * 保存修改展会信息
     * @param exhibition 展会信息
     */
    int updateExhibition(BusiExhibition exhibition);

    /**
     * 删除展会
     * @param exhibitionIds 展会ID
     */
    int deleteExhibition(Long[] exhibitionIds);

    /**
     * 保存勘展图片

     */
    int insertProspectUrl(BusiProspect busiProspect);



    /**
     * 删除勘展图片
     * 根据 urlId
     * @param urlId
     */
    void deleteProspectUrl(Long urlId);

    /**
     * 更新展会状态
     * @param exhibitionId 展会ID
     */
    int updateStatus(Long exhibitionId);

    /**
     * 查询勘展图片
     * @param urlId
     * @param exhibitionId
     * @return
     */
    BusiProspect findProspectUrl(Long urlId, Long exhibitionId);

    /**
     * 查询展会名称集合
     * @param
     */
    List<BusiExhibition> selectExhibitionIdList();
}
