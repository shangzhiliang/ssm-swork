package com.szl.decp.customer.model;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * Title: <br>
 * Description: <br>
 * Copyright: Copyright (c) 2016<br>
 * Company: 北京云杉世界信息�?术有限公�?<br>
 * 
 * @codeGenerator meicai.v20
 * @author szl
 * @date 2016-9
 */
public class PdmsOrderReceiveInfo extends QueryParam implements Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//date formats
	
	//columns START
	/** 唯一id  db_column: id */	
	protected Long id;
	/** 订单编号  db_column: order_no */	
	protected String orderNo;
	/** 收货客户ID  db_column: receive_customer_id */	
	protected Long receiveCustomerId;
	/** 收货客户名称  db_column: receive_customer_name */	
	protected String receiveCustomerName;
	/** 收货客户类型:1美菜  db_column: receive_customer_type */	
	protected Byte receiveCustomerType;
	/** 收货人姓�?  db_column: receiver_name */	
	protected String receiverName;
	/** 收货人电�?  db_column: receiver_phone */	
	protected String receiverPhone;
	/** 收货人行政省id  db_column: gov_province_code */	
	protected String govProvinceCode;
	/** 收货人行政省名称  db_column: gov_province_name */	
	protected String govProvinceName;
	/** 收货人行政市id  db_column: gov_city_code */	
	protected String govCityCode;
	/** 收货人行政市名称  db_column: gov_city_name */	
	protected String govCityName;
	/** 收货人行政区县id  db_column: gov_county_code */	
	protected String govCountyCode;
	/** 收货人行政区县名�?  db_column: gov_county_name */	
	protected String govCountyName;
	/** 收货人详细地�?  db_column: gov_address */	
	protected String govAddress;
	/** 收货人经�?  db_column: receive_longitude */	
	protected String receiveLongitude;
	/** 收货人纬�?  db_column: receive_latitude */	
	protected String receiveLatitude;
	/** 城市id  db_column: city_id */	
	protected Long cityId;
	/** 删除标记:0未删�?1已删�?  db_column: is_deleted */	
	protected Integer isDeleted=0;
	/** 创建时间  db_column: c_t */	
	protected Integer ct;
	/** 更新时间  db_column: u_t */	
	protected Integer ut;
	/** 创建用户id  db_column: create_user */	
	protected Long createUser;
	/** 修改用户id  db_column: update_user */	
	protected Long updateUser;
	//columns END

	public PdmsOrderReceiveInfo(){
	}
	public PdmsOrderReceiveInfo(Long id){
	    this.id = id;
	}
	public Long getId() {
		return this.id;
	}
	public void setId(Long value) {
		this.id = value;
	}
	
	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String value) {
		this.orderNo = value;
	}
	
	public Long getReceiveCustomerId() {
		return this.receiveCustomerId;
	}
	public void setReceiveCustomerId(Long value) {
		this.receiveCustomerId = value;
	}
	
	public String getReceiveCustomerName() {
		return this.receiveCustomerName;
	}
	public void setReceiveCustomerName(String value) {
		this.receiveCustomerName = value;
	}
	
	public Byte getReceiveCustomerType() {
		return this.receiveCustomerType;
	}
	public void setReceiveCustomerType(Byte value) {
		this.receiveCustomerType = value;
	}
	
	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String value) {
		this.receiverName = value;
	}
	
	public String getReceiverPhone() {
		return this.receiverPhone;
	}
	public void setReceiverPhone(String value) {
		this.receiverPhone = value;
	}
	
	public String getGovProvinceCode() {
		return this.govProvinceCode;
	}
	public void setGovProvinceCode(String value) {
		this.govProvinceCode = value;
	}
	
	public String getGovProvinceName() {
		return this.govProvinceName;
	}
	public void setGovProvinceName(String value) {
		this.govProvinceName = value;
	}
	
	public String getGovCityCode() {
		return this.govCityCode;
	}
	public void setGovCityCode(String value) {
		this.govCityCode = value;
	}
	
	public String getGovCityName() {
		return this.govCityName;
	}
	public void setGovCityName(String value) {
		this.govCityName = value;
	}
	
	public String getGovCountyCode() {
		return this.govCountyCode;
	}
	public void setGovCountyCode(String value) {
		this.govCountyCode = value;
	}
	
	public String getGovCountyName() {
		return this.govCountyName;
	}
	public void setGovCountyName(String value) {
		this.govCountyName = value;
	}
	
	public String getGovAddress() {
		return this.govAddress;
	}
	public void setGovAddress(String value) {
		this.govAddress = value;
	}
	
	public String getReceiveLongitude() {
		return this.receiveLongitude;
	}
	public void setReceiveLongitude(String value) {
		this.receiveLongitude = value;
	}
	
	public String getReceiveLatitude() {
		return this.receiveLatitude;
	}
	public void setReceiveLatitude(String value) {
		this.receiveLatitude = value;
	}
	
	public Long getCityId() {
		return this.cityId;
	}
	public void setCityId(Long value) {
		this.cityId = value;
	}
	
	public Integer getIsDeleted() {
		return this.isDeleted;
	}
	public void setIsDeleted(Integer value) {
		this.isDeleted = value;
	}
	
	public Integer getCt() {
		return this.ct;
	}
	public void setCt(Integer value) {
		this.ct = value;
	}
	
	public Integer getUt() {
		return this.ut;
	}
	public void setUt(Integer value) {
		this.ut = value;
	}
	
	public Long getCreateUser() {
		return this.createUser;
	}
	public void setCreateUser(Long value) {
		this.createUser = value;
	}
	
	public Long getUpdateUser() {
		return this.updateUser;
	}
	public void setUpdateUser(Long value) {
		this.updateUser = value;
	}
	

	@Override
	public String toString() {
	    return JSON.toJSONString(this);
	}
}

