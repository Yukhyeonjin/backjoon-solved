package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2711 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++){
            String input[] = br.readLine().split(" ");
            String line = input[1];
            int index = Integer.parseInt(input[0])-1;
            bw.write(line.substring(0,index)+line.substring(index+1,line.length())+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
