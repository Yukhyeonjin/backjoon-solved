package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27159 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), 
                card, preCard,
                sum = 0;
        String[] strArr = br.readLine().split(" ");
        card = Integer.parseInt(strArr[0]);
        sum += card;
        for(int i = 1; i < N; i ++){
            preCard = card;
            card = Integer.parseInt(strArr[i]);
            if(preCard + 1 == card) continue;
            sum += card;
        }
        bw.write(sum+"\n");
        
        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}
