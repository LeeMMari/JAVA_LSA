package Day11.Ex01_Generic;

public class LimitedTypeMethod {

	// 제네릭 메소드 타입 제한
	// Number
	// - 자식 클래스 : Integer, Double 등의 래퍼크래스 외 다수
	public <T extends Number> void method(T t) {
		System.out.println( t.intValue() );
		System.out.println( t.doubleValue() );
	}
	
	public static void main(String[] args) {
		
		LimitedTypeMethod Itm = new LimitedTypeMethod();
		Itm.method(1234.5678);
//		Itm.method("1234.5678");		// 문자열은 제한된다. 
		
	}
}
