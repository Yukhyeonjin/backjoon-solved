package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5220 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++){
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int p = Integer.parseInt(input[1]);

            int r = 0;

            String binaryString = Integer.toBinaryString(n);
            for(char c : binaryString.toCharArray()){
                r += c -'0';
            }
            if((r%2==0 && p==0)||(r%2==1 && p==1)) {
                bw.write("Valid");
            }
            else {
                bw.write("Corrupt");
            }
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