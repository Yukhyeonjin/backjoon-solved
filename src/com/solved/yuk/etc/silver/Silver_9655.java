package com.solved.yuk.etc.silver;

import java.io.*;

public class Silver_9655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String winner = ""; // SK, CY
        while (true){
            if("".equals(winner)) winner = "SK";
            else if("SK".equals(winner)) winner = "CY";
            else if("CY".equals(winner)) winner = "SK";

            if(N - 3 > 0){
                N-=3;
            }
            else if(N - 1 > 0){
                N-=1;
            }
            else if(N - 3 == 0){
                break;
            }
            else if(N - 1 == 0) {
                break;
            }
        }
        bw.write(winner);

        bw.flush();
        br.close();
        bw.close();
    }
}
