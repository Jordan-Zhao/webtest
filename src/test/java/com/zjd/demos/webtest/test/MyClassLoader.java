package com.zjd.demos.webtest.test;

import java.net.URL;
import java.net.URLClassLoader;

public class MyClassLoader extends URLClassLoader{
	private static URL[] us;
	static{
		try {
			URL url=new URL("file:D:/class/a.jar");
			us = new URL[]{url};
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public MyClassLoader() {
		super(us);
	}
}
