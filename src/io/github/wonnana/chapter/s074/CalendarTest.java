package io.github.wonnana.chapter.s074;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author user
 * @title Calendar로 살아온 날 구하기
 *
 */

public class CalendarTest {

	public static void main(String[] args) {
		long millis=System.currentTimeMillis();		//1970.1.1부터 경과 시간 msec
		System.out.println(millis/1000/24/60/60);	//며칠 경과
		
		Date d=new Date();		//오늘
		System.out.println(d);
		Date dd=new Date(d.getTime()+24*60*60*1000);	// 하루 후
		System.out.println(dd);
		
		Calendar cal1970=Calendar.getInstance();
		cal1970.set(1970, 1-1, 1);		// 0월~11월, 1970.1.1
		
		Calendar today=Calendar.getInstance();	//오늘
		printCalendar(today);
		System.out.println();
		long minus=today.getTimeInMillis()-cal1970.getTimeInMillis();
		System.out.println(minus);			// 1970.1.1~오늘 msec
		System.out.println(minus/1000/24/60/60);	//1970년부터 며칠 지났는가?
	}
	
	public static void printCalendar(Calendar c) {
		System.out.println("----------------------------");
		System.out.println(c.get(Calendar.YEAR));			//몇년
		System.out.println(c.get(Calendar.MONTH)+1);		//몇월
		System.out.println(c.get(Calendar.DAY_OF_MONTH));	//며칠
		System.out.println(c.get(Calendar.AM_PM));			//1 PM, 0 AM
		System.out.println(c.get(Calendar.HOUR_OF_DAY));	//몇 시 Calendar.HOUR
		System.out.println(c.get(Calendar.MINUTE));			//몇 분
		System.out.println(c.get(Calendar.SECOND));			//몇 초
	}
/**
 * 날짜와 관련해서 단순히 날짜를 출력할 때는 java.util.Date를 많이 사용했지만, Date는 long과 String 관련 메서드만 있어서 사용할 수 있는 메서드가 적다.
 * 그래서 Date보다 java.util.Calendar를 많이 사용한다.
 * Calendar는 연, 월, 일 등을 int, long, Date 등으로 대입 받거나 반환할 수 있고 제공하는 메서드도 다양하다.
 * Calendar는 추상 클래스이기 때문에 new로 생성하지 못하고 getInstance() static 메서드로 생성해서 사용한다.
 * 연도는 cal.get(Calendar.YEAR), 월은 cal.get(Calendar.MONTH)처럼 cal.get(Calendar.XXXX)형태로 연, 월, 일, 시, 분, 초, 오후, 오전 등의 정보를 얻을 수 있다.
 * 특이한 점은 1월~12월 대신 0월~11월을 사용하고 일요일이 1, 토요일이 7로 사용된다는 것이다.
 */
}
