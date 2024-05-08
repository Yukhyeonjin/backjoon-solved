package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30045 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < n; i ++){
            String input = br.readLine();
            for(int j = 0; j < input.length()-1; j ++){
                String str = String.valueOf(input.charAt(j)) + input.charAt(j+1);
                if(str.equals("01") || str.equals("OI")) {
                    cnt++;
                    break;
                }
            }
        }
        bw.write(cnt+"");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
