package com.solved.yuk.etc.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bronze_2998 {
    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine(), result = "";
        while (input.length() % 3 != 0) {
            input = "0" + input;
        }

        for(int i = 0; i < input.length()-1; i += 3){
            int a1 = input.charAt(i) - '0',
                a2 = input.charAt(i+1) - '0',
                a3 = input.charAt(i+2) - '0';
            result += Integer.toString(a1 * 4 + a2 * 2 + a3 * 1);
        }
        bw.write(result);

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
