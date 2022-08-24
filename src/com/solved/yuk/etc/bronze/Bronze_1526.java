package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1526 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        while (true){
            if("".equals(Integer.toString(N).replaceAll("7","").replaceAll("4",""))){
                break;
            }
            N--;
        }
        bw.write(N+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
