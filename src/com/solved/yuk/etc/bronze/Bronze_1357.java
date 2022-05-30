package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int revX = rev(input[0]),
            revY = rev(input[1]),
            rev = rev(Integer.toString(revX+revY));
        bw.write(rev+"");


        bw.flush();
        bw.close();
    }

    public static int rev(String number){
        String arr[] = number.split("");
        String value = "";
        for(int i = arr.length-1 ; i >= 0; i --){
            value += arr[i];
        }
        return Integer.parseInt(value);
    }
}
