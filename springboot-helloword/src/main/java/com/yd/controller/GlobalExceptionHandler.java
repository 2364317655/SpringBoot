package com.yd.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 全局异常捕获处理
 * @author:Sandy
 * @Date:2018年3月26日 下午5:10:12
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(RuntimeException.class)
	//如果是返回json格式 加@ResponseBody 页面返回string类型 
	@ResponseBody
	public Map<String,Object> resultError(){
		Map<String,Object> result=new HashMap<String,Object>();
		result.put("errorCode", 500);
		result.put("errorMsg", "系统错误！");
		return result;
	}
	
	
}
