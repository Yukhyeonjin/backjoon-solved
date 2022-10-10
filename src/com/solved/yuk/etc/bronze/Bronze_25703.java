package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25703 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        bw.write("int a;\n" + "int *ptr = &a;\n");
        for(int i = 2; i <= N; i ++){
            bw.write("int ");
            for(int j = 0; j < i; j ++){
                bw.write("*");
            }
            bw.write("ptr"+i+" = &ptr"+ ((i-1) == 1 ? "" : (i-1)) +";\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
