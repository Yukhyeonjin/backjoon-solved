package com.solved.yuk.etc.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bronze_11772 {
    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), number, pot, sum = 0;
        String input;
        for(int i = 0; i < N; i ++){
            input = br.readLine();
            number = Integer.parseInt(input.substring(0, input.length()-1));
            pot = Integer.parseInt(input.substring(input.length()-1, input.length()));
            sum += Math.pow(number,pot);
        }
        bw.write(sum+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
