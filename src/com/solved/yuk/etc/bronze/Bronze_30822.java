package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_30822 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), arr[] = new int[5];
        String S = br.readLine();
        for(int i = 0; i < N; i ++){
            if('u' == S.charAt(i)) arr[0]++;
            else if('o' == S.charAt(i)) arr[1]++;
            else if('s' == S.charAt(i)) arr[2]++;
            else if('p' == S.charAt(i)) arr[3]++;
            else if('c' == S.charAt(i)) arr[4]++;
        }
        Arrays.sort(arr);
        bw.write(arr[0]+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

