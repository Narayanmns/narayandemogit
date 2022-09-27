package com.gen.sutherland.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List list=new ArrayList();
	list.add("Narayan");
	list.add(24);
	list.add("Rebel");
	list.add(30);
	list.add("Yashika");
	list.add(1);
	//Iterator itr=list.iterator();{
	//}
	//while (itr.hasNext()) {

	for (int i=0;i<=list.size()-1;i++) {
	
	
	System.out.println(list.get(i));
	}
	}}