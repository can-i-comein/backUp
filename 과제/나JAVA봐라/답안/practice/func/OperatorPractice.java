package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		String str = num > 0 ? "양수다" : "양수가 아니다";
		System.out.println(str);
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		String str = num > 0 ? "양수다" : (num == 0 ? "0이다" : "음수다");
		System.out.println(str);
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		String str = num % 2 == 0 ? "짝수다" : "홀수다";
		System.out.println(str);
	}

	public void practice4() {

		Scanner sc = new Scanner(System.in);
		int people;
		int candy;

		System.out.print("인원 수 : ");
		people = sc.nextInt();

		System.out.print("사탕 개수 : ");
		candy = sc.nextInt();

		System.out.println("1인당 사탕 개수 : " + candy / people);
		System.out.println("남는 사탕 개수 : " + candy % people);
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();

		String student = gender == 'M' ? "남학생" : "여학생";

		System.out.println();
		System.out.println(
				grade + "학년 " + classNum + "반 " + num + "번 " + name + " " + student + "의 성적은 " + score + "이다.");

	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();

		String str = age <= 13 ? "어린이" : (age > 19 ? "성인" : "청소년");
		System.out.println(str);
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();

		System.out.println();

		int sum = kor + eng + math;
		double avg = sum / 3.0;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);

		String result = kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격" : "불합격";
		System.out.println(result);
		// System.out.println(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격" : "불합격");
		
//		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60){
//			System.out.println("합격"); }else{ System.out.println("불합격");
//		}
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char pId = sc.nextLine().charAt(7);

		String gender = pId == '1' || pId == '3' ? "남자" : "여자";
		System.out.println(gender);
	}

	public void practice9() {

		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int input;

		System.out.print("정수1 : ");
		num1 = sc.nextInt();

		System.out.print("정수2 : ");
		num2 = sc.nextInt();

		System.out.print("입력 : ");
		input = sc.nextInt();

		System.out.println((input <= num1) || (input > num2));

	}

	public void practice10() {

		Scanner sc = new Scanner(System.in);
	

		System.out.print("입력1 : ");
		int num1 = sc.nextInt();

		System.out.print("입력2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력3 : ");
		int num3 = sc.nextInt();

		boolean isTrue = (num1 == num2) && (num2 == num3);
		System.out.println(isTrue);

	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int a = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int b = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int c = sc.nextInt();

		double aIncen = a * 1.4;
		double bIncen = b;
		double cIncen = c * 1.15;
		// double cIncen = c + c * 0.15;
		/***
		 	float, double는 실수를 부동소수점 방식으로 저장하는데 이 때 근사 값으로 저장
		 		부동소수 2진화 계산법 ==> 소수 같은 경우 x2를 해서 앞이 0.인지 1.인지로 2진수 표현
		 		ex. 0.1234567
		 			x2 = 0.2469134  --- 0
		 			x2 = 0.4938268  --- 0
		 			x2 = 0.9876536  --- 0
		 			x2 = 1.9753072  --- 1
		 			-1 = 0.9753072
		 			x2 = 1.9506144  --- 1 ....
		 	==> 소수점 아래 부분을 이진화 시 딱 떨어지지 않을 경우 
		 	      무한 소수가 되어 가수부를 순서대로 채우다가 가수부의 용량(float : 23bit / double : 52bit)까지만 값을 저장
		 	    --> 이 때 1차적으로 오차 발생
		 	
		 	따라서 float, double 사용 시 표현되는 값은 근사 값으로 표현
		 	
		 	0.15를 double형 변수에 부동소수점 방식으로 저장 시
			[부동 소수점 표현]
				부호 1,         지수 11, 
				  0          011 1111 1100 
				                                            가수 52
				0011 0011 0011 0011 0011 0011 0011 0011 0011 0011 0011 0011
				
				이와같이 표현되고
				
				이걸 다시 실제값으로 변환하면
				
				0.14999999999998858690730685339076
				
				오차가 발생한 것을 확인 가능
				
				double 0.15 실제 값 : 0.1499999999999999944488848768742172978818416595458984375
				double 1.15 실제 값 : 1.149999999999999911182158029987476766109466552734375
			
		 */

		System.out.println();

		String s1 = "3000 이상";
		String s2 = "3000 미만";

		System.out.println("A사원 연봉/연봉+a : " + a + "/" + aIncen);
		System.out.println(aIncen >= 3000 ? s1 : s2);
		System.out.println("B사원 연봉/연봉+a : " + b + "/" + bIncen);
		System.out.println(bIncen >= 3000 ? s1 : s2);
		System.out.println("C사원 연봉/연봉+a : " + c + "/" + cIncen);
		System.out.println(cIncen >= 3000 ? s1 : s2);

	}

}
