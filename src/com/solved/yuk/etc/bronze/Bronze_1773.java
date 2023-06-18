package com.solved.yuk.etc.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import java.math.BigInteger;
import java.util.StringTokenizer;

public class Bronze_1773 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //인원수
		int C = Integer.parseInt(st.nextToken()); //최대값
		
		int[] arr = new int[N];
		int count = 0;
		for(int i=0;i<N;i++) { //인원수만큼 반복
			arr[i] = Integer.parseInt(br.readLine()); //인원수들이 넣은 값 저장
			}
		
		for(int j=1;j<=C;j++) { //시간초만큼 진행
			for(int i=0;i<N;i++) {//인원수별 진행
				int X =j%arr[i];
				if(X==0) {
					count = count+1;
					//System.out.println(j+"초인데 "+arr[i]+"주기랑겹침");
					break; //중복방지
				}	
			}
		}
		bw.write(count +"\n");	
		bw.close();
		br.close();
	}
}
