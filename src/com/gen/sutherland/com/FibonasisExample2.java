package com.gen.sutherland.com;

public class FibonasisExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100, firstterm=0, secondterm=1;
		System.out.println("fibonacci series upto " +n+"");
		
		while (firstterm<=n) {
			System.out.print(firstterm+"  ");
			int nextterm=firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
		}
		
	}

}
