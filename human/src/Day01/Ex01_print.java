package Day01;

public class Ex01_print{
//main : ctrl +space
	public static void main(String[] args) {
		//기본 출력문
		// -print(), println()메소드를 호출하여 출력한다.
		//print("문자열");
		// : 지정한 "문자열"을 출력하는 메소드
		System.out.print("안녕하세요 출력");
		//에디터 템플릿 설정
		// 백슬레시n : 출력문 내에서 줄바꿈
		//[Window]> [preferences]
		//		>[java]
		//		>[Editor]
		//		>[template]
		//sysp : ctrl +space
		//		System.out.print();
		
		//println(); 0 in(line)
		// : 지정한 "문자열을 출력하고 한 줄을 줄바꿈해주는 메소드
		//sysout : ctrl +space
		System.out.println("안녕하세요 출력 후 줄바꿈");
		System.out.println("자바 첫수업");
		System.out.println();
		System.out.println("이어지는 문자열");
	}
}
