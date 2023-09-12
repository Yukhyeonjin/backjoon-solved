package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_29736 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]),
            B = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        int K = Integer.parseInt(input[0]),
            X = Integer.parseInt(input[1]), result = 0;
        for(int i = A; i <= B; i ++){
           if(Math.abs(K-i)  <= X) result++;
        }
        if(result > 0) bw.write(result+"");
        else bw.write("IMPOSSIBLE");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

