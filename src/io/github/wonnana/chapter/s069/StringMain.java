package io.github.wonnana.chapter.s069;
/**
 * 
 * @author user
 * String은 참조 타입이지만 성격을 변경해서(오버라이딩) 기본 타입과 동일한 값 복사를 한다.
 * 문자열을 연산한 후 대입 연산자로 저장해야 변경된다.
 * 바꾼 문자열을 다시 대입하지 않으면 원래 문자열이 되는 특징이 이뮤터블이다.
 * 내용이 변경되면 새로운 주소를 갖는다.
 *
 */
public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String();
		s1="안녕".concat("또 만나요");
		s1.concat(" 모두를 사랑해요. 기다려봐.");
		System.out.println(s1.toString()+s1.hashCode());
		System.out.println();
		
		String s2="ABCDE";
		
		s1.replace('모', '꿍');
		System.out.println(s2);
		System.out.println(s2.replace('A', 'B'));
		System.out.println();
		System.out.println(s1.toString()+s1.hashCode());
		System.out.println();
		replaces(s1);
		System.out.println(s1.toString()+s1.hashCode());
	}
	
	public static void replaces(String s) {
		s.replace('꿍', '모');
	}

}
