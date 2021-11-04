package com.solved.yuk.class2.silver;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Silver_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        int N = Integer.parseInt(br.readLine());
        String[] cardNumberInput = br.readLine().split(" ");
        Map<Integer, Integer> cardNumberMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < N; i ++){
            int key = Integer.parseInt(cardNumberInput[i]);
            cardNumberMap.put(key, cardNumberMap.get(key) == null ? 1 : cardNumberMap.get(key)+1);
        }
        int M = Integer.parseInt(br.readLine());
        String[] countingNumberInput = br.readLine().split(" ");
        for(int i = 0; i < M; i ++){
            int key = Integer.parseInt(countingNumberInput[i]);
            int countingNumber = cardNumberMap.get(key) == null ? 0 : cardNumberMap.get(key);
            bw.write(Integer.toString(countingNumber) + " ");
        }


        bw.flush();
        bw.close();
    }
}
