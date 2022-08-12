package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        String convertFiveA = "", convertSixA = "", convertFiveB = "", convertSixB = "";;
        for(int i = 0; i < input[0].length(); i ++){
            if(input[0].charAt(i) == '6' || input[0].charAt(i) == '5'){
                convertFiveA += Character.toString('5');
                convertSixA  += Character.toString('6');
            }else {
                convertFiveA += Character.toString(input[0].charAt(i));
                convertSixA  += Character.toString(input[0].charAt(i));
            }
        }
        for(int i = 0; i < input[1].length(); i ++){
            if(input[1].charAt(i) == '6' || input[1].charAt(i) == '5'){
                convertFiveB += Character.toString('5');
                convertSixB  += Character.toString('6');
            }else {
                convertFiveB += Character.toString(input[1].charAt(i));
                convertSixB  += Character.toString(input[1].charAt(i));
            }
        }
        bw.write((Integer.parseInt(convertFiveA) + Integer.parseInt(convertFiveB)) + " " + (Integer.parseInt(convertSixA) + Integer.parseInt(convertSixB)));

        bw.flush();
        br.close();
        bw.close();
    }
}
