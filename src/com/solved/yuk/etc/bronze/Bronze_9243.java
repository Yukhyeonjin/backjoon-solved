package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_9243 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] beforeBit = br.readLine().split(""),
                 afterBit = br.readLine().split("");
        boolean flag = true;
        for (int i = 0; i < beforeBit.length; i++) {
            if (N % 2 == 0) {
                if(!beforeBit[i].equals(afterBit[i])) {
                    flag = false;
                    break;
                }
            } else {
                if(beforeBit[i].equals(afterBit[i])) {
                    flag = false;
                    break;
                }
            }
        }
        if(flag) bw.write("Deletion succeeded");
        else bw.write("Deletion failed");

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

