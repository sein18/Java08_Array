package com.test01;

public class ArrayTest03 {

	public static void main(String[] args) {

		new ArrayTest03().deepCopy3();

	}

	public void shallowCopy() {
		//얕은복사 -> 배열의 주소만 복사한다.

		int oArr[] = { 1, 2, 3, 4, 5 };
		int cArr[] = oArr;

		String str = "";

		for (int i = 0; i < oArr.length; i++) {
			str += oArr[i] + " ";
		}

		System.out.println("1.oArr : " + str);

		// 복사한 배열의 값을 str에 저장하여 출력;
		str = "";
		for (int i = 0; i < cArr.length; i++) {
			str += cArr[i] + " ";
		}
		System.out.println("2.cArr : " + str);

		// 원본배열 값 변경
		oArr[0] = 99;
		
		//변경 후 출력
		str = "";

		for (int i = 0; i < oArr.length; i++) {
			str += oArr[i] + " ";
		}

		System.out.println("1.oArr : " + str);

		//변경 후 출력
		str = "";
		for (int i = 0; i < cArr.length; i++) {
			str += cArr[i] + " ";
		}
		
		System.out.println("2.cArr : " + str);
		
		System.out.println("oArr의 hashcode : " + oArr.hashCode());
		System.out.println("cArr의 hashcode : " + cArr.hashCode());

	}
	
	public void deepCopy() {
		//깊은 복사는 새로운 배열 하나를 생성하고 값을 복사
		int oArr[] = {1,2,3,4,5};
		int cArr[] = new int[5];
		
		//for을 이용한 깊은복사
		for (int i = 0; i < oArr.length; i++) {
			cArr[i] = oArr[i];
		}

		// 원본 출력
		String str = "";
		for (int i = 0; i < oArr.length; i++) {
			str += oArr[i] + " ";
		}
		System.out.println("oArr : " + str);
		
		// 복사본 출력
		str = "";
		for (int i = 0; i < cArr.length; i++) {
			str += cArr[i] + " ";
		}
		System.out.println("cArr : "+ str);
		
		// 값 변경
		oArr[0] = 99;

		// 변경 후 원본 출력
		str = "";
		for (int i = 0; i < oArr.length; i++) {
			str += oArr[i] + " ";
		}
		System.out.println("oArr : " + str);

		// 변경 후 복사본 출력
		str = "";
		for (int i = 0; i < cArr.length; i++) {
			str += cArr[i] + " ";
		}
		System.out.println("cArr : " + str);

		System.out.println("oArr의 hashcode : " + oArr.hashCode());
		System.out.println("cArr의 hashcode : " + cArr.hashCode());
	}

	public void deepCopy2() {
		// System에 있는 arraycopy()

		int oArr[] = { 1, 2, 3, 4, 5 };
		int cArr[] = new int[10];

		// arraycopy(scr,scrPos,dest,destPos,length)
		// src:원본 배열, srcPos:복사시작위치
		// dest:카피배열, destPos:붙여넣기시작위치
		// length: 복사될 길이
		System.arraycopy(oArr, 0, cArr, 5, oArr.length);

		// 원본 출력
		String str = "";
		for (int i = 0; i < oArr.length; i++) {
			str += oArr[i] + " ";
		}
		System.out.println("oArr : " + str);
		// 복사본 출력

		str = "";
		for (int i = 0; i < cArr.length; i++) {
			str += cArr[i] + " ";
		}
		System.out.println("cArr : " + str);
		
		System.out.println("oArr의 hashcode : " + oArr.hashCode());
		System.out.println("cArr의 hashcode : " + cArr.hashCode());
	}

	public void deepCopy3() {
		// clone()
		int oArr[] = { 1, 2, 3, 4, 5 };
		int cArr[] = new int[10];

		System.out.println("준비된 cArr의 hashcode: " + cArr.hashCode());

		cArr = oArr.clone();

		System.out.println("준비된 배열의 hashcode: " + cArr.hashCode());

		// 원본 출력
		String str = "";
		for (int i = 0; i < oArr.length; i++) {
			str += oArr[i] + " ";
		}
		System.out.println("oArr : " + str);
		// 복사본 출력

		str = "";
		for (int i = 0; i < cArr.length; i++) {
			str += cArr[i] + " ";
		}
		System.out.println("cArr : " + str);

		System.out.println("oArr의 hashcode : " + oArr.hashCode());
		System.out.println("cArr의 hashcode : " + cArr.hashCode());

	}












}
