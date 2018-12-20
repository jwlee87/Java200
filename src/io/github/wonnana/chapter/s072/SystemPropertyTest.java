package io.github.wonnana.chapter.s072;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author user
 * @title	System으로 환경변수 확인하기
 *
 * System.getProperty()는 시스템 변수를, System.getenv()는 자바 환경변수를 반환한다.
 * 
 */
public class SystemPropertyTest {

	public static void main(String[] args) {
		long nanotime=System.nanoTime();
		for(int i=0;i<100000;i++) {
			System.out.println("");
		}
		long nanotime2=System.nanoTime();	//10^-9 nano java5추가
		System.out.println(nanotime2-nanotime);	// 1/1000000000초
		System.out.println(System.getenv("JAVA_HOME"));	//환경변수
		
		//모든 env구하기
		Map<String, String> map=System.getenv();
		Iterator<String> iter=map.keySet().iterator();
		
		int j=0;
		while(iter.hasNext()) {
			String key=iter.next();
			System.out.println((++j+"")+key+": "+map.get(key));
		}
	}
/**
 * 
 * System.getProperty()는 시스템 변수를, System.getenv()는 프로그래밍 개발 환경변수를 반환한다.
 * System.getProperty()는 Properties를, System.getEnv()는 Map을 반환(리턴)한다.
 * Enumeration은 Iterator의 오래된 버전이다. 키를 얻어서 키에 대한 밸류를 얻을 수 있다.
 * 
 */
}
