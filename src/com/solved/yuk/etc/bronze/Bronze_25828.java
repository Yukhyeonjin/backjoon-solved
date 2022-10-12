package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int g = Integer.parseInt(input[0]), // 그룹 수
            p = Integer.parseInt(input[1]), // 그룹별 사람 수
            t = Integer.parseInt(input[2]); // 양성 반응을 보인 그룹의 수, 개별 테스트 필요
        int caseOne = g + p*t, caseTwo = g*p;
        bw.write(caseOne == caseTwo ? "0" : caseOne > caseTwo ? "1" : "2");


        bw.flush();
        br.close();
        bw.close();
    }
}
