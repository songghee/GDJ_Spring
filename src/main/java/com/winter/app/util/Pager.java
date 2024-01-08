package com.winter.app.util;

public class Pager {
	
	private Long startRow;
	private Long lastRow;
	private Long perpage=10L;//몇개씩 조회
	private Long page;
	
	//stsrtRow, lastRow 계산하는 메서드
	public void makeRow() {
		this.lastRow=this.page*this.perpage;
//		this.startRow=this.perpage*this.page-9;
//		this.startRow=this.perpage*this.page-(this.perpage-1);
//		this.startRow=lastRow-this.perpage+1;
		this.startRow=(this.getPage()-1)*this.getPerpage()+1;
	}
	
	
	
	public Long getPerpage() {
		if(this.page==null || this.page<1) {
			this.page=1L;
		}
		
		return perpage;
	}



	public void setPerpage(Long perpage) {
		this.perpage = perpage;
	}



	public Long getPage() {
		return page;
	}



	public void setPage(Long page) {
		this.page = page;
	}



	public Long getStartRow() {
		return startRow;
	}
	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}
	public Long getLastRow() {
		return lastRow;
	}
	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}
	

}
