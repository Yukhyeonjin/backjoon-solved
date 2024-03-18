package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31612 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), count = 0;
        String S = br.readLine();
        for (int i = 0; i < N; i ++){
            if(S.charAt(i) == 'i' || S.charAt(i) == 'j') count+=2;
            else if(S.charAt(i) == 'o') count+=1;
        }
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
