package com.solved.yuk.class2.bronze;

import java.io.*;

public class Bronze_2231 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int N = Integer.parseInt(input);
        int output = 0;
        for(int i = 1; i <= N; i ++) {
            String[] M = Integer.toString(i).split("");
            output += i;
            for(int j = 0; j < M.length; j++) {
                output += Integer.parseInt(M[j]);
            }
            if(output == N) {output = i; break;}
            else output = 0;
        }
        bw.write(Integer.toString(output));

        bw.flush();
        bw.close();
    }
}
