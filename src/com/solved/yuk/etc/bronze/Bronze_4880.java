package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4880 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input, inputArr[], result;
        while (!"0 0 0".equals(input = br.readLine())){
            inputArr = input.split(" ");
            int a1 = Integer.parseInt(inputArr[0]),
                a2 = Integer.parseInt(inputArr[1]),
                a3 = Integer.parseInt(inputArr[2]), a4;

            if((a2 - a1) == (a3 - a2)){
                a4 = a3 + (a3 - a2);
                result = "AP";
            }else {
                a4 = a3 * (a2 / a1);
                result = "GP";
            }
            bw.write(result + " " + a4 + "\n");
        }

        bw.flush();
        bw.close();
    }
}
