package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Bronze_31429 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "12 1600");
        map.put(2, "11 894");
        map.put(3, "11 1327");
        map.put(4, "10 1311");
        map.put(5, "9 1004");
        map.put(6, "9 1178");
        map.put(7, "9 1357");
        map.put(8, "8 837");
        map.put(9, "7 1055");
        map.put(10, "6 556");
        map.put(11, "6 773");
        int N = Integer.parseInt(br.readLine());
        bw.write(map.get(N));

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}