package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_16861 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        while (true) {
            String strNum = String.valueOf(n);
            int sumDigits = 0;
            for (int i = 0; i < strNum.length(); i ++){
                char c = strNum.charAt(i);

                sumDigits += c - '0';
            }
            if (n % sumDigits == 0) {
                bw.write(n+"");
                break;
            }
            n++;
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

