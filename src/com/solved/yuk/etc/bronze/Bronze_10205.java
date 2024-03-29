package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10205 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int t,i,j,c,sz;
        t = Integer.parseInt(br.readLine());
        for(i=1;i<=t;i++) {
            c = Integer.parseInt(br.readLine());
            String str = br.readLine();
            sz = str.length();
            for(j=0;j<sz;j++) c += str.charAt(j)=='c'?1:-1;
            if(i!=1) sb.append("\n");
            sb.append("Data Set "+i+":\n"+c+"\n");
        }
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

