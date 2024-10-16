package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10395 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] first = br.readLine().split(" "),
                 second = br.readLine().split(" ");
        boolean flag = true;
        for (int i = 0; i < first.length; i++){
            if(first[i].equals(second[i])) {
                flag = false;
                break;
            }
        }
        if(!flag) bw.write("N");
        else bw.write("Y");


        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}