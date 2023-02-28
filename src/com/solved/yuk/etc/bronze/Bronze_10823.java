package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10823 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input, str = "";
        while ((input = br.readLine()) != null){
            str += input;
        }
        String[] arr = str.split(",");
        int sum = 0;
        for(int i = 0; i < arr.length; i ++){
            sum += Integer.parseInt(arr[i]);
        }
        bw.write(sum+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
