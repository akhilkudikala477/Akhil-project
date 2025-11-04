package com.akhiljava;

public class ParameterMethod {
	void method(String name){
		System.out.println("my name is  " +   name);
		
	}

	public static void main(String[] args) {
		String names ="srinivas" ;
		int i = 30;
		ParameterMethod ak = new ParameterMethod ();
		ak.method(names);
		ak.method2(27);
		ak.method3(names, i);
	}
	void method2(int i) {
		System.out.println("my age  "+ i);
	}
	
	void method3(String name ,int i){
		System.out.println("my name is  " +   name);
		System.out.println("my age  "+ i);

	}
	

		
	}

