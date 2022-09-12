package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_16017 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int firstDigit  = Integer.parseInt(br.readLine()),
            secondDigit = Integer.parseInt(br.readLine()),
            thirdDigit  = Integer.parseInt(br.readLine()),
            fourthDigit = Integer.parseInt(br.readLine());
        if((firstDigit == 8 || firstDigit == 9) && (secondDigit == thirdDigit) && (fourthDigit == 8 || fourthDigit == 9)) bw.write("ignore");
        else bw.write("answer");

        bw.flush();
        br.close();
        bw.close();
    }
}
