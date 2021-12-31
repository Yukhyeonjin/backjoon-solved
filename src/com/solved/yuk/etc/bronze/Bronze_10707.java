package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10707 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine()), // 1리터당 요금
            B = Integer.parseInt(br.readLine()), // 기본요금
            C = Integer.parseInt(br.readLine()), // 사용량의 상한 (넘어가면 C + 리터당 요금)
            D = Integer.parseInt(br.readLine()), // 1리터 당 추가요금
            P = Integer.parseInt(br.readLine()), // 한 달간의 수도 양
            Xsum = A*P, Ysum = 0;
        if(P > C){
            Ysum = B + (P-C) * D;
        } else Ysum = B;
        bw.write((Xsum > Ysum ? Ysum : Xsum) + "");

        bw.flush();
        bw.close();
    }
}
