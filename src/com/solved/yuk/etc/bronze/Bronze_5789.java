package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String result = "";
        for(int i = 0; i < N; i++){
            result = "";
            String input = br.readLine();
            for(int j = 0; j < input.length()/2; j ++){
                if(input.charAt(j) == input.charAt(input.length()-1-j)) result = "Do-it";
                else result = "Do-it-Not";
            }
            bw.write(result+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
