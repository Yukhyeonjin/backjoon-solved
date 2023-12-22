package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4696 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        double num;
        while (!"0".equals(input = br.readLine())){
            num = Double.parseDouble(input);
            bw.write(String.format("%.2f", (1+num+Math.pow(num,2)+Math.pow(num,3)+Math.pow(num,4)))+"");
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

