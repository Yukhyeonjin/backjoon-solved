package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Bronze_31994 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, String> map = new HashMap<>();
        int max = -1;
        for (int i = 0; i < 7; i ++){
            String input[] = br.readLine().split(" ");
            int key = Integer.parseInt(input[1]);
            map.put(key, input[0]);
            max = Math.max(key, max);
        }
        bw.write(map.get(max));

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

