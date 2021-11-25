package com.solved.yuk.etc.bronze;


import java.io.*;

public class Bronze_2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]), // 시
            B = Integer.parseInt(input[1]), // 분
            C = Integer.parseInt(input[2]), // 초
            D = Integer.parseInt(br.readLine()); // 흐른 초
        A += D/3600; D %= 3600;
        B += D/60;   C += D%60;
        if(C > 59){
            B++;
            C -= 60;
        }
        if(B > 59){
            A++;
            B -= 60;
        }
        if(A > 23){
            A %= 24;
        }
        bw.write(A + " " + B + " " + C);


        bw.flush();
        bw.close();

    }
}
