package com.isoftstone.demo.common.exception;

public class ProductException extends Exception {

	private static final long serialVersionUID = -3149228255345348958L;
	// �쳣��Ϣ
	private String message;

	public ProductException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
