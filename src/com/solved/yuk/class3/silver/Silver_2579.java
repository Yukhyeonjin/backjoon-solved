package com.solved.yuk.class3.silver;

import java.io.*;

public class Silver_2579 {
    static int score[];
    static int dp[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class3, 동적계획법 사용
        int line = Integer.parseInt(br.readLine());
        score = new int[line+1];
        dp    = new int[line+1];
        for(int i = 1; i <= line; i ++){
            score[i] = Integer.parseInt(br.readLine());
        }
        dp[1] = score[1];
        if(line >= 2){
            dp[2] = score[1] + score[2];
        }
        for(int i = 3; i <= line; i ++){
            dp[i] = Math.max(dp[i-2], dp[i-3]+score[i-1]) + score[i];
            /* score[i]를 올라가면서 이번에 무조건 1개의 계단이 채워진다.
             * -> dp[i-1], dp[i-2]+score[i-1]을 비교하게 되면 dp[i-1]에서 3계단을 오르게 된다. (조건 X)
             * 그렇기 때문에 dp[i-2]에서 하나 건너뛴 score[i] 또는 (연속 1계단 오름)
             * 이전에 1개만 올라온 상황에서 바로 이전의 계단 값과 이번 계단 값을 합친 걸 비교(연속 2계단 오름)
             * */
        }
        bw.write(Integer.toString(dp[line]));

        bw.flush();
        bw.close();
    }
}
