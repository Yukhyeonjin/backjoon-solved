package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_12790 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < N; i ++){
            String input[] = br.readLine().split(" ");
            int HP =  Integer.parseInt(input[0]) + Integer.parseInt(input[4]) < 1 ? 1 : Integer.parseInt(input[0]) + Integer.parseInt(input[4]),
                MP =  Integer.parseInt(input[1]) + Integer.parseInt(input[5]) < 1 ? 1 : Integer.parseInt(input[1]) + Integer.parseInt(input[5]),
                ATK = Integer.parseInt(input[2]) + Integer.parseInt(input[6]) < 0 ? 0 : Integer.parseInt(input[2]) + Integer.parseInt(input[6]),
                DEF = Integer.parseInt(input[3]) + Integer.parseInt(input[7]) ;
            bw.write((1*(HP)+5*(MP)+2*(ATK)+2*(DEF))+"\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
