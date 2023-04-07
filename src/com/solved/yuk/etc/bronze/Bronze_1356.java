package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1356 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(""), result = "NO";
        int pre = 1, preNum = 0, suf = 1, sufNum = 0;
        for(int i = 0; i < input.length - 1; i ++){
            pre = 1; suf = 1;
            for(int j = 0; j < i+1; j ++){
                preNum = Integer.parseInt(input[j]);
                pre *= preNum;
            }
            for(int j = i+1; j < input.length; j ++){
                sufNum = Integer.parseInt(input[j]);
                suf *= sufNum;
            }
            if(pre == suf) {
                result = "YES";
                break;
            }
        }
        bw.write(result);

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

