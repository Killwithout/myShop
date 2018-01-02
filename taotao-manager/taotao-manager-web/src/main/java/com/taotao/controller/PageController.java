package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转controller
 * @author cjk
 *
 */
@Controller
public class PageController {
	
	/**
	 * 首页展示
	 * @return
	 */
	@RequestMapping("/")
	public String showIndex(){
		
		return "index";
	}
	
	/**
	 * 商品列表展示
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
}
