package com.solved.yuk.etc.silver;

import java.io.*;
import java.util.Arrays;

public class Silver_1049 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int min;
        int[] unit = new int[M];
        int[] pack = new int[M];
        for (int i = 0; i < M; i ++){
            input = br.readLine().split(" ");
            pack[i] = Integer.parseInt(input[0]);
            unit[i] = Integer.parseInt(input[1]);
        }
        Arrays.sort(unit);
        Arrays.sort(pack);

        //가장 싼 6개짜리 팩 구매 vs 가장 싼 낱개 구매 vs (가장싼 6개짜리 팩 + 낱개)
        min = Math.min(((N/6)+1)*pack[0], N*unit[0]);
        min = Math.min(min, ((N/6))*pack[0] + (N%6)*unit[0]);

        bw.write(min+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
