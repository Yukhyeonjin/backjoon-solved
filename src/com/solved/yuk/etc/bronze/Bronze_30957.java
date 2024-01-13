package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30957 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), B = 0, S = 0, A = 0;
        String input = br.readLine();
        for(int i = 0; i < N; i ++){
            if('B' == input.charAt(i)) B++;
            if('S' == input.charAt(i)) S++;
            if('A' == input.charAt(i)) A++;
        }
        if(B == S && S == A) bw.write("SCU");
        else if( B > S && B > A) bw.write("B");
        else if( S > B && S > A) bw.write("S");
        else if( A > B && A > S) bw.write("A");
        else if( B==A) bw.write("BA");
        else if( B==S) bw.write("BS");
        else if( S==A) bw.write("SA");


        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws Exception {
        solution();
    }
}
