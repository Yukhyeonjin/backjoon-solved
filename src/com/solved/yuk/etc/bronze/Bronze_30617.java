package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30617 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int preL = -2, preR = -2;
        int funScore = 0;
        for(int i = 0; i < T; i ++){
            String[] input = br.readLine().split(" ");
            int l = Integer.parseInt(input[0]);
            int r = Integer.parseInt(input[1]);
            if(l != 0 && preL == l) funScore++;
            if(r != 0 && preR == r) funScore++;
            if(l != 0 && r != 0 && l == r) funScore++;
            preL = l;
            preR = r;
        }
        bw.write(funScore+"");

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}
