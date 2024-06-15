package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11121 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i ++){
            String input[] = br.readLine().split(" ");
            if(input[0].equals(input[1])) bw.write("OK");
            else bw.write("ERROR");
            bw.newLine();
        }


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

