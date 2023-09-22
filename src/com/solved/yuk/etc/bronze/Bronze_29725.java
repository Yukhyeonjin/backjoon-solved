package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_29725 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[]; int sum = 0;
        for(int i = 0; i < 8; i ++){
            input = br.readLine().split("");
            for(int j = 0; j < 8; j ++){
                if("P".equals(input[j])) sum+=1;
                else if("N".equals(input[j]) || "B".equals(input[j])) sum+=3;
                else if("R".equals(input[j])) sum+=5;
                else if("Q".equals(input[j])) sum+=9;
                if("p".equals(input[j])) sum-=1;
                else if("n".equals(input[j]) || "b".equals(input[j])) sum-=3;
                else if("r".equals(input[j])) sum-=5;
                else if("q".equals(input[j])) sum-=9;
            }
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

