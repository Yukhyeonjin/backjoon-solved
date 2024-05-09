package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_21665 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        String[] arr = new String[n];
        for (int i = 0; i < n; i ++){
            input = br.readLine().split("");
            String rev = "", str = "";
            for (int j = 0; j < m; j ++){
                str = "B".equals(input[j]) ? "W" : "B";
                rev += str;
            }
            arr[i] = rev;
        }
        br.readLine();
        int cnt = 0;
        for (int i = 0; i < n; i ++){
            String comStr = br.readLine();
            for (int j = 0; j < m; j ++){
                if(arr[i].charAt(j) != comStr.charAt(j)) cnt++;
            }
        }
        bw.write(cnt+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
