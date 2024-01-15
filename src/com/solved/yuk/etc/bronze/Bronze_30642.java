package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30642 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int K = Integer.parseInt(br.readLine());
        if("annyong".equals(input)){
            if(K % 2 == 0) K+=1;
        }
        else if("induck".equals(input)){
            if(K % 2 != 0) K+=1;
        }
        if(K > N) K-=2;
        bw.write(K+"");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

