package object_class;
//은행계좌 클래스(신한은행) => 멤버변수 접근제한자로 보호, getter, setter설정
public class Account {
	//멤버변수(필드)
	static final String BANKNAME="신한은행"; //정적멤버변수
	String accountNo;  //계좌번호  - 인스턴스멤버변수
	String ownerName;  //예금주이름 - 인스턴스멤버변수
	int balance;   //잔액 - 인스턴스멤버변수
	
	//생성자
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	//생성자
	public Account() {
		
	}
	
	//예금한다 메서드
	void deposit(int amount) {
		balance+=amount;  //balance=balance+amount;
	}
	
	//인출한다 메서드
	int withdraw(int amount) throws Exception {
		if(balance < amount) {
			throw new Exception("잔액이 부족합니다.");
		}
		balance-=amount;   //balance=balance-amount;
		return amount;
	}
}
