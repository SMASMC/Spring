package com.springlec.base.model;

public class B2Dto {

	int bId;
	String bName;
	String bTitle;
	
	public B2Dto() {
		
	}
	public B2Dto(int bId, String bName, String bTitle) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bTitle = bTitle;
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	
	
}
