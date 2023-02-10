package Day08.Ex04_Time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareEx {

	public static void main(String[] args) {
		// 2023년 2월 10일 9시 0분 0초
		LocalDateTime todayDateTime = LocalDateTime.of(2023, 2, 10, 9, 0, 0);
		System.out.println("시작일 : " + todayDateTime);
		
		// 2023년 7월 21일 18시 0분 0초
		LocalDateTime endDateTime = LocalDateTime.of(2023, 7, 21, 18, 0, 0);
		System.out.println("종강 : " + endDateTime);
		
		// A.isBefore(B) 	: A 가 B보다 이전이면 true, 아니면 false
		// A.isEqual(B) 	: A 가 B보다 같은 시간이면 true, 아니면 false
		// A.isAfter(B) 	: A 가 B보다 이후면 true, 아니면 false
		if( todayDateTime.isBefore(endDateTime) ) {
			System.out.println("훈련과정 진행 중입니다.");
		}
		else if( todayDateTime.isEqual(endDateTime) ) {
			System.out.println("종강합니다.");
		}
		else if( todayDateTime.isAfter(endDateTime) ) {
			System.out.println("훈련과정이 종료되었습니다.");
		}
		
		// until( )
		// : LocalDateTime 객체의 날짜/시간부터 인자로 지정한 객체의 날짜/시간까지
		// 	 남은 시간을 반환하는 메소드
		long remainYear = todayDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = todayDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = todayDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = todayDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = todayDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = todayDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		System.out.println("남은 년도 : " + remainYear);
		System.out.println("남은 개월 수 : " + remainMonth);
		System.out.println("남은 일 수 : " + remainDay);
		System.out.println("남은 시 : " + remainHour);
		System.out.println("남은 분 : " + remainMinute);
		System.out.println("남은 초 : " + remainSecond);
		System.out.println();
		
		
		// betWeen()
		// - chronoUnit.상수.between(시작일자, 종료일자)
		// : 시작일자와 종료일자 사이의 남은 시간을 지정한 상수 단위에 맞게 변환하는 메소드
		remainYear = ChronoUnit.YEARS.between(todayDateTime, endDateTime);
		remainMonth = ChronoUnit.MONTHS.between(todayDateTime, endDateTime);
		remainDay = ChronoUnit.DAYS.between(todayDateTime, endDateTime);
		remainHour = ChronoUnit.HOURS.between(todayDateTime, endDateTime);
		remainMinute = ChronoUnit.MINUTES.between(todayDateTime, endDateTime);
		remainSecond = ChronoUnit.SECONDS.between(todayDateTime, endDateTime);
		
		System.out.println("남은 년도 : " + remainYear);
		System.out.println("남은 개월 수 : " + remainMonth);
		System.out.println("남은 일 수 : " + remainDay);
		System.out.println("남은 시 : " + remainHour);
		System.out.println("남은 분 : " + remainMinute);
		System.out.println("남은 초 : " + remainSecond);
		System.out.println();
		
	}
	
}