package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5032 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int e = Integer.parseInt(input[0]),
            f = Integer.parseInt(input[1]),
            c = Integer.parseInt(input[2]),
            bottle = e+f, juice = bottle/c, drinkJuice = juice;
        while (true) {
            bottle = bottle % c;
            bottle += juice;
            juice = bottle/c;
            drinkJuice += juice;
            if(juice == 0) break;
        }
        bw.write(drinkJuice+"");



        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

