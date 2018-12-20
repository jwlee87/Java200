package io.github.wonnana.chapter.s070;
/**
 * 
 * @author user
 * @contents
 * StringBuilder로 문자열 수정, 변경, 추가하기
 * 
 * ** StringBuilder는 동기화하지 않은 StringBuffer이다.
 *
 */
public class StringBuilderMain {

	public static void main(String[] args) {
		StringBuilder sbu=new StringBuilder();
		sbu.append("I")
			.append(" go")
			.append(" to school.");
		System.out.println(sbu);
		System.out.println(sbu.hashCode());
		System.out.println();
		
		sbu.replace(7, 11, "");
		System.out.println(sbu);
		System.out.println(sbu.hashCode());
		System.out.println();
		
		sbu.reverse();
		System.out.println(sbu);
		System.out.println(sbu.hashCode());
		System.out.println();
		
		sbu.deleteCharAt(3);
		System.out.println(sbu);
		System.out.println(sbu.hashCode());
		System.out.println();
		
		String ss=sbu.substring(0);
		System.out.println(ss);
		System.out.println(sbu);
		System.out.println(ss.hashCode());
		System.out.println(sbu.hashCode());
		System.out.println();
		
		String st=sbu.substring(0, 4);
		System.out.println(st);
		System.out.println(sbu);
		System.out.println(st.hashCode());
		System.out.println(sbu.hashCode());
	}
/**
 * 
 * String은 문자열의 내용이 조금이라도 바뀌거나 스트링 컨케트네이션(+ 또는 concat 연산)되면 새로운 객체를 만든다.
 * 레퍼런스를 잃어버린 객체는 가비지 컬렉션의 대상이 되며, 새로운 객체에게 새 주소를 주므로 해시코드도 변한다.
 * StringBuffer는 원래 있던 객체의 내용만 바뀌(주소는 변경하지 않은)는 뮤터블한 특성이 있기 때문에 StringBuffer를 쓰드록 권장한다.
 * StringBuilder는 동기화하지 않은 StringBuffer이다. 여러 쓰레드에서 하나의 StringBuilder를 사용하는 것은 피한다.
 * 
 */
}
