package com.szl.decp.customer.manager;

import java.util.List;

import com.szl.decp.customer.model.PdmsShippingLocation;

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
public interface PdmsShippingLocationManager {
	 /**
     * 按主键查�?
     * 
     * @author LiRuigui 2015�?11�?20�?
     * @param p
     *            过虑参数
     * @return 0:失败;1:成功
     */
    public int selectByPrimaryKey(PdmsShippingLocation t);

    /**
     * 查询条数
     * 
     * @author LiRuigui 2015�?11�?20�?
     * @param p
     * @return
     */
    public long count(PdmsShippingLocation p);

    /**
     * 按表XXX列查询集�?
     * 
     * @author LiRuigui 2015�?11�?20�?
     * @param p
     *            参数内必�?字段：columnName(数据库表的列�?);list(要查询的数据数组 )
     * @return 集合
     */
    public List<PdmsShippingLocation> selectByColumn(PdmsShippingLocation p);

    /**
     * 查询集合
     * 
     * @author LiRuigui 2015�?11�?20�?
     * @param p
     *            查询时的过虑条件
     * @return 集合
     */
    public List<PdmsShippingLocation> queryList(PdmsShippingLocation p);
}
