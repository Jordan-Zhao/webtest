package com.zjd.demos.webtest.test;

public class Main {
	public static void main(String[] arg) throws Exception{
		MyClassLoader myClassLoader = new MyClassLoader();
		
		while(true){
			try {
				Class class1 = myClassLoader.loadClass("com.zjd.demos.webtest.test.User");
				IUser user = (IUser)class1.newInstance();
				
				IUser.class.getClassLoader();//sun.misc.Launcher$AppClassLoader@182f0db
				user.getClass().getClassLoader();//com.zjd.demos.webtest.test.MyClassLoader@10655dd
				user.getClass().getClassLoader().getParent();//sun.misc.Launcher$AppClassLoader@182f0db
				
				user.say();
				Thread.sleep(5*1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		
	}
}
