package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++	) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++	) {
			arr[i] = arr.length - i;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		String[] arr = new String[5];
		arr[0] = "사과";
		arr[1] = "귤";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "참외";
		
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] chArr = new char[str.length()];
		int count = 0;
		
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		for(int i = 0; i < str.length(); i++) {
			chArr[i] = str.charAt(i);
			
			if(ch == chArr[i]) {
				count++;
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		System.out.println(ch + " 개수 : " + count);
	}
	
	public void practice6() {
		String[] strArr = {"월", "화", "수", "목", "금", "토", "일"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		if(num >= 0 && num <= 6) {			
			System.out.println(strArr[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
	}
	
	public void practice8() {
		String[] arr = {"후라이드", "양념", "파닭", "매콤", "치즈", "간장"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.nextLine();
		
		boolean check = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(chicken)) {
				check = true;
				break;
			}
		}
		
		if(check) {
			System.out.println(chicken + "치킨 배달 가능");
		} else {
			System.out.println(chicken + "치킨은 없는 메뉴입니다.");
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String id = sc.nextLine();
		
		char[] chArr = new char[id.length()];
		for(int i = 0; i < id.length(); i++) {
			chArr[i] = id.charAt(i);
		}
		
		char[] copyArr = new char[chArr.length];
//		System.arraycopy(chArr, 0, copyArr, 0, 8);
//		for(int i = 8; i < copyArr.length; i++) {
//			copyArr[i] = '*';
//		}
//		
//		for(int i = 0; i < copyArr.length; i++) {
//			System.out.print(copyArr[i]);
//		}
		
		for(int i = 0; i < copyArr.length; i++) {
			if(i >= 8) {
				copyArr[i] = '*';
			} else {
				copyArr[i] = chArr[i];
			}
			
			System.out.print(copyArr[i]);
		}	
	}
	
	public void practice10() {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
	}
	
	
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		String[] strArr = new String[sc.nextInt()];
		
		sc.nextLine();
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(i+1 + "번째 문자열 : ");
			strArr[i] = sc.nextLine();
		}
		
		String user = null;
		do {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			user = sc.nextLine();
			
			if(user.toUpperCase().equals("Y")) {
				System.out.print("더 입력하고 싶은 개수 : ");
				int add = sc.nextInt();
				String[] newArr = new String[strArr.length + add];
				System.arraycopy(strArr, 0, newArr, 0, strArr.length);
				
				sc.nextLine();
				
				for(int i = strArr.length; i < newArr.length; i++) {
					System.out.print(i+1 + "번째 문자열 : ");
					newArr[i] = sc.nextLine();
				}
				
				strArr = newArr;
			}
			
		} while(!user.toUpperCase().equals("N"));
		
		System.out.println(Arrays.toString(strArr));
	}
	
	//////////////////////////////////// 아래는 hard 문제 답안 ////////////////////////////////////////////////////////////////////////
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr;
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num >= 3 && num % 2 != 0) {
				arr = new int[num];
				int div = num / 2;
				for(int i = 0; i <= div; i++) {
					arr[i] = (i+1);
				}
				for(int i = div+1; i < arr.length; i++) {
					arr[i] = num-i;
				}
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length -1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}
	
	public void practice13() {
		int[] arr = new int[10];

		int max = 1;
		int min = 10;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			if(arr[i] > max) {
				max = arr[i];
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	public void practice14() {
		int[] arr = new int[10];
				
		for(int i = 0; i < arr.length;) {
		
			int random = (int)(Math.random() * 10 + 1);
			boolean check = false;
			
			for(int j = 0; j < i; j++) {
				if(arr[j] == random) {
					check = true;
					break;
				}
			}
			
			if(!check) {
				arr[i] = random;
				System.out.print(arr[i] + " ");
				i++;
			}
		}
	}
	
	public void practice15() {
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length;) {
			int random = (int)(Math.random() * 45 + 1);
			boolean check = false;
			
			for(int j = 0; j < i; j++) {
				if(lotto[j] == random) {
					check = true;
					break;
				}
			}
			
			if(!check) {
				lotto[i] = random;
				i++;
			}
		}
		
		for(int i = 0; i < lotto.length; i++) {
			for(int j = i; j < lotto.length; j++) {				
				if(lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
			
			System.out.print(lotto[i] + " ");
		}
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] chArr = new char[str.length()];
		chArr[0] = str.charAt(0);
		
		boolean check = false;
		for(int i = 1; i < str.length(); i++) {
			for(int j = 0; j < chArr.length; j++) {
				if(str.charAt(i) == chArr[j]) {
					check = true;
					break;
				}
			}
			
			if(!check) {				
				for(int k = 1; k < chArr.length; k++) {
					if(chArr[k] == '\u0000') {
						chArr[k] = str.charAt(i);
						break;
					}
				}				
			}
			check = false;
		}
		
		int count = 0;
		System.out.print("문자열에 있는 문자 : ");
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] != '\u0000') {
				if(i == chArr.length -1) {
					System.out.print(chArr[i]);
					System.out.println();
				} else if(chArr[i+1] == '\u0000') {				
					System.out.print(chArr[i]);
					System.out.println();
				} else {
					System.out.print(chArr[i] + ", ");				
				}
				count++;
			}
		}
		System.out.println("문자 개수 : " + count);
	}
	
	public void practice16_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] chArr = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			boolean check = false;
			for(int j = 0; j < chArr.length; j++) {
				if(str.charAt(i) == chArr[j]) {
					check = true;
					break;
				}
			}
			
			if(!check) {				
				for(int k = 0; k < chArr.length; k++) {
					if(chArr[k] == '\u0000') {
						chArr[k] = str.charAt(i);
						break;
					}
				}				
			}
		}
		
		int count = 0;
		System.out.print("문자열에 있는 문자 : ");
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] != '\u0000') {
				if(i == chArr.length -1) {
					System.out.print(chArr[i]);
					System.out.println();
				} else if(chArr[i+1] == '\u0000') {				
					System.out.print(chArr[i]);
					System.out.println();
				} else {
					System.out.print(chArr[i] + ", ");				
				}
				count++;
			}
		}
		System.out.println("문자 개수 : " + count);
	}
	
	public void practice16_2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] chArr = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			boolean check = false;
			for(int j = 0; j < chArr.length; j++) {
				if(str.charAt(i) == chArr[j]) {
					check = true;
					break;
				}
			}
			
			if(!check) {				
				for(int k = 0; k < chArr.length; k++) {
					if(chArr[k] == '\u0000') {
						chArr[k] = str.charAt(i);
						break;
					}
				}				
			}
		}
		
		int count = 0;
		System.out.print("문자열에 있는 문자 : ");
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] != '\u0000') {
				if(i == chArr.length -1) {
					System.out.print(chArr[i]);
					System.out.println();
				} else if(chArr[i+1] == '\u0000') {				
					System.out.print(chArr[i]);
					System.out.println();
				} else {
					System.out.print(chArr[i] + ", ");				
				}
				count++;
			}
		}
		System.out.println("문자 개수 : " + count);
	}
}
