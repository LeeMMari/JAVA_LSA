package Day05.Ex02_Encapsulation;

public class Bank {

	public static void main(String[] args) {
		Encapsulation ec
			= new Encapsulation(0, "국민은행", "215414-01-109955", "김땡땡");
		
		ec.setDeposit(1000000000);
		
		int money = ec.getDeposit();
		System.out.println(ec);
		System.out.println("계좌 잔액 : " + money);
	}
}
