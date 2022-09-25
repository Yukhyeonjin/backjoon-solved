package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_14720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), count = 0, preMilk = 2;
        String input[] = br.readLine().split(" ");
        for(int i = 0; i < N; i ++){
            int milk = Integer.parseInt(input[i]);
            if(milk == 0 && preMilk == 2){
                preMilk = 0;
                count++;
            }
            else if(milk == 1 && preMilk == 0 ){
                preMilk = 1;
                count++;
            }
            else if(milk == 2 && preMilk == 1){
                preMilk = 2;
                count++;
            }
        }
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
