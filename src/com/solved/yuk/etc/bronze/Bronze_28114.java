package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Bronze_28114 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        HashMap<Integer, String> map = new HashMap<>();
        int[] year = new int[3];
        int[] solve = new int[3];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int s = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken()) % 100;
            String name = st.nextToken();
            year[i] = y;
            solve[i] = s;
            map.put(s, name);
        }

        Arrays.sort(solve);
        Arrays.sort(year);

        for (int i = 0; i < 3; i++) {
            sb.append(year[i]);
        }
        sb.append("\n");
        for (int i = 2; i >= 0; i--) {
            sb.append(map.get(solve[i]).charAt(0));
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

