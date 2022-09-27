package com.gen.sutherland.com;

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer mns=new StringBuffer ("9959238355");
		//mns.append("kuppam");
		//System.out.println(mns);
		mns.insert(0, "(");
		mns.insert(4, ")");
		mns.insert(8, "-");
		System.out.println("output"+ mns);
	}

}
