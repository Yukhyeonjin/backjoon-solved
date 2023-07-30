package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5704 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = "";
        StringBuilder sb = new StringBuilder();
        while (!"*".equals(s = br.readLine())) {
            int cnt = 0;
            int[] arr = new int['Z'-'A'+1];
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c<'a' || c>'z') continue;
                if (++arr[c-'a']==1) cnt++;
            }
            sb.append(cnt==26?'Y':'N').append('\n');
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

