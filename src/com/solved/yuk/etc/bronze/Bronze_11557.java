package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Bronze_11557 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        Map<Integer,String> map = new HashMap<>();
        for(int i = 0; i < T; i ++){
            int N = Integer.parseInt(br.readLine()), max = -1;
            map.clear();
            for(int j = 0; j < N; j ++){
                String input[] = br.readLine().split(" "), S = input[0];
                int L = Integer.parseInt(input[1]);
                max = Math.max(L, max);
                map.put(L,S);
            }
            bw.write(map.get(max)+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
