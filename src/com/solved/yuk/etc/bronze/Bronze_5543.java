package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int ABurger = Integer.parseInt(br.readLine()), // 상덕버거
            BBurger = Integer.parseInt(br.readLine()), // 중덕버거
            CBurger = Integer.parseInt(br.readLine()), // 하덕버거
            coke = Integer.parseInt(br.readLine()), // 콜라
            cider = Integer.parseInt(br.readLine()); // 사이다
        int minBurger = Math.min(ABurger, Math.min(BBurger, CBurger));
        int minBeverage = Math.min(coke, cider);
        bw.write(minBurger+minBeverage-50+"");

        bw.flush();
        bw.close();
    }
}
