package com.isoftstone.demo.common;

import com.isoftstone.demo.pojo.Product;

public class ProductVo {
	
	Product po = new Product();
	
	String priceStart;
	
	String priceEnd;
	
	//��ǰҳ
	int pageNum;
	
	//ÿҳ��ѯ������
	int pageSize;

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public Product getPo() {
		return po;
	}

	public void setPo(Product po) {
		this.po = po;
	}

	public String getPriceStart() {
		return priceStart;
	}

	public void setPriceStart(String priceStart) {
		this.priceStart = priceStart;
	}

	public String getPriceEnd() {
		return priceEnd;
	}

	public void setPriceEnd(String priceEnd) {
		this.priceEnd = priceEnd;
	}
}
