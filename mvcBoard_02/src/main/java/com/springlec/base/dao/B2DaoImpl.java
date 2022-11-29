package com.springlec.base.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.springlec.base.model.B2Dto;

public class B2DaoImpl implements B2Dao {

	
	SqlSession sqlSession;
	
	public static String nameSpace = "com.springlec.base.dao.B2Dao";
	
	@Override
	public List<B2Dto> listDao() throws Exception {
		return sqlSession.selectList(nameSpace + ".listDao");
	}

}
