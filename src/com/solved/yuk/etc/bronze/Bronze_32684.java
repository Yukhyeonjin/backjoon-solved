package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32684 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String cocjr[] = br.readLine().split(" ");
        String ekw[] = br.readLine().split(" ");

        double cocjr0208 = 0, ekwoo = 1.5;
        cocjr0208 += Integer.parseInt(cocjr[0]) * 13 + Integer.parseInt(cocjr[1]) * 7 + Integer.parseInt(cocjr[2]) * 5 + Integer.parseInt(cocjr[3]) * 3 + Integer.parseInt(cocjr[4]) * 3 + Integer.parseInt(cocjr[5]) * 2;
        ekwoo += Integer.parseInt(ekw[0]) * 13 + Integer.parseInt(ekw[1]) * 7 + Integer.parseInt(ekw[2]) * 5 + Integer.parseInt(ekw[3]) * 3 + Integer.parseInt(ekw[4]) * 3 + Integer.parseInt(ekw[5]) * 2;
        if(cocjr0208 > ekwoo) bw.write("cocjr0208");
        else bw.write("ekwoo");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
