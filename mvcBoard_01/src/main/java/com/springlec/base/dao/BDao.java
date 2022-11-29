package com.springlec.base.dao;

import java.util.List;

import com.springlec.base.model.BDto;

public interface BDao {
	
	public List<BDto> listDao() throws Exception; //전체 내역 불러오기
	public void writeDao(String bName, String bTitle, String bContent)throws Exception;//선택 사항만 넣어주기
	public BDto viewDao(int bId) throws Exception;//선택 내역 불러오기
	public void deleteDao(int bId) throws Exception;//선택 내역 삭제하기
	public void modify(int bId,String bName, String bTitle, String bContent)throws Exception;//선택 사항에서 update해주기
	
}
