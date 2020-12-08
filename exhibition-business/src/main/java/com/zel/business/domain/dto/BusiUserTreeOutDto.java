package com.zel.business.domain.dto;

import com.zel.common.annotation.Excel;

import java.util.List;

public class BusiUserTreeOutDto {

    /** 部门ID */
    private Long deptId;

    /** 父部门ID */
    private Long parentId;

    /** 祖级列表 */
    private String ancestors;

    /** 部门名称 */
    private String deptName;

    /** 父部门名称 */
    private String parentName;

    /** 用户ID */
    @Excel(name = "用户序号", cellType = Excel.ColumnType.NUMERIC, prompt = "用户编号")
    private Long userId;

    /** 用户名称 */
    @Excel(name = "用户名称")
    private String userName;

    /** 部门信息 */
    List<BusiUserTreeOutDto> deptDto;

    /** 部门 */
    List<BusiUserTreeOutDto> dept;

    List<BusiUserTreeOutDto> user;

    public List<BusiUserTreeOutDto> getUser() {
        return user;
    }

    public void setUser(List<BusiUserTreeOutDto> user) {
        this.user = user;
    }

    public List<BusiUserTreeOutDto> getDept() {
        return dept;
    }

    public void setDept(List<BusiUserTreeOutDto> dept) {
        this.dept = dept;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }


//    public List<Long> getDeptId() {
//        return deptId;
//    }
//
//    public void setDeptId(List<Long> deptId) {
//        this.deptId = deptId;
//    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getAncestors() {
        return ancestors;
    }

    public void setAncestors(String ancestors) {
        this.ancestors = ancestors;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<BusiUserTreeOutDto> getDeptDto() {
        return deptDto;
    }

    public void setDeptDto(List<BusiUserTreeOutDto> deptDto) {
        this.deptDto = deptDto;
    }
}
