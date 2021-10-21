package com.solved.yuk.etc.bronze;


import java.io.*;

public class Bronze_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]), // 시
            B = Integer.parseInt(input[1]), // 분
            C = Integer.parseInt(br.readLine()); // 필요한 시간(분)
        B+=C;
        if(B >= 60) {
            A += B/60;
            B = B - (60*(B/60));
            A = A >= 24 ? A - 24 : A;
        }
        bw.write(A + " " + B);

        bw.flush();
        bw.close();

    }
}
