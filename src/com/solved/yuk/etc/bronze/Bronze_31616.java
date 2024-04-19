package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31616 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        String s = br.readLine();
        char c = s.charAt(0);
        boolean flag = true;
        for(int i = 1; i < s.length(); i ++){
            char tmp = s.charAt(i);
            if(c != tmp) {
                flag = false;
                break;
            }
        }
        if(flag) bw.write("Yes");
        else bw.write("No");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
