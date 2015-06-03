/**
 * Copyright (c) 2013.
 */
package com.zjd.demos.webtest.controller;

import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Jordan 联系人位置服务
 */
@Controller
@RequestMapping("/jetty")
public class JettyTestController extends BaseController {

	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	@ResponseBody
	public Object test(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Properties properties = new Properties();
		properties.load(this.getClass().getClassLoader().getResourceAsStream("config.properties"));
		return properties.get("a");
	}
	

}
