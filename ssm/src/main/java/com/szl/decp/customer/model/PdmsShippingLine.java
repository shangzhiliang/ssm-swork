package com.szl.decp.customer.model;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * Title: <br>
 * Description: <br>
 * Copyright: Copyright (c) 2016<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 * 
 * @codeGenerator meicai.v20
 * @author szl
 * @date 2016-9
 */
public class PdmsShippingLine extends QueryParam implements Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//date formats
	
	//columns START
	/** id  db_column: id */	
	protected Long id;
	/** 系统编码  db_column: sys_code */	
	protected String sysCode;
	/** 集货排顺序号  db_column: code */	
	protected String code;
	/** 显示集货排号  db_column: show_code */	
	protected String showCode;
	/** 分拣中心区域显示编码  db_column: sorting_center_area_show_code */	
	protected String sortingCenterAreaShowCode;
	/** 分拣中心id  db_column: sorting_center_id */	
	protected Long sortingCenterId;
	/** 库(大区)  db_column: region_code */	
	protected String regionCode;
	/** 分拣中心区域id  db_column: sorting_center_area_id */	
	protected Long sortingCenterAreaId;
	/** 默认发货位  db_column: f_loc */	
	protected Long floc;
	/** 货位类型，1 分拣 2.退货 3，收货  db_column: type */	
	protected Byte type;
	/** 货位数量  db_column: loc_num */	
	protected Integer locNum;
	/** 可用状态0：禁用1：启用；2：占用  db_column: status */	
	protected Byte status;
	/** 创建时间  db_column: c_t */	
	protected Integer ct;
	/** 创建人  db_column: creater */	
	protected Long creater;
	/** 更新时间  db_column: u_t */	
	protected Integer ut;
	/** 更新人  db_column: updater */	
	protected Long updater;
	/** 更新人名称  db_column: updaterName */	
	protected String updaterName;
	/** 是否删除标识 0-否, 1-是  db_column: is_deleted */	
	protected Byte isDeleted=0;
	//columns END

	public PdmsShippingLine(){
	}
	public PdmsShippingLine(Long id){
	    this.id = id;
	}
	public PdmsShippingLine(String code){
	    this.code = code;
	}
	public Long getId() {
		return this.id;
	}
	public void setId(Long value) {
		this.id = value;
	}
	
	public String getSysCode() {
		return this.sysCode;
	}
	public void setSysCode(String value) {
		this.sysCode = value;
	}
	
	public String getCode() {
		return this.code;
	}
	public void setCode(String value) {
		this.code = value;
	}
	
	public String getShowCode() {
		return this.showCode;
	}
	public void setShowCode(String value) {
		this.showCode = value;
	}
	
	public String getSortingCenterAreaShowCode() {
		return this.sortingCenterAreaShowCode;
	}
	public void setSortingCenterAreaShowCode(String value) {
		this.sortingCenterAreaShowCode = value;
	}
	
	public Long getSortingCenterId() {
		return this.sortingCenterId;
	}
	public void setSortingCenterId(Long value) {
		this.sortingCenterId = value;
	}
	
	public String getRegionCode() {
		return this.regionCode;
	}
	public void setRegionCode(String value) {
		this.regionCode = value;
	}
	
	public Long getSortingCenterAreaId() {
		return this.sortingCenterAreaId;
	}
	public void setSortingCenterAreaId(Long value) {
		this.sortingCenterAreaId = value;
	}
	
	public Long getFloc() {
		return this.floc;
	}
	public void setFloc(Long value) {
		this.floc = value;
	}
	
	public Byte getType() {
		return this.type;
	}
	public void setType(Byte value) {
		this.type = value;
	}
	
	public Integer getLocNum() {
		return this.locNum;
	}
	public void setLocNum(Integer value) {
		this.locNum = value;
	}
	
	public Byte getStatus() {
		return this.status;
	}
	public void setStatus(Byte value) {
		this.status = value;
	}
	
	public Integer getCt() {
		return this.ct;
	}
	public void setCt(Integer value) {
		this.ct = value;
	}
	
	public Long getCreater() {
		return this.creater;
	}
	public void setCreater(Long value) {
		this.creater = value;
	}
	
	public Integer getUt() {
		return this.ut;
	}
	public void setUt(Integer value) {
		this.ut = value;
	}
	
	public Long getUpdater() {
		return this.updater;
	}
	public void setUpdater(Long value) {
		this.updater = value;
	}
	
	public String getUpdaterName() {
		return this.updaterName;
	}
	public void setUpdaterName(String value) {
		this.updaterName = value;
	}
	
	public Byte getIsDeleted() {
		return this.isDeleted;
	}
	public void setIsDeleted(Byte value) {
		this.isDeleted = value;
	}
	

	@Override
	public String toString() {
	    return JSON.toJSONString(this);
	}
}

