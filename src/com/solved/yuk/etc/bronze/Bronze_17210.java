package com.solved.yuk.etc.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bronze_17210 {
    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine());
        int num = Integer.parseInt(br.readLine());

        if(N > 5) bw.write("Love is open door");
        else {
	        for(int i = 0; i < N-1; i ++){
		        if(num == 1) {
		            bw.write("0\n");
			        num = 0;
		        }
		        else {
        		    bw.write("1\n");
    	    		num = 1;
        		}
    	    }
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
