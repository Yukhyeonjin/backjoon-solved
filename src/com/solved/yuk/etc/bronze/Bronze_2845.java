package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int L = Integer.parseInt(input[0]),
            P = Integer.parseInt(input[1]);
        int memberCount = L*P;
        String[] news = br.readLine().split(" ");
        for(int i = 0; i < news.length; i ++){
            bw.write(Integer.parseInt(news[i]) - memberCount + " ");
        }

        bw.flush();
        bw.close();

    }
}
