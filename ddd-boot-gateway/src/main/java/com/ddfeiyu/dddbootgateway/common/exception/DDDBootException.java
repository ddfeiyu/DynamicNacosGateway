package com.ddfeiyu.dddbootgateway.common.exception;

/**
 * @Description: DDD-boot自定义异常
 */
public class DDDBootException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DDDBootException(String message){
		super(message);
	}
	
	public DDDBootException(Throwable cause)
	{
		super(cause);
	}
	
	public DDDBootException(String message, Throwable cause)
	{
		super(message,cause);
	}
}
