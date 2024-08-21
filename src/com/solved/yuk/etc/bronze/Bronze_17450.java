package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_17450 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double bestBangforTheBuck = 0;
        String snack = "";

        String input[];
        for (int i = 0; i < 3; i++){
            input = br.readLine().split(" ");
            double price = Double.parseDouble(input[0]);
            double weight = Double.parseDouble(input[1]);

            double bangForTheBuck = 0;

            if (price * 10 >= 5000) {
                bangForTheBuck = (weight * 10) / (price * 10 - 500);
            }
            else {
                bangForTheBuck = (weight * 10) / (price * 10 );
            }

            if (bestBangforTheBuck < bangForTheBuck) {
                bestBangforTheBuck = bangForTheBuck;
                if (i == 0) snack = "S";
                else if (i == 1) snack = "N";
                else if (i == 2) snack = "U";
            }
        }
        bw.write(snack+"");

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}