package com.arrayPractice1.sample;

import java.util.Scanner;

public class ArraySample {

	public void test1() {
		int iarr[] = new int[10];
		int sum = 0;
		for (int i = 0; i < iarr.length; i++) {
			iarr[i] = (int) ((Math.random() * 100) + 1);
			sum += iarr[i];
			System.out.print(iarr[i] + " ");
		}
		System.out.print("\n" + sum);
	}

	public void test2() {
		int ar[] = new int[10];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 100) + 1;
			System.out.print(ar[i] + " ");
		}
		System.out.println();

		int max = ar[0];
		int min = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]>max)
				max=ar[i];
			if(ar[i]<min)
				min=ar[i];
		}
		System.out.println(" 최대값 " + max + " 최소값 " + min);
	}

	public void test3() {
		byte ar[] = new byte[10];
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (byte) ((int) (Math.random() * 100) + 1);
			System.out.print(ar[i] + " ");
			if (ar[i] % 2 == 0)
				sum += ar[i];
		}
		System.out.println("\n짝수들의 합계: " + sum);
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력: ");
		String value = sc.next();
		int sum = 0;
		for (int i = 0; i < value.length(); i++) {
			String s = value.substring(i, i + 1);
			sum += Integer.parseInt(s);
		}
		System.out.println("자릿수 합: " + sum);
	}

	public void test5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력: ");
		String value = sc.next();
		int sum = 0;
		for (int i = 0; i < value.length(); i++) {
			sum += (int)(value.charAt(i))-'0';
		}
		System.out.println("자릿수 합: " + sum);
	}


}
