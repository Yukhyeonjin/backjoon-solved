package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_18409 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()), count = 0;
        String input = br.readLine();
        for(int i = 0; i < n; i ++){
            char c = input.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') count++;
        }
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
