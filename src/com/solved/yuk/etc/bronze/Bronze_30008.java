package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30008 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]), K = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        for(int i = 0; i < K; i++){
            int P = Integer.parseInt(input[i])*100/N;
            if(P >= 0 && P <= 4) bw.write("1");
            else if(P >= 4 && P <= 11) bw.write("2");
            else if(P >= 11 && P <= 23) bw.write("3");
            else if(P >= 23 && P <= 40) bw.write("4");
            else if(P >= 40 && P <= 60) bw.write("5");
            else if(P >= 60 && P <= 77) bw.write("6");
            else if(P >= 77 && P <= 89) bw.write("7");
            else if(P >= 89 && P <= 96) bw.write("8");
            else if(P >= 96 && P <= 100) bw.write("9");
            if(i != K-1) bw.write(" ");
        }



        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

