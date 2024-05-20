package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_6888 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());
        for(int i = X; i <= Y;){
            bw.write("All positions change in year "+i+"\n");
            i += 60;
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
