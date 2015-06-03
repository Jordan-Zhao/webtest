/**
 * Copyright (c) 2013.
 */
package com.zjd.demos.webtest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.zjd.demos.webtest.service.UserService;

/**
 * @author Jordan 联系人位置服务
 */
@Controller
@RequestMapping("/hsf")
public class HsfTestController extends BaseController {

	@RequestMapping(value = "/getUserName.do", method = RequestMethod.GET)
	@ResponseBody
	public Object test(HttpServletRequest request, HttpServletResponse response) throws Exception {
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(request.getSession().getServletContext());
		UserService userService = (UserService)context.getBean("userServiceHsfClient");
		return userService.getUserName();
	}
	

}
