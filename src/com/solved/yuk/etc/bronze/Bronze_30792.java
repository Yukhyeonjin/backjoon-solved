package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30792{
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int gaheeVote = Integer.parseInt(br.readLine()), rank = 1;
        String input[] = br.readLine().split(" ");
        for(int i = 0; i < input.length; i ++){
            if(Integer.parseInt(input[i]) > gaheeVote) rank++;
        }
        bw.write(rank+"");
        


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
