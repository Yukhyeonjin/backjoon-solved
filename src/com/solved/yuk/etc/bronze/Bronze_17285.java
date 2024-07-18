package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_17285 {
    
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
		char key = (char)((input.charAt(0)) ^ (int)'C');
		for(int i = 0; i < input.length(); i++) {
		    bw.write((char)((int)(input.charAt(i)) ^ (int)key));
		}

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}
