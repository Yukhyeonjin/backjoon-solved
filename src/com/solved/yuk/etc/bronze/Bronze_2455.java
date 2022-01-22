package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2455 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0, sum = 0;
        for(int i = 0; i < 4; i ++){
            String input[] = br.readLine().split(" ");
            int outPeople = Integer.parseInt(input[0]),
                inPeople =  Integer.parseInt(input[1]);
            sum = sum - outPeople + inPeople;
            max = Math.max(sum,max);
        }
        bw.write(max+"");

        bw.flush();
        bw.close();
    }
}
