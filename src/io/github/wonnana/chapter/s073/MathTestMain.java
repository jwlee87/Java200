package io.github.wonnana.chapter.s073;
/**
 * 
 * @author user
 * @title	수학관련 메서드 사용
 * 
 */
public class MathTestMain {

	public static void main(String[] args) {
		//constant
		System.out.println("Math.E "+Math.E);	//상수 자연로그
		System.out.println("Math.PI "+Math.PI);	// 원주율 PI
		//method
		System.out.println("Math.abs(-5) 절대값:"+Math.abs(-5));	//절대값을 구한다
		System.out.println("Math.ceil(4.34) 올림:"+Math.ceil(4.34));
		System.out.println("Math.round(4.34) 반올림:"+Math.round(4.34));
		System.out.println("Math.floor(4.34) 버림:"+Math.floor(4.34));
		System.out.println("Math.rint(4.34) 반올림:"+Math.rint(4.34));
		//rint와 rount의 차이점 round는 0.5부터 반올림이 되지만 rint는 0.51처럼 0.5가 넘어야 반올림이 된다.
		System.out.println("Math.max(45, 78) "+Math.max(45, 78));
		System.out.println("Math.min(45, 78) "+Math.min(45, 78));
		System.out.println("Math.pow(2,4) "+Math.pow(2,4));	// 승수를 구한다. 2의 4승, 즉 2*2*2*2를 구한다.
		System.out.println("Math.log(2.7) "+Math.log(Math.E)); //밑수가 Math.E인 로그이다.
		System.out.println("Math.exp(4) "+Math.exp(4));		// exp(num)는 pow(Math.E, num)로 자연지수의 승수이다.	
		System.out.println("Math.sqrt(16) "+Math.sqrt(16));	//양의 제곱근을 구한다.
		//random
		double dRan=Math.random();	// 0<=dRan<1 실수
		System.out.println("Math.random()=>"+dRan);
	}

/** 
 * Math 클래스는 수학 연산에 관련된 메서드를 제공한다.
 * java.lang 패키지에서 Math 클래스의 메서드는 모두 static 메서드이다.
 * static 메서드는 객체 생성 없이 "클래스 이름.메서드()" 형태로 사용한다.
 * java.lang 패키지는 자동으로 import되며, static 메서드이므로 Math클래스.메서드이름()"으로 메서드를 호출한다. 된다.
 */
}
