package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5533 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), player[][] = new int[N][3];
        for(int i = 0; i < N; i ++){
            String input[] = br.readLine().split(" ");
            for (int j = 0; j < input.length; j ++){
                player[i][j] = Integer.parseInt(input[j]);
            }
        }
        for(int i = 0; i < N; i ++){
            int firstGame = player[i][0], secondGame = player[i][1], thirdGame = player[i][2];
            boolean firstFlag = true, secondFlag = true, thirdFlag = true;
            for(int j = 0; j < N; j ++){
                if(i != j){
                    int first = player[j][0], second = player[j][1], third = player[j][2];
                    if(firstGame == first) firstFlag = false;
                    if(secondGame == second) secondFlag = false;
                    if(thirdGame == third) thirdFlag = false;
                    if(!firstFlag && !secondFlag && !thirdFlag) break;
                }
            }
            int sum = 0;
            if(firstFlag) sum+=firstGame;
            if(secondFlag) sum+=secondGame;
            if(thirdFlag) sum+=thirdGame;
            bw.write(sum+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
