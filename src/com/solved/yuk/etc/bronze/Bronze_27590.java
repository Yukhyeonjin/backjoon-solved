package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_27590 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int ds = Integer.parseInt(input[0]);
		int ys = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
		int dm = Integer.parseInt(input[0]);
		int ym = Integer.parseInt(input[1]);
		
		int s = ys - ds;
		int m = ym - dm;
		
		while(s != m) {
			if(s < m) {
				s += ys;
			}else {
				m += ym;
			}
		}
		bw.write(s+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
