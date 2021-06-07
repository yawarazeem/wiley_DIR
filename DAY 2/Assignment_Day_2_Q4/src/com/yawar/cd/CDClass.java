package com.yawar.cd;

public class CDClass implements Comparable<CDClass>{
	private int cdNo;
	private String cdTitle;
	private String cdSinger;
	
	public CDClass(int cdNo, String cdTitle, String cdSinger) {
		super();
		this.cdNo = cdNo;
		this.cdTitle = cdTitle;
		this.cdSinger = cdSinger;
	}
		
	public int getCdNo() {
		return cdNo;
	}
	public void setCdNo(int cdNo) {
		this.cdNo = cdNo;
	}
	public String getCdTitle() {
		return cdTitle;
	}
	public void setCdTitle(String cdTitle) {
		this.cdTitle = cdTitle;
	}
	public String getCdSinger() {
		return cdSinger;
	}
	public void setCdSinger(String cdSinger) {
		this.cdSinger = cdSinger;
	}
		
	
	@Override
	public String toString() {
		return "CDClass [cdNo=" + cdNo + ", cdTitle=" + cdTitle + ", cdSinger="
				+ cdSinger + "]";
	}
	@Override
	public int compareTo(CDClass cd2) {
		return(this.getCdSinger().compareTo(cd2.getCdSinger()));
	
}

}
