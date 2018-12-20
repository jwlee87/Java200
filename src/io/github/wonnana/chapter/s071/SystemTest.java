package io.github.wonnana.chapter.s071;

import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;

/**
 * 
 * @author user
 * @contents
 * 
 * System으로 연산 소요 시간구하기
 *
 */

public class SystemTest {

	public static void main(String[] args) {
		long ltime=System.currentTimeMillis();
		System.out.println(ltime);
		for(int i=0;i<100000;i++) {
			System.out.println("");
		}
		long ltime2=System.currentTimeMillis();
		System.out.println(ltime2-ltime);
		System.out.println(ltime2/1000/60/60/24/365+"년");
		
		Properties pro=System.getProperties();
		//원하는 System property
		System.out.println(pro.getProperty("java.vm.version"));
		System.out.println(pro.getProperty("file.separator"));
		
		System.out.println(new Date(System.currentTimeMillis()));	//오늘
		
		//-----java.util.*에서
		//모든 System property
		
		Enumeration<Object> en=pro.keys();
		int i=0;
		while(en.hasMoreElements()) {
			String key=(String)en.nextElement();
			System.out.println((++i+" ")+key+": "+pro.getProperty(key));
		}
		
		Iterator<Object> keys = pro.keySet().iterator();
		int j=0;
		while(keys.hasNext()) {
			String key = (String) keys.next();
			System.out.println((++j+"")+key+":"+pro.getProperty(key));
		}
	}

}
