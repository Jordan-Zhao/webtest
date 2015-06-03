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

/**
 * @author Jordan 联系人位置服务
 */
@Controller
@RequestMapping("/test")
public class TestController extends BaseController {

	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	@ResponseBody
	public Object test(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println(request.getRemoteAddr());
		System.out.println(request.getHeader("user-agent"));
		return "abc";
	}
	
	@RequestMapping(value = "/redirect.do", method = RequestMethod.GET)
	public Object redirect(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.sendRedirect("redirectResult.do");
		return null;
	}
	@RequestMapping(value = "/redirectResult.do", method = RequestMethod.GET)
	@ResponseBody
	public Object redirectResult(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return "redirect result!";
	}
	
	@RequestMapping(value = "/redirectPost.do", method = RequestMethod.POST)
	public Object redirectPost(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.sendRedirect("redirectPostResult.do");
		return null;
	}
	@RequestMapping(value = "/redirectPostResult.do", method = RequestMethod.POST)
	@ResponseBody
	public Object redirectPostResult(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return "redirect post result!";
	}

}
