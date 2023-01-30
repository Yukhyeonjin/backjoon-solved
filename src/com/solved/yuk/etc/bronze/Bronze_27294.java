package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27294 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int time = Integer.parseInt(input[0]),
            drink = Integer.parseInt(input[1]);
        if(drink == 1 || time < 12 || time > 16){
            bw.write("280");
        } else {
            bw.write("320");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
