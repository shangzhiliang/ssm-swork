package com.szl.decp.customer.dao;

import java.util.List;

import com.szl.decp.customer.model.PdmsOrderReceiveInfo;


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
public interface PdmsOrderReceiveInfoDao{
	 /**
     * 增加
     * 
     * @author LiRuigui 2015�?11�?20�?
     * @param t
     *            要增加的对象
     * @return 0:失败;1:成功
     */
    public int insert(PdmsOrderReceiveInfo t);

    /**
     * 删除
     * 
     * @author LiRuigui 2015�?11�?20�?
     * @param t
     *            要删除的对象
     * @return 0:失败;1:成功
     */
    public int delete(PdmsOrderReceiveInfo t);

    /**
     * 硬删�?
     * 
     * @author LiRuigui 2015�?11�?20�?
     * @param t
     *            要删除的对象,必需主键字段
     * @return 0:失败;1:成功
     */
//    public int hardDelete(PdmsOrderReceiveInfo t);

    /**
     * 按主键查�?
     * 
     * @author LiRuigui 2015�?11�?20�?
     * @param p
     *            过虑参数
     * @return 0:失败;1:成功
     */
    public int selectByPrimaryKey(PdmsOrderReceiveInfo t);

    /**
     * 查询条数
     * 
     * @author LiRuigui 2015�?11�?20�?
     * @param p
     * @return
     */
    public long count(PdmsOrderReceiveInfo p);

    /**
     * 按表XXX列查询集�?
     * 
     * @author LiRuigui 2015�?11�?20�?
     * @param p
     *            参数内必�?字段：columnName(数据库表的列�?);list(要查询的数据数组 )
     * @return 集合
     */
    public List<PdmsOrderReceiveInfo> selectByColumn(PdmsOrderReceiveInfo p);

    /**
     * 查询集合
     * 
     * @author LiRuigui 2015�?11�?20�?
     * @param p
     *            查询时的过虑条件
     * @return 集合
     */
    public List<PdmsOrderReceiveInfo> queryList(PdmsOrderReceiveInfo p);

    /**
     * 批量增加
     * 
     * @author LiRuigui 2015�?11�?20�?
     * @param list
     *            要增加的对象集合
     * @return 成功增加的行�?
     */
    public int batchInsert(List<PdmsOrderReceiveInfo> list);

    /**
     * 批量删除
     * 
     * @author LiRuigui 2015�?11�?20�?
     * @param p
     *            参数内必�?：要删除的对象主键的集合
     * @return 0:失败;1:成功
     */
    public int batchDelete(PdmsOrderReceiveInfo p);

    /**
     * 批量更新
     * 
     * @author LiRuigui 2015�?11�?20�?
     * @param list
     *            要新的对象集�?
     * @return 0:失败;1:成功
     */
    public int batchUpdate(List<PdmsOrderReceiveInfo> list);

}
