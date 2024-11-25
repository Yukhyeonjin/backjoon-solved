package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_9635 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i ++){
            String input[] = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int X = Integer.parseInt(input[1]);
            int Y = Integer.parseInt(input[2]);
            
            input = br.readLine().split(" ");
            if(Integer.parseInt(input[0]) == X && Integer.parseInt(input[N-1]) == Y) bw.write("BOTH");
            else if(Integer.parseInt(input[0]) == X) bw.write("EASY");
            else if(Integer.parseInt(input[N-1]) == Y) bw.write("HARD");
            else bw.write("OKAY");
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
