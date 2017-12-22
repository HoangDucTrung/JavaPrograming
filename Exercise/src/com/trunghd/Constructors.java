package com.trunghd;

public class Constructors {

	public static void main(String[] args) {
		Account bobsAccount = new Account("12345", 0.00,"trunghd","trunghd@agrimedia.vn","84945452448");
//		
//		bobsAccount.withdrawal(100.0);
//		
//		bobsAccount.deposit(50.0);
//		bobsAccount.withdrawal(100.0);
//		
		bobsAccount.deposit(100);
		bobsAccount.withdrawal(100.0);
//		
//		Account trungAccount = new Account("trunghd","trunghd@agrimedia.vn","12345");
//		System.out.println(trungAccount.getNumber() + " name " + trungAccount.getCustomerName());
		
		
//		VipPerson person1 = new VipPerson();
//		System.out.println(person1.getName());
//		
//		VipPerson person2 = new VipPerson("trung", 25000.00);
//		System.out.println(person2.getName());
//		
//		VipPerson person3 = new VipPerson("nam",100.00,"nam@email.com");
//		System.out.println(person3.getName());
//		System.out.println(person3.getEmailAddress());
	}

}
