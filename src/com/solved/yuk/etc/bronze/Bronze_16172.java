package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_16172 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String parent = br.readLine().replaceAll("[0-9]", "");
		String pattern = br.readLine();
		System.out.println(kmp(parent, pattern) ? 1 : 0);
	}
	static boolean kmp(String parent, String pattern) {
		int[] table = makeTable(pattern);
		
		int n1 = parent.length();
		int n2 = pattern.length();
		
		int idx = 0;
		for(int i=0; i<n1; i++) {
			while(idx > 0 && parent.charAt(i) != pattern.charAt(idx)) {
				idx = table[idx-1];
			}
			
			if(parent.charAt(i) == pattern.charAt(idx)) {
				if(idx == n2-1) {
					idx = table[idx];
					return true;
				}else {
					idx++;
				}
			}
		}
		return false;
	}
	static int[] makeTable(String pattern) {
		int n = pattern.length();
		int[] table = new int[n];
		
		int idx = 0;
		for(int i=1; i<n; i++) {
		
			while(idx > 0 && pattern.charAt(i) != pattern.charAt(idx)) {
				idx = table[idx-1];
			}
			
			if(pattern.charAt(i) == pattern.charAt(idx)) {
				idx ++;
				table[i] = idx;
			}
		}
		
		return table;
				
	}
}
