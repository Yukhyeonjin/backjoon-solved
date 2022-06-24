package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Bronze_24860 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(br.readLine())
                .append(" ").append(br.readLine())
                .append(" ").append(br.readLine());

        StringTokenizer st = new StringTokenizer(sb.toString());
        final long vk = Long.parseLong(st.nextToken());
        final long jk = Long.parseLong(st.nextToken());
        final long vl = Long.parseLong(st.nextToken());
        final long jl = Long.parseLong(st.nextToken());
        final long vh = Long.parseLong(st.nextToken());
        final long dh = Long.parseLong(st.nextToken());
        final long jh = Long.parseLong(st.nextToken());

        final long heavyChain = vh * dh * jh;
        final long lightChainK = vk * jk;
        final long lightChainL = vl * jl;
        final long totalVariant = heavyChain * (lightChainK + lightChainL);

        bw.write(totalVariant+"");

        br.close();
        bw.flush();
        bw.close();
    }
}
