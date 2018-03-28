package com.yd.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * freemarker整合页面
 * @Description:
 * @author:Sandy
 * @Date:2018年3月28日 上午11:20:49
 */
@Controller
@RequestMapping("/freemarker")
public class FreemarkerController {
	
	@RequestMapping("/sandy")
	public String index(Map<String,Object> result){
		result.put("name", "杨定");
		result.put("value", "梅宝");
		result.put("sex", 1);
		List<String> list=new ArrayList<String>();
		list.add("Sandy");
		list.add("MeiBao");
		result.put("userList", list);
		return "index";
	}
	
}
