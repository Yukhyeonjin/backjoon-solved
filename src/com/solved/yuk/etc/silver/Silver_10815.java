package com.solved.yuk.etc.silver;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Silver_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        long card[] = new long[N];
        String cardList[] = br.readLine().split(" ");
        Set<Long> cardSet = new HashSet<>();
        for(int i = 0; i < cardList.length; i ++){
            cardSet.add(Long.parseLong(cardList[i]));
        }
        int M = Integer.parseInt(br.readLine());
        cardList = br.readLine().split(" ");
        for(int i = 0; i < cardList.length; i ++){
            if(cardSet.contains(Long.parseLong(cardList[i]))){
                bw.write("1 ");
            }else bw.write("0 ");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
