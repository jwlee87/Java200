package io.github.wonnana.chapter.s069;
/**
 * 
 * @author user
 * @contents
 * String과 비슷하지만 다른 특징을 가진 StringBuffer를 익혀보자.
 *
 */
public class StringBufferMain {

	public static void main(String[] args) {
		//StringBuffer 생성
		StringBuffer sb1=new StringBuffer();
		sb1.append("hello")
			.append("see you again")
			.append("모두를 사랑해요. 기다려봐.");
		System.out.println(sb1.toString()+sb1.hashCode());
		
		sb1.replace(0, 2, "나 보기가 역겨워");
		System.out.println(sb1.toString()+sb1.hashCode());
		
		sb1.reverse();
		System.out.println(sb1.toString());
		
		sb1.delete(10, 15);
		System.out.println(sb1.toString());
		
		replaces(sb1);
		System.out.println(sb1.toString());
	}
	
	public static void replaces(StringBuffer sb) {
		sb.reverse();
		sb.replace(0, 3, "GoGo");
	}

/**
 * 문자열을 저장 또는 처리하는 String은 참조 타입이지만 성격을 변경해서(오버라이딩) 기본 타입과 동일한 CBV(Call By Value:값 복사)를 한다.
 * 문자열을 연산한 후 대입 연산자로 저장해야 변경한다. 바꾼 문자열을 다시 대입하지 않으면 원래 문자열이 되는 특징이 이뮤터블이다.
 * 내용이 변경되면 새로운 주소를 갖는다. 
 * 
 * **StringBuffer는 저장하는 내용이 변경되어도 처음 주소가 변경되지 않는다.**
 * 바꾼 문자열을 다시 대입하지 않아도 원래 문자열이 변하는 것을 뮤터블이라고 한다. StringBuffer로 문자열을 연산한 다음, 최종으로 toString()을 통하여
 * String으로 변환해서 사용한다.
 */
}
