package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_29683 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]),
		    A = Integer.parseInt(input[1]), sum = 0, x;
		input = br.readLine().split(" ");	
		for(int i = 0; i < n; i ++) {
		    x = Integer.parseInt(input[1]);
			sum += x/A;
		}
		bw.write(sum+"");
		

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
