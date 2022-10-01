package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_3985 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L[] = new int[Integer.parseInt(br.readLine())], N = Integer.parseInt(br.readLine()), expectMax = -1, exceptNum = 0, max = -1, num = 0;
        for(int i = 0; i < N; i ++){
            String input[] = br.readLine().split(" ");
            int P = Integer.parseInt(input[0]), K = Integer.parseInt(input[1]), count = 0;
            // 기대 순위
            if(K-P > expectMax){
                exceptNum = i+1;
                expectMax = K-P;
            }
            // 실제 순위
            for(int j = P-1; j <= K-1; j ++){
                if(L[j] == 0) {
                    L[j] = 1;
                    count++;
                }
            }
            if(count > max){
                num = i+1;
                max = count;
            }
        }
        bw.write(exceptNum+"\n"+num);


        bw.flush();
        br.close();
        bw.close();
    }
}
