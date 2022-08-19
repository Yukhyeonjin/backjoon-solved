package com.solved.yuk.etc.silver;

import java.io.*;

public class Silver_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), arr[] = new int[1001];
        for(int i = 1; i <= 99; i ++){
            arr[i] += i;
        }
        for(int i = 100; i <= 1000; i ++){
            int a = i/100,
                b = (i/10)%10,
                c = i - (a*100) - (b*10);
            if (c - b == b - a) {
                arr[i] = arr[i-1]+1;
            }
            else arr[i] = arr[i-1];
        }
        bw.write(arr[N]+"");


        bw.flush();
        br.close();
        bw.close();
    }
}
