package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum, max = 0, number=0;
        for(int i = 0; i < 5; i ++){
            String score[] =br.readLine().split(" ");
            sum = 0;
            for(int j = 0; j < score.length; j++){
                sum += Integer.parseInt(score[j]);
            }
            if(sum > max){
                max = sum;
                number = i+1;
            }
        }
        bw.write(number + " " + max);

        bw.flush();
        bw.close();
    }
}
