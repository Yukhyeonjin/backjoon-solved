package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_9610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int Q1 = 0, Q2 = 0, Q3 = 0, Q4 = 0, AXIS = 0;
        
        for(int i = 0; i < N; i ++){
            String input[] = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
            
            if(x == 0 || y == 0) {
				AXIS++;
			}else if(x > 0) {
				//1사분면
				if(y > 0) {
					Q1++;
				//4사분면
				}else {
					Q4++;
				}
			}else if(x < 0) {
				//2사분면
				if(y > 0) {
					Q2++;
				//3사분면
				}else {
					Q3++;
				}
			}
        }
        bw.write("Q1: " + Q1 + "\n");
		bw.write("Q2: " + Q2 + "\n");
		bw.write("Q3: " + Q3 + "\n");
		bw.write("Q4: " + Q4 + "\n");
		bw.write("AXIS: " + AXIS);

        bw.flush();
        br.close();
        bw.close();
    }
}
