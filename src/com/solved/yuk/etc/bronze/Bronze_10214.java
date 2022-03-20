package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10214 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()), yonsei, korea ;
        String input[];
        for(int i = 0; i < T; i ++){
            yonsei = 0; korea = 0;
            for(int j = 0; j < 9; j ++){
                input = br.readLine().split(" ");
                yonsei += Integer.parseInt(input[0]);
                korea  += Integer.parseInt(input[1]);
            }
            if(yonsei > korea) bw.write("Yonsei\n");
            else if(yonsei < korea) bw.write("Korea\n");
            else bw.write("DRAW\n");
        }

        bw.flush();
        bw.close();
    }
}
