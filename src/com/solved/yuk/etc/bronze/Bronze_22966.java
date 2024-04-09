package com.solved.yuk.etc.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze_22966 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int size = Integer.parseInt(br.readLine());
		
		int min = 5;
		String answer = "";
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int n = Integer.parseInt(st.nextToken());
			
			if(n < min) {
				min = n;
				answer = s;
			}
		}
		System.out.print(answer);
	}
}
