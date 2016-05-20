package com.szl.decp.common.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import com.szl.decp.customer.model.User;

/**
 * @author lx
 *
 */
public abstract class AbstractMybatisDao extends SqlSessionDaoSupport {
	
	@Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){  
        super.setSqlSessionFactory(sqlSessionFactory);  
    }
	
	protected SqlSession getSqlSessionTemplate() { return getSqlSession(); }
	
	protected abstract String getIbatisMapperNamesapce();
	
	public int deleteByPrimaryKey(Integer id) {
		return getSqlSession().delete(getIbatisMapperNamesapce()+".deleteByPrimaryKey");
	}

	
	public int insert(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public int insertSelective(User record) {
		return getSqlSession().selectOne(getIbatisMapperNamesapce()+".");
	}

	
	public User selectByPrimaryKey(Integer id) {
		return getSqlSession().selectOne(getIbatisMapperNamesapce()+".selectByPrimaryKey",id);
	}

	
	public int updateByPrimaryKeySelective(User record) {
		return 0;
	}

	
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
