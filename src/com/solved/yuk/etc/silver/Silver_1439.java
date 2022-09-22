package com.solved.yuk.etc.silver;

import java.io.*;

public class Silver_1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int zeroCount = 0, oneCount = 0, zero = 0, one = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '0') {
                if(zero == 0) zeroCount++;
                zero++;
                one = 0;
            } else {
                if(one == 0) oneCount++;
                one++;
                zero = 0;
            }
        }
        bw.write((oneCount > zeroCount ? zeroCount : oneCount) + "");

        bw.flush();
        br.close();
        bw.close();
    }
}
