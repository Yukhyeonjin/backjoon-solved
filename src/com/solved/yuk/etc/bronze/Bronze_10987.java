package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10987 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        int sum = 0;
        for(int i = 0; i < line.length(); i++){
            char ch = line.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') sum++;
        }
        bw.write(sum+"");

        bw.flush();
        bw.close();
    }

}
