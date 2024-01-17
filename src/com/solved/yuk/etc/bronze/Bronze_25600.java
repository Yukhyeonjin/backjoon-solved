package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25600 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), a,d,g, max = 0, sum = 0;
		String[] input;
        for(int i = 0; i < N; i ++){
			input = br.readLine().split(" ");
			a = Integer.parseInt(input[0]);
			d = Integer.parseInt(input[1]);
			g = Integer.parseInt(input[2]);
			if(a == (d+g)) sum = 2 * (a * (d+g));
			else sum = a * (d+g);
			sum = Math.max(max, sum);
        }
		bw.write(sum+"");



        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
