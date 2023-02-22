package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_16968 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split("");
        int count = 1;
        for(int i = 0; i < input.length; i ++){
            if("d".equals(input[i])) {
                if( i == 0 || !input[i].equals(input[i])){
                    count *= 10;
                }
                else {
                    count *= 9;
                }
            }
            else if("c".equals(input[i])) {
                if( i == 0 || !input[i].equals(input[i])){
                    count *= 26;
                }
                else {
                    count *= 25;
                }
            }
        }
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }

}
