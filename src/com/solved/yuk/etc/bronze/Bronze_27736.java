package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27736 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()),
        approved = 0, rejected = 0, invalid = 0, vote;
        String[] input = br.readLine().split(" ");
        for(int i = 0; i < N; i ++){
            vote = Integer.parseInt(input[i]);
            if(vote == 1) approved++;
            else if(vote == -1) rejected++;
            else invalid++;
        }
        if((N % 2 == 0 ? N/2 : (N+1)/2) <= invalid) bw.write("INVALID");
        else if(approved > rejected) bw.write("APPROVED");
        else bw.write("REJECTED");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

