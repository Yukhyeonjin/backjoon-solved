package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int chip = Integer.parseInt(input[0]), count = Integer.parseInt(input[1]), money = Integer.parseInt(input[2]);
        int needMoney = chip*count-money > 0 ? chip*count-money : 0;
        bw.write(needMoney+"");


        bw.flush();
        bw.close();

    }
}
