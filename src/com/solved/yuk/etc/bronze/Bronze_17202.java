package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_17202 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] A = br.readLine().split(""),
                 B = br.readLine().split("");
        String str = "";
        for(int i = 0; i < A.length; i ++){
            str = str + A[i] + B[i];
        }
        String[] newStrArr = str.split("");
        while (true) {
            if(newStrArr.length == 2) break;
            str = "";
            for(int i = 0; i < newStrArr.length-1; i ++){
                int sum = Integer.parseInt(newStrArr[i]) + Integer.parseInt(newStrArr[i+1]);
                if(sum >= 10) sum %= 10;
                str += String.valueOf(sum);
            }
            newStrArr = str.split("");
        }
        bw.write(newStrArr[0]+newStrArr[1]);

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

