package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_8760 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int Z = Integer.parseInt(br.readLine()), W, K;
		String input[];
		for(int i = 0; i < Z; i ++){
		    input = br.readLine().split(" ");
			W = Integer.parseInt(input[0]);
			K = Integer.parseInt(input[1]);
			
			bw.write(W*K/2+"\n");
		}
		

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
