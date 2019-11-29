package com.injured.project.system.role.domain;

import java.util.List;

import com.injured.framework.web.domain.Ztree;

/**
 * 用户菜单-机构-金额权限表
 * 
 * @author ly
 */
public class SysUserAgencyPriceVo {

    /** 菜单id */
    private Long menuId;

    /** 金额权限范围 */
    private List<Ztree> ztreeList;
    
    /** 机构名字 */
    private List<String> nameList;
    
    /** 机构id */
    private List<Long> idList;


	public List<Ztree> getZtreeList() {
		return ztreeList;
	}

	public void setZtreeList(List<Ztree> ztreeList) {
		this.ztreeList = ztreeList;
	}

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	public List<Long> getIdList() {
		return idList;
	}

	public void setIdList(List<Long> idList) {
		this.idList = idList;
	}

}