package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++){
            String input[] = br.readLine().split(" ");
            int r = Integer.parseInt(input[0]),
                e = Integer.parseInt(input[1]),
                c = Integer.parseInt(input[2]);
            if(r > e-c){
                bw.write("do not advertise");
            }
            else if(r < e-c){
                bw.write("advertise");
            }
            else {
                bw.write("does not matter");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}
