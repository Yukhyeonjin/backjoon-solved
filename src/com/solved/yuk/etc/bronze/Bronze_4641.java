package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4641 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while (!"-1".equals(input = br.readLine())){
            String[] strArr = input.split(" ");
            int count = 0;
            for(int i = 0; i < strArr.length-1; i ++){
                int firstNumber = Integer.parseInt(strArr[i]);
                for(int j = 0; j < strArr.length-1; j ++){
                    if(i == j) continue;
                    int secondNumber = Integer.parseInt(strArr[j]);
                    if(firstNumber * 2 == secondNumber) {
                        count++;
                        break;
                    }
                }
            }
            bw.write(count+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

}
