package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_8949 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input[] = br.readLine().split(" ");
        String A = input[0];
        String B = input[1];
        int aLength = A.length(), a, 
            bLength = B.length(), b,
            difLength;
        StringBuilder sb = new StringBuilder();
        if(aLength > bLength) {
            difLength = aLength - bLength; 
            for(int i = 0; i < difLength; i++){
                sb.append(String.valueOf(A.charAt(i)));
            }
            for(int i = 0; i < bLength; i++){
                a = Integer.parseInt(String.valueOf(A.charAt(i+difLength)));
                b = Integer.parseInt(String.valueOf(B.charAt(i)));
                sb.append(String.valueOf(a+b));
            }
        }
        else if(A.length() < B.length()) {
            difLength = bLength - aLength;
            for(int i = 0; i < difLength; i++){
                sb.append(String.valueOf(B.charAt(i)));
            }
            for(int i = 0; i < aLength; i++){
                a = Integer.parseInt(String.valueOf(A.charAt(i)));
                b = Integer.parseInt(String.valueOf(B.charAt(i+difLength)));
                sb.append(String.valueOf(a+b));
            }
        }
        else {
            for(int i = 0; i < aLength; i++){
                a = Integer.parseInt(String.valueOf(A.charAt(i)));
                b = Integer.parseInt(String.valueOf(B.charAt(i)));
                sb.append(String.valueOf(a+b));
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
