package com.polymorphism;

public class Test1 {
	public static void main(String[] args) {
		SBIbank bank = new SBIbank();
		String msg = bank.applyHomeLoan();
		System.out.println(msg);
	}

}
