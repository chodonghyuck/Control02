package com.biz.control;

public class Control12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 급여액이 3000 이하이면 6% 
		// 급여액이 3000 초과 10000 이하이면 9%
		// 급여액이 10000 초과이면 12%
		
		int intPay = 3000;
		if(intPay <= 3000) {
			System.out.println("세금 :" + (intPay * 0.06 ));
		}
		
		if(3000 < intPay && intPay <= 10000) {
			System.out.println("세금 :" + (intPay * 0.09 ));
		}
		if(intPay > 10000) {
			System.out.println("세금 :" + (intPay * 0.12 ));
		}

	}

}
