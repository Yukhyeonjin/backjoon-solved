package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), score = 0;
        for(int i = 0; i < N; i ++){
            String input[] = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]),
                b = Integer.parseInt(input[1]),
                c = Integer.parseInt(input[2]);
            int sum = 0;
            if(a == b && b == c) sum += 10000 + (a) * 1000;
            else if((a == b && b != c) || (a == c && a != b) || (b == c && a != c)){
                sum += 1000 + (a == b ? a : (a == c ? a : (b==c?b:a))) * 100;
            }else {
                sum += Math.max(a,Math.max(b,c))*100;
            }
            score = Math.max(sum, score);
        }
        bw.write(score+"");

        bw.flush();
        bw.close();
    }
}
