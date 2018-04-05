package com.dcw.hookdelagate.demo;

import java.lang.reflect.Field;

public class App {
	static App app;
	public static void main(String[] args) {

		ActivityManagerNative activityManagerNative=new ActivityManagerNative();
		app=new App();

		try {

			Class activityManagerNativeClass=Class.forName("com.dongnao.ActivityManagerNative");
			Field sigletoneField=activityManagerNativeClass.getDeclaredField("sigletone");
			sigletoneField.setAccessible(true);
			Object sigletoneObj=sigletoneField.get(null);
			Sigletone sigletone=(Sigletone) sigletoneObj;
			System.out.println("---   "+sigletone.name);

			Sigletone sigletone2=new Sigletone();
			sigletone2.setName("lance");
			sigletoneField.set(activityManagerNative,sigletone2);

			System.out.println("-->"+ActivityManagerNative.sigletone.name);
			
		} catch ( Exception e) {
			e.printStackTrace();
		}
	}
}
