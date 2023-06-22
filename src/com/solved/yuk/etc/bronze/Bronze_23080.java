package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_23080 {
    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        StringBuilder st = new StringBuilder();
        String input = br.readLine();
        st.append(String.valueOf(input.charAt(0)));
        for(int i = 1; i < input.length(); i ++){
            if(i % k == 0) st.append(String.valueOf(input.charAt(i)));
        }
        bw.write(st.toString());

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
