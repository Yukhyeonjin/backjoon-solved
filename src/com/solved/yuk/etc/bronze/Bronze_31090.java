package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31090 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine()), N;
		for(int i = 0; i < T; i++){
		    N = Integer.parseInt(br.readLine());
			if((N+1) % (N%100) == 0) bw.write("Good\n");
			else bw.write("Bye\n");
		}
		

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
