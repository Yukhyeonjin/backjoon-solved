package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_13610 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input[] = br.readLine().split(" ");
		int x = Integer.parseInt(input[0]),
		    y = Integer.parseInt(input[1]), result;
			
		for(result = 1; (y - x) * result < y; result++){}
		
		bw.write(result+"");
		

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
