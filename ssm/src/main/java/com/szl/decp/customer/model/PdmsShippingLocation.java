package com.szl.decp.customer.model;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;
import java.math.BigDecimal;

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
public class PdmsShippingLocation extends QueryParam implements Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//date formats
	
	//columns START
	/** 主键  db_column: id */	
	protected Long id;
	/** 系统编码  db_column: sys_code */	
	protected String sysCode;
	/** 货位编号  db_column: code */	
	protected String code;
	/** 归属分拣中心id  db_column: sorting_center_id */	
	protected Long sortingCenterId;
	/** 显示编码  db_column: show_code */	
	protected String showCode;
	/** 大区编号  db_column: region_code */	
	protected String regionCode;
	/** 集货排id  db_column: shipping_line_id */	
	protected Long shippingLineId;
	/** 分拣区域id  db_column: sorting_center_area_id */	
	protected Long sortingCenterAreaId;
	/** 层  db_column: layer */	
	protected String layer;
	/** 列  db_column: line */	
	protected String line;
	/** 纵深(保留位)  db_column: deep */	
	protected String deep;
	/** 货位顺序  db_column: sorting_order */	
	protected Integer sortingOrder;
	/** 规格：长*宽*高  db_column: specification */	
	protected String specification;
	/** 承重  db_column: bearing_weight */	
	protected Integer bearingWeight;
	/** 可用状态(0：禁用1：启用；2：占用)  db_column: status */	
	protected Byte status;
	/** 货位类型（1：分拣 2 退货 3 收货）  db_column: type */	
	protected Byte type;
	/** 是否限制体积 0：限制；1：不限制  db_column: volume_limit */	
	protected Byte volumeLimit;
	/** 是否限制重量 0：不限制;其他：具体限制值  db_column: weight_limit */	
	protected BigDecimal weightLimit;
	/** 是否限制数量 0：不限制;其他:具体限制值  db_column: quantity_limit */	
	protected Integer quantityLimit;
	/** 长度  db_column: length */	
	protected Integer length;
	/** 宽度  db_column: width */	
	protected Integer width;
	/** 高度  db_column: height */	
	protected Integer height;
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

	public PdmsShippingLocation(){
	}
	public PdmsShippingLocation(Long id){
	    this.id = id;
	}
	public PdmsShippingLocation(String code){
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
	
	public Long getSortingCenterId() {
		return this.sortingCenterId;
	}
	public void setSortingCenterId(Long value) {
		this.sortingCenterId = value;
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
	
	public Long getShippingLineId() {
		return this.shippingLineId;
	}
	public void setShippingLineId(Long value) {
		this.shippingLineId = value;
	}
	
	public Long getSortingCenterAreaId() {
		return this.sortingCenterAreaId;
	}
	public void setSortingCenterAreaId(Long value) {
		this.sortingCenterAreaId = value;
	}
	
	public String getLayer() {
		return this.layer;
	}
	public void setLayer(String value) {
		this.layer = value;
	}
	
	public String getLine() {
		return this.line;
	}
	public void setLine(String value) {
		this.line = value;
	}
	
	public String getDeep() {
		return this.deep;
	}
	public void setDeep(String value) {
		this.deep = value;
	}
	
	public Integer getSortingOrder() {
		return this.sortingOrder;
	}
	public void setSortingOrder(Integer value) {
		this.sortingOrder = value;
	}
	
	public String getSpecification() {
		return this.specification;
	}
	public void setSpecification(String value) {
		this.specification = value;
	}
	
	public Integer getBearingWeight() {
		return this.bearingWeight;
	}
	public void setBearingWeight(Integer value) {
		this.bearingWeight = value;
	}
	
	public Byte getStatus() {
		return this.status;
	}
	public void setStatus(Byte value) {
		this.status = value;
	}
	
	public Byte getType() {
		return this.type;
	}
	public void setType(Byte value) {
		this.type = value;
	}
	
	public Byte getVolumeLimit() {
		return this.volumeLimit;
	}
	public void setVolumeLimit(Byte value) {
		this.volumeLimit = value;
	}
	
	public BigDecimal getWeightLimit() {
		return this.weightLimit;
	}
	public void setWeightLimit(BigDecimal value) {
		this.weightLimit = value;
	}
	
	public Integer getQuantityLimit() {
		return this.quantityLimit;
	}
	public void setQuantityLimit(Integer value) {
		this.quantityLimit = value;
	}
	
	public Integer getLength() {
		return this.length;
	}
	public void setLength(Integer value) {
		this.length = value;
	}
	
	public Integer getWidth() {
		return this.width;
	}
	public void setWidth(Integer value) {
		this.width = value;
	}
	
	public Integer getHeight() {
		return this.height;
	}
	public void setHeight(Integer value) {
		this.height = value;
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

