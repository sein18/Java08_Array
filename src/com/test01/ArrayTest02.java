package com.test01;

import java.lang.Character;

public class ArrayTest02 {
	public static void main(String[] args) {
		// �迭�� ������ �Է�
		// a~z
		char ch[] = new char[26];

		for (int i = 0; i < 26; i++) {
			ch[i] = (char) ((int) 'a' + i);
		}
		
		// 1. a~z �� ����ִ� ������ �迭 ���
		new ArrayTest02().prn(ch);
		
		// 2. �迭�� �Ųٷ� ���
		new ArrayTest02().reverse(ch);

		// 3. �빮�ڷ� �����Ͽ� ���
		new ArrayTest02().upper(ch);
		
		new ArrayTest02().prn(ch);
	}
	
	
	public void prn(char ch[]) {
		// a b c d e f g . . . x y z
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
			if (i % 6 == 5)
				System.out.println();
		}
		System.out.println();
	}
	
	public void reverse(char ch[]) {
		//���ο� �迭 re[] �� ����� �������� ���� �� ����.
		char re[] = new char[26];
		for(int i=0;i<ch.length;i++)
			re[i]=ch[25-i];
		
		prn(re);
	
	System.out.println();
	}
	
	public void upper(char ch[]) {
		// ch->�빮�ڷ�,prn(ch)
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) ((int) ch[i] - 32);
		 //ch[i]=Character.toUpperCase(ch[i]);
		}
		prn(ch);
	}
}
