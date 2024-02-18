package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11091 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr;
        for(int i = 0; i < N; i ++){
            String input = br.readLine().toLowerCase();
            arr = new int[26];
            for(int j = 0; j < input.length(); j ++){
                if(input.charAt(j) >= 'a' && input.charAt(j) <= 'z') arr[input.charAt(j)-'a']++;
            }
            boolean flag = true;
            for(int j = 0; j < 26; j ++){
                if(arr[j] == 0 && flag) {
                    flag = false;
                    bw.write("missing " + (char)(j+'a'));
                    continue;
                }
                if(arr[j] == 0 && !flag) {
                    bw.write(String.valueOf((char)(j+'a')));
                }
            }
            if(flag) bw.write("pangram");
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}