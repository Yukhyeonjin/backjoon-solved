package com.solved.yuk.etc.silver;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Silver_14425 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]), M = Integer.parseInt(input[1]);
        Set<String> S = new HashSet<>();
        for(int i = 0; i < N; i ++){
            S.add(br.readLine());
        }
        int result = 0;
        for(int i = 0; i < M; i ++){
            if(S.contains(br.readLine())) result++;
        }
        bw.write(result+"");
        

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
