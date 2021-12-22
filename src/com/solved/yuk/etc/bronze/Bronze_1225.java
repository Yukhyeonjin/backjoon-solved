package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        String[] A = input[0].replaceAll("0","").split(""),
                 B = input[1].replaceAll("0","").split("");
        int a,b; long sum = 0;
        if(input[0].equals("0") || input[1].equals("0")) bw.write("0");
        else {
            for(int i = 0; i < A.length; i ++){
                a = Integer.parseInt(A[i]);
                for( int j = 0; j < B.length; j ++){
                    b = Integer.parseInt(B[j]);
                    sum = sum + (a*b);
                }
            }
            bw.write(sum+"");
        }


        bw.flush();
        bw.close();
    }
}
