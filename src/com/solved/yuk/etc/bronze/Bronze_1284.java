package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1 - 2, 0 - 4, 2 ~ 9 - 3
        while (true){
            String[] input = br.readLine().split("");
            int sum = 0;
            if(input.length == 1 && input[0].equals("0")) break;
            sum += (input.length-1 + 2); // 숫자 사이 공백 + 양옆 공백
            for(int i = 0; i < input.length; i ++){
                int number = Integer.parseInt(input[i]);
                if(number == 1) sum+=2;
                else if(number == 0) sum+=4;
                else sum+=3;
            }
            bw.write(sum+"\n");
        }

        bw.flush();
        bw.close();
    }
}
