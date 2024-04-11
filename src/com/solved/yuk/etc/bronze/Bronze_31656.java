package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31656 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split("");
        String res = "", temp = "";
        for (int i = 0; i < input.length; i ++){
            if(!temp.equals(input[i])){
                temp = input[i];
                res += input[i];
            }
        }
        bw.write(res);

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

