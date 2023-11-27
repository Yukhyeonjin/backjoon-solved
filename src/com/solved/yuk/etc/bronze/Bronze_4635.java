package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4635 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input, inputArr[];
        int n, s[], t[], miles;
        while (!"-1".equals(input = br.readLine())){
            n = Integer.parseInt(input);
            s = new int[n];
            t = new int[n];
            miles = 0;
            for(int i = 0; i < n; i ++){
                inputArr = br.readLine().split(" ");
                s[i] = Integer.parseInt(inputArr[0]);
                t[i] = Integer.parseInt(inputArr[1]);
            }
            for(int i = 0; i < n; i ++){
                if(i != 0) miles += s[i]*(t[i]-t[i-1]);
                else miles += s[i]*t[i];
            }
            bw.write(miles + " miles");
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
