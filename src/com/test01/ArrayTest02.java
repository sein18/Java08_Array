package com.test01;

import java.lang.Character;

public class ArrayTest02 {
	public static void main(String[] args) {
		// 배열에 데이터 입력
		// a~z
		char ch[] = new char[26];

		for (int i = 0; i < 26; i++) {
			ch[i] = (char) ((int) 'a' + i);
		}
		
		// 1. a~z 가 들어있는 일차원 배열 출력
		new ArrayTest02().prn(ch);
		
		// 2. 배열을 거꾸로 출력
		new ArrayTest02().reverse(ch);

		// 3. 대문자로 변경하여 출력
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
		//새로운 배열 re[] 를 만들어 역순으로 저장 후 실행.
		char re[] = new char[26];
		for(int i=0;i<ch.length;i++)
			re[i]=ch[25-i];
		
		prn(re);
	
	System.out.println();
	}
	
	public void upper(char ch[]) {
		// ch->대문자로,prn(ch)
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) ((int) ch[i] - 32);
		 //ch[i]=Character.toUpperCase(ch[i]);
		}
		prn(ch);
	}
}
