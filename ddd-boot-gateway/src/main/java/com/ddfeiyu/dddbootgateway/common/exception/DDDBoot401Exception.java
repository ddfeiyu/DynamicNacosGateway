package com.ddfeiyu.dddbootgateway.common.exception;

/**
 * @Description: ddd-boot自定义401异常
 */
public class DDDBoot401Exception extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DDDBoot401Exception(String message){
		super(message);
	}

	public DDDBoot401Exception(Throwable cause)
	{
		super(cause);
	}

	public DDDBoot401Exception(String message, Throwable cause)
	{
		super(message,cause);
	}
}
