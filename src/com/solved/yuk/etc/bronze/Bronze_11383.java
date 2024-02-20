package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11383 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" "), arr;
        int N = Integer.parseInt(input[0]), M = Integer.parseInt(input[1]);
        String str1, str2;
        str1 = str2 = "";
        for(int i=0;i<N;i++) str1 = str1 + br.readLine();
        for(int i=0;i<N;i++) str2 = str2 + br.readLine();
        boolean chk = false;
        for(int i=0;i<N*M*2;i++) if(str2.charAt(i)!=str1.charAt(i/2)) {
            chk = true;
            break;
        }
        bw.write(chk?"Not Eyfa":"Eyfa");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}