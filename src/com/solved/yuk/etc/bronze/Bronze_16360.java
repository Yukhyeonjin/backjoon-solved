package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_16360 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            String input = br.readLine();
            int len = input.length();
            char c = input.charAt(input.length()-1);
            char c2 = input.charAt(input.length()-2);
            if (c == 'a') bw.write(input.substring(0,input.length()-1) + "as");
            else if (c == 'i' || c == 'y') bw.write(input.substring(0,input.length()-1) + "ios");
            else if (c == 'l') bw.write(input.substring(0,input.length()-1) + "les");
            else if (c == 'n' ) bw.write(input.substring(0,input.length()-1) + "anes");
            else if (len > 2 && c == 'e' && c2 == 'n') bw.write(input.substring(0,input.length()-2) + "anes");
            else if (c == 'o') bw.write(input.substring(0,input.length()-1) + "os");
            else if (c == 'r') bw.write(input.substring(0,input.length()-1) + "res");
            else if (c == 't') bw.write(input.substring(0,input.length()-1) + "tas");
            else if (c == 'u') bw.write(input.substring(0,input.length()-1) + "us");
            else if (c == 'v') bw.write(input.substring(0,input.length()-1) + "ves");
            else if (c == 'w') bw.write(input.substring(0,input.length()-1) + "was");
            else bw.write(input + "us");

            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}