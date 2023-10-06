package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1816 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        long passwordKey;
        boolean isAppropriate;
        for(int i = 0; i < N; i ++){
            passwordKey = Long.parseLong(br.readLine());
            isAppropriate = true;
            for(int j = 2; j<= 1000000; j ++){
                if(passwordKey % j == 0) {
                    isAppropriate = false;
                    break;
                }
            }
            if(isAppropriate) bw.write("YES");
            else bw.write("NO");
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

