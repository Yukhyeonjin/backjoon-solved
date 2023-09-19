package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30031 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), width, sum = 0;
        String input[];
        for(int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            width = Integer.parseInt(input[0]);
            if(width == 136) sum += 1000;
            else if(width == 142) sum += 5000;
            else if(width == 148) sum += 10000;
            else if(width == 154) sum += 50000;
        }
        bw.write(sum+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

