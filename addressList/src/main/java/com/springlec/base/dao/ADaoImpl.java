package com.springlec.base.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.springlec.base.model.ADto;

public class ADaoImpl implements ADao {

	SqlSession sqlSession;
	
	public static String nameSpace = "com.springlec.base.dao.ADao";
	
	@Override
	public List<ADto> listDao() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(nameSpace+".listDao");
	}

	@Override
	public void writeDao(String aName, String aContent, String aAddress, String aEmail, String aRelation)
			throws Exception {
		sqlSession.insert(nameSpace+".writeDao");
	}

	@Override
	public ADto viewPage(int seq) throws Exception {
		return (ADto) sqlSession.selectList(nameSpace+".viewPage");
	}
	
	@Override
	public void deleteDao(int seq) throws Exception {
		
	}

	@Override
	public void updatelist(int seq, String aName, String aContent, String aAddress, String aEmail, String aRelation)
			throws Exception {
		sqlSession.update(nameSpace+".updatelist");
	}

	@Override
	public List<ADto> search(String searchoption, String keyword) throws Exception {
		return sqlSession.selectList(nameSpace+".search");
	}





}