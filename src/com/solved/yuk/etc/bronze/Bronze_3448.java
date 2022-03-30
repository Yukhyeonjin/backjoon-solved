package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_3448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        double A, R;
        String input;
        for(int i = 0; i < N; i++){
            A = 0; R = 0;
            while (true) {
                input = br.readLine();
                if(input.length() == 0) break;
                A += input.length();
                R += input.replaceAll("#","").length();
            }
            double percent = R/A * 100;
            String result = String.format("%.1f",percent);
            if("0".equals(result.split("\\.")[1])) result = result.split("\\.")[0];
            bw.write("Efficiency ratio is " + result +"%.\n");
        }

        bw.flush();
        bw.close();
    }
}
