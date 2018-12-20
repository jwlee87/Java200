package io.github.wonnana.chapter.s075;

import java.text.SimpleDateFormat;
import java.util.Calendar;

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
		return null;
	}

}
