package com.solved.yuk.etc.bronze;

import java.util.Scanner;

public class Bronze_18883 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(),m=scan.nextInt();
		StringBuffer sb=new StringBuffer();
		for(int i=1;i<=n*m-1;i++) {
			sb.append(i);
			if(i%m==0) 	sb.append("\n");
			else sb.append(" ");
		}
		sb.append(n*m);
		System.out.println(sb.toString());
	}
}
