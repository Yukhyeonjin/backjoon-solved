package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Bronze_15059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Ca = Integer.parseInt(st.nextToken());
        int Ba = Integer.parseInt(st.nextToken());
        int Pa = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int ans = 0;
        int Cr = Integer.parseInt(st.nextToken());
        int Br = Integer.parseInt(st.nextToken());
        int Pr = Integer.parseInt(st.nextToken());
        ans += Cr < Ca ? 0 : Cr - Ca;
        ans += Br < Ba ? 0 : Br - Ba;
        ans += Pr < Pa ? 0 : Pr - Pa;

        System.out.println(ans);
    }
}