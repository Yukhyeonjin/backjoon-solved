package com.solved.yuk.etc.silver;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Silver_3711 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int G = Integer.parseInt(br.readLine());

            int arr[] = new int[G];
            for (int j = 0; j < G; j++) {
                arr[j] = Integer.parseInt(br.readLine());
            }
            int m = 1;
            boolean flag = false;
            Set<Integer> set = new HashSet<>();
            while (true) {
                set.clear();
                for (int j = 0; j < G; j++) {
                    int rest = arr[j] % m;
                    if (set.contains(rest)) break;
                    else set.add(rest);
                }
                if (set.size() == G) break;
                m++;
            }
            bw.write(m + "\n");
        }

        bw.flush();
        bw.close();
    }
}
