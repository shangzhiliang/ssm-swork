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
public class PdmsSortingCenterArea extends QueryParam implements Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//date formats
	
	//columns START
	/** id  db_column: id */	
	protected Long id;
	/** 系统编码  db_column: sys_code */	
	protected String sysCode;
	/** 储区代码(A-Z)  db_column: code */	
	protected String code;
	/** 显示编码  db_column: show_code */	
	protected String showCode;
	/** 库(大区)储区代码A-Z  db_column: region_code */	
	protected String regionCode;
	/** 储区名称  db_column: name */	
	protected String name;
	/** 7：分拣区 12 :退获区 3 收货区  db_column: type */	
	protected Byte type;
	/** 是否投线(0 否 1 是)  db_column: is_throw_line */	
	protected Byte isThrowLine;
	/** 1：常温 2：冷冻 3：冷藏 4：恒温  db_column: temperature_layer */	
	protected Byte temperatureLayer;
	/** 分拣中心id  db_column: sorting_center_id */	
	protected Long sortingCenterId;
	/** 可用状态0：禁用1：启用；2：占用  db_column: status */	
	protected Byte status;
	/** 创建人  db_column: creater */	
	protected Long creater;
	/** 创建时间  db_column: c_t */	
	protected Integer ct;
	/** 编辑人  db_column: updater */	
	protected Long updater;
	/** 更新时间  db_column: u_t */	
	protected Integer ut;
	/** 更新人名称  db_column: updaterName */	
	protected String updaterName;
	/** 备注  db_column: remark */	
	protected String remark;
	/** 删除标识0：否，1：是  db_column: is_deleted */	
	protected Byte isDeleted=0;
	//columns END

	public PdmsSortingCenterArea(){
	}
	public PdmsSortingCenterArea(Long id){
	    this.id = id;
	}
	public PdmsSortingCenterArea(String code){
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
	
	public String getRegionCode() {
		return this.regionCode;
	}
	public void setRegionCode(String value) {
		this.regionCode = value;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String value) {
		this.name = value;
	}
	
	public Byte getType() {
		return this.type;
	}
	public void setType(Byte value) {
		this.type = value;
	}
	
	public Byte getIsThrowLine() {
		return this.isThrowLine;
	}
	public void setIsThrowLine(Byte value) {
		this.isThrowLine = value;
	}
	
	public Byte getTemperatureLayer() {
		return this.temperatureLayer;
	}
	public void setTemperatureLayer(Byte value) {
		this.temperatureLayer = value;
	}
	
	public Long getSortingCenterId() {
		return this.sortingCenterId;
	}
	public void setSortingCenterId(Long value) {
		this.sortingCenterId = value;
	}
	
	public Byte getStatus() {
		return this.status;
	}
	public void setStatus(Byte value) {
		this.status = value;
	}
	
	public Long getCreater() {
		return this.creater;
	}
	public void setCreater(Long value) {
		this.creater = value;
	}
	
	public Integer getCt() {
		return this.ct;
	}
	public void setCt(Integer value) {
		this.ct = value;
	}
	
	public Long getUpdater() {
		return this.updater;
	}
	public void setUpdater(Long value) {
		this.updater = value;
	}
	
	public Integer getUt() {
		return this.ut;
	}
	public void setUt(Integer value) {
		this.ut = value;
	}
	
	public String getUpdaterName() {
		return this.updaterName;
	}
	public void setUpdaterName(String value) {
		this.updaterName = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String value) {
		this.remark = value;
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

