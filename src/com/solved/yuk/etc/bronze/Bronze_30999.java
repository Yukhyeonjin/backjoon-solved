package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30999 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input[] = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]),
		    M = Integer.parseInt(input[1]), O, X, result = 0;
		for(int i = 0; i < N; i ++){
		    input = br.readLine().split("");
			O = 0;
			X = 0;
			for(int j = 0; j < M; j ++){
			    if("O".equals(input[j])) O++;
				else X++;
			}
			if(O > X) result++;
		}
		bw.write(result+"");
		

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
