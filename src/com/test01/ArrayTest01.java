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
		//for���� �̿��Ͽ� �� ����
		

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
		// �迭�� ����
		// �ڷ���[] ������;
		// �ڷ��� ������[]; �� ����

		/*
		 * int iarr[]; char carr[];
		 * 
		 * //�Ҵ� iarr = new int[5]; carr = new char[10];
		 */

		// ����� �Ҵ��� ���ÿ�
		int iarr[] = new int[5];
		char carr[] = new char[10];

		System.out.println(iarr);
		System.out.println(carr);

		System.out.println("iarr�� hashcode: " + iarr.hashCode());
		System.out.println("carr�� hashcode: " + carr.hashCode());

		System.out.println("iarr�� ����: " + iarr.length);
		System.out.println("carr�� ����: " + carr.length);

		// ��ĳ�� Ȱ���Ͽ� �迭���� �Է� �޾� �Ҵ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Ҵ��� �迭�� ���� �Է� : ");
		int size = sc.nextInt();

		double darr[] = new double[size];

		System.out.println("darr�� hashcode: " + darr.hashCode());
		System.out.println("darr�� ����: " + darr.length);

		darr = new double[30];// �迭�� �迭�� ũ�� ���� �ϱ� ���� �ٽ� �Ҵ��������

		System.out.println("���� �� darr�� hashcode: " + darr.hashCode());
		System.out.println("���� �� darr�� ����: " + darr.length);

		darr = null;

		//System.out.println("���� �� darr�� ����: " + darr.length);������
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
