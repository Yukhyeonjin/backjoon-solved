package com.solved.yuk.bronze;

import java.io.*;

public class Bronze_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while ((input = br.readLine()) != null) {
            String arr[] = input.split(" ");
            int firstNum = Integer.parseInt(arr[0]), secondNum = Integer.parseInt(arr[1]);
            bw.write(firstNum + secondNum + "\n");
        }


        bw.flush();
        bw.close();
    }
}
