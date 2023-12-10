package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25642 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" "), turn = "A";
        int A = Integer.parseInt(input[0]),
            B = Integer.parseInt(input[1]);
        while (true){
            if("A".equals(turn)) {
                B += A;
                if(B >= 5) {
                    bw.write("yt");
                    break;
                }
                turn = "B";
            }
            else {
                A += B;
                if(A >= 5) {
                    bw.write("yj");
                    break;
                }
                turn = "A";
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}