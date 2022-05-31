package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Bronze_11098 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, String> playerMap = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i ++){
            int p = Integer.parseInt(br.readLine());
            int max = 0;
            for(int j = 0; j < p; j ++){
                String[] input = br.readLine().split(" ");
                int price = Integer.parseInt(input[0]);
                playerMap.put(price, input[1]);
                max = Math.max(max,price);
            }
            bw.write(playerMap.get(max));
            playerMap.clear();
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
