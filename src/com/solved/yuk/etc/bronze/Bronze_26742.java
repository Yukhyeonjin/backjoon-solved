package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26742 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split("");
        int b = 0, c = 0;
        for(int i = 0; i< input.length; i ++){
            if("B".equals(input[i])) b++;
            else if("C".equals(input[i])) c++;
        }
        bw.write(b/2 + c/2 +"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

