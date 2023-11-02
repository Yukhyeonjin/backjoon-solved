package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30402 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        for (int i = 0; i < 15; i ++){
            input = br.readLine();
            if(input.contains("w")) {
                bw.write("chunbae");
                break;
            }
            else if(input.contains("b")) {
                bw.write("nabi");
                break;
            }
            else if(input.contains("g")) {
                bw.write("yeongcheol");
                break;
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

