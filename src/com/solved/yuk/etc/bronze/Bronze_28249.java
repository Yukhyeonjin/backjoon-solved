package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Bronze_28249 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> map = new HashMap<>();
        map.put("Poblano", 1500);
        map.put("Mirasol", 6000);
        map.put("Serrano", 15500);
        map.put("Cayenne", 40000);
        map.put("Thai", 75000);
        map.put("Habanero", 125000);
        int sum = 0, T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            sum += map.get(br.readLine());
        }
        bw.write(sum+"");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
