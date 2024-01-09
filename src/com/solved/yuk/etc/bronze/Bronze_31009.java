package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31009 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), C[] = new int[N], j=0;
        String input[];
        for(int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            if("jinju".equals(input[0])) {
                bw.write(Integer.parseInt(input[1])+"\n");
                j = i;
            }
            C[i] = Integer.parseInt(input[1]);
        }
        int count = 0;
        for(int i = 0; i < N; i ++){
            if(i == j) continue;
            if(C[i] > C[j]) count++;
        }
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

