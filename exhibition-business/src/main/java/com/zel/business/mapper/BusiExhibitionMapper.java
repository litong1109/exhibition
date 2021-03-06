package com.zel.business.mapper;

import com.zel.business.domain.BusiExhibition;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusiExhibitionMapper {

    /**
     * 检验展会名称是否唯一
     * @param exhibitionName 展会名称
     */
    int checkExhibitionNameUnique(@Param(value = "exhibitionName") String exhibitionName);

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
    BusiExhibition selectExhibitionById(@Param(value = "exhibitionId") Long exhibitionId);

    /**
     * 保存修改展会信息
     * @param exhibition 展会信息
     */
    int updateExhibition(BusiExhibition exhibition);

  /**
   * 删除展会
   * @param exhibitionIds 展会ID
   */
    int deleteExhibition(@Param(value = "exhibitionIds") Long[] exhibitionIds);
}
