package io.github.wonnana.chapter.s075;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author user
 * @title Calendar와 String 사이 날짜 변환하기
 *
 */
public class RestDay {

	public static void main(String[] args) {
		String st="2017-06-13";
		Calendar d2=todate(st);
	}
	
	public static Calendar todate(String ss) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date dd=new Date();
		try {
			dd=sdf.parse(ss);
		} catch(ParseException e) {
			
		}
		Calendar cal=Calendar.getInstance();
		cal.setTime(dd);
		return cal;
	}
	
	public static String toYMD(Calendar dd) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(dd.getTime());
	}
	

}
