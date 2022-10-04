package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_17614 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), count = 0;
        for(int i = 1; i <= N; i ++){
            String number = Integer.toString(i);
            for(int j = 0; j < number.length(); j ++){
                char c = number.charAt(j);
                if(c == '3' || c == '6' || c == '9') count++;
            }
        }
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
