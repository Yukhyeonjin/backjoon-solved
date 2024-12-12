package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_14182 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double input;
        while ((input = Double.parseDouble(br.readLine())) != 0) {
            if(input <= 1000000) {
                bw.write((int)input+"\n");
            }
            else if(input <= 5000000) {
                bw.write((int)(input*0.9)+"\n");
            }
            else {
                bw.write((int)(input*0.8)+"\n");
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
