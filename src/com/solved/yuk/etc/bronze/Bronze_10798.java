package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10798 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String arr[] = new String[5*15];
        for(int i = 0; i < 5; i ++){
            String input[] = br.readLine().split("");
            int indexPosition = 0;
            for(int j = 0; j < input.length; j ++){
                arr[i+indexPosition] = input[j];
                indexPosition+=5;
            }
        }
        for (int i = 0; i < arr.length; i ++){
            if(arr[i] != null && !"".equals(arr[i])){
                bw.write(arr[i]);
            }
        }

        bw.flush();
        bw.close();
    }

}
