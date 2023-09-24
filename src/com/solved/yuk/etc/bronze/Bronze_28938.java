package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_28938 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()), sum = 0;
        String input[] = br.readLine().split(" ");
        for(int i = 0; i < T; i ++){
            sum += Integer.parseInt(input[i]);
        }
        if(sum > 0) bw.write("Right");
        else if(sum < 0) bw.write("Left");
        else bw.write("Stay");



        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

