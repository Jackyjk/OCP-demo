package com.isoftstone.demo.pojo;

/**
 * @author 李正阳
 * 商品对象
 */
public class Product {
	
	Integer id;
	
	String pcode;
	
	String pname;
	
	String ptype;
	
	String pcategory;
	
	String pnumber;
	
	String pprice;
	
	String pimage;
	
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getPcategory() {
		return pcategory;
	}

	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}

	public String getPnumber() {
		return pnumber;
	}

	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}

	public String getPprice() {
		return pprice;
	}

	public void setPprice(String pprice) {
		this.pprice = pprice;
	}

	public String getPimage() {
		return pimage;
	}

	public void setPimage(String pimage) {
		this.pimage = pimage;
	}
}
