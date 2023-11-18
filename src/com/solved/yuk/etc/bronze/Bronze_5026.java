package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5026 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input[], inputLine="";
        for(int i = 0; i < N; i ++){
            inputLine = br.readLine();
            if("P=NP".equals(inputLine)) bw.write("skipped");
            else {
                input = inputLine.split("\\+");
                bw.write(Integer.parseInt(input[0]) + Integer.parseInt(input[1])+"");
            }
            bw.newLine();
        }


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
