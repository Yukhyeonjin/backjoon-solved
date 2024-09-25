package com.solved.yuk.etc.bronze;

import java.util.Scanner;

public class Bronze_15351 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int lineCount = sc.nextInt();
		String lineStr[] = new String[lineCount];
		int resultArr[] = new int[lineCount];
		
		sc.nextLine(); //스캐너 입력간 자동으로 line(줄바꿈이 발생해서 작성)
		
		for(int i=0;i<lineStr.length;i++) {
			lineStr[i] = sc.nextLine();
		}
			
		for(int i=0;i<lineCount;i++) {
			for(int j=0;j<lineStr[i].length();j++) {
				if(lineStr[i].charAt(j)!=' ')			
					resultArr[i]+=lineStr[i].charAt(j)-64;
			}
		}
		
		for(int i=0;i<lineStr.length;i++) {
			if(resultArr[i]==100)
				System.out.println("PERFECT LIFE");
			else
				System.out.println(resultArr[i]);
		}
		

	}

}
