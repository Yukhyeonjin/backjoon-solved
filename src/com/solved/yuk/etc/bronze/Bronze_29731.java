package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Bronze_29731 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> rick = Arrays.asList(
                "Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "Never gonna stop"
        );

        int N = Integer.parseInt(br.readLine());
        boolean flag = true;
        for(int i = 0; i < N; i ++) {
            String input = br.readLine();
            if(!rick.contains(input)) {
                flag = false;
                break;
            }
        }
        if(flag) bw.write("No");
        else bw.write("Yes");



        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

