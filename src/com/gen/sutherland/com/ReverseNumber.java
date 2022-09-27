package com.gen.sutherland.com;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=530990185;
		int mod=0;
		int Reverse=0;
		
		while (num>0)
		{
			mod= num%10;
			Reverse=Reverse*10+mod;
			num=num/10;
		}
				System.out.println("Reverse number; "+ Reverse);
	}

}
