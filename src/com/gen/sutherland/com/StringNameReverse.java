package com.gen.sutherland.com;

public class StringNameReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1="Yashika Narayan";
		String reverse="";
		String name=name1.toUpperCase();
		char ch;
		for (int i=0;i<=name.length()-1;i++)
		{
			ch=name.charAt(i);
			reverse=ch+reverse;
		}
		
		System.out.println("reverese name is " + reverse);
	}
	}
