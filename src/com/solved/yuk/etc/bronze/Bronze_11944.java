package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11944 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]), M = Integer.parseInt(input[1]);
        String result = "", nChar = input[0];
        if(nChar.length() * N > M) {
            while (true){
                for(int i = 0; i < nChar.length(); i ++){
                    result += String.valueOf(nChar.charAt(i));
                    if(result.length() == M) break;
                }
                if(result.length() == M) break;
            }

        } else {
            for(int i = 0; i < N; i ++){
                result += String.valueOf(nChar);
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

