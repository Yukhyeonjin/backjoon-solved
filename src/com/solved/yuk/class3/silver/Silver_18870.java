package com.solved.yuk.class3.silver;

import java.io.*;
import java.util.*;

public class Silver_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class3
        // 정렬 후 rank 번호를 새로 부여 (0부터) 이후 기존 배열에서 정렬 후 생성 된 map 호출
        int N = Integer.parseInt(br.readLine()),
            origin[] = new int[N],
            sorted[] = new int[N];
        String input[] = br.readLine().split(" ");
        for(int i = 0; i < input.length; i ++){
            origin[i] = sorted[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(sorted);
        int rank = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < sorted.length; i ++){
            if(map.get(sorted[i]) == null) rank++;
            map.put(sorted[i],rank);
        }
        for(int i = 0; i < origin.length; i ++){
            bw.write(map.get(origin[i])+" ");
        }

        bw.flush();
        bw.close();
    }
}
