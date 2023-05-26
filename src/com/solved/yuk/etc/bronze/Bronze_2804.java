package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2804 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" "),
               A = input[0], B = input[1];
        int aIndex = -1, bIndex = -1;
        char aChar, bChar;
        for(int i = 0; i < A.length(); i ++){
            aChar = A.charAt(i);
            for(int j = 0; j < B.length(); j ++){
                bChar = B.charAt(j);
                if(aChar == bChar) {
                    aIndex = i;
                    bIndex = j;
                    break;
                }
            }
            if(aIndex != -1 && bIndex != -1) {
                break;
            }
        }
        for(int i = 0; i < B.length(); i ++){
            bChar = B.charAt(i);
            for(int j = 0; j < A.length(); j ++){
                if(i == bIndex) {
                    bw.write(A);
                    break;
                }
                else if(j == aIndex) bw.write(String.valueOf(bChar));
                else bw.write(".");
            }
            bw.newLine();
        }



        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

