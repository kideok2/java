package test.main;

import java.util.Random;

public class MainClass15 {
	public static void main(String[] args) {
		//Random 한 숫자를 얻어낼 수 있는 Random 객체
		Random ran=new Random();
		//int 범위 내에서 랜덤한 정수 얻어내기
		int a=ran.nextInt();
		//정해진 범위 내에서 랜덤한 정수 얻어내기 0~9
		int b=ran.nextInt(10);
		//0-19
		int c=ran.nextInt(20);
		// 1~15 사이의 랜덤한 정수 얻어내기
		int d=ran.nextInt(1,16);
		int e=ran.nextInt(15)+1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}
