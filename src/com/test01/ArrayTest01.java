package com.test01;

import java.util.Scanner;

public class ArrayTest01 {
	public void testArray() {
		/*int num1=10, num2=20, num3=30, num4=40, num5=50;
	
		int sum=0;
		sum=num1+num2+num3+num4+num5;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);*/
		
		int arr[] = new int[5];
		int sum = 0;
		
		/*arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		//for문을 이용하여 값 대입
		

		sum += arr[0];
		sum += arr[1];
		sum += arr[2];
		sum += arr[3];
		sum += arr[4];
		*/
		for(int i=0;i<arr.length;i++) {
			arr[i] = (i+1)*10;
			sum+=arr[i];
		}
		System.out.print("sum : " + sum);
	}
	public void testArray2() {
		// 배열의 선언
		// 자료형[] 변수명;
		// 자료형 변수명[]; 로 선언

		/*
		 * int iarr[]; char carr[];
		 * 
		 * //할당 iarr = new int[5]; carr = new char[10];
		 */

		// 선언과 할당을 동시에
		int iarr[] = new int[5];
		char carr[] = new char[10];

		System.out.println(iarr);
		System.out.println(carr);

		System.out.println("iarr의 hashcode: " + iarr.hashCode());
		System.out.println("carr의 hashcode: " + carr.hashCode());

		System.out.println("iarr의 길이: " + iarr.length);
		System.out.println("carr의 길이: " + carr.length);

		// 스캐너 활용하여 배열길이 입력 받아 할당
		Scanner sc = new Scanner(System.in);
		System.out.print("새로 할당할 배열의 길이 입력 : ");
		int size = sc.nextInt();

		double darr[] = new double[size];

		System.out.println("darr의 hashcode: " + darr.hashCode());
		System.out.println("darr의 길이: " + darr.length);

		darr = new double[30];// 배열은 배열의 크기 변경 하기 위해 다시 할당해줘야함

		System.out.println("수정 후 darr의 hashcode: " + darr.hashCode());
		System.out.println("수정 후 darr의 길이: " + darr.length);

		darr = null;

		//System.out.println("삭제 후 darr의 길이: " + darr.length);오류뜸
	}
	
	public void testArray3() {
		int iarr[] = new int[5];

		System.out.println(iarr[0]);
		System.out.println(iarr[1]);

		// int iarr2[] = {1,2,3,4,5};
		int iarr2[] = new int[] { 1, 2, 3, 4, 5 };
		for (int i = 0; i < 5; i++) {
			System.out.println(iarr2[i]);
		}

		// String[] sarr = new String[10];
		String sarr[] = { "apple", "home", "soju", "phone", "mouse" };
		for (int i = 0; i < sarr.length; i++) {
			System.out.println(sarr[i]);
		}
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
