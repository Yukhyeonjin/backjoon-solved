package com.solved.yuk.class3.silver;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Silver_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // class3
        int N = Integer.parseInt(br.readLine()),
            arr[][] = new int[N][2];
        for(int i = 0; i < N; i++){
            String input[] = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(input[0]);
            arr[i][1] = Integer.parseInt(input[1]);
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){ // 종료 시간이 같을 경우 시작 시간이 빠른 순으로 정렬
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        int count = 0, endTime = 0;
        for(int i = 0; i < N; i++){
            if(endTime <= arr[i][0]){
                endTime = arr[i][1];
                count++;
            }
        }
        bw.write(Integer.toString(count));

        bw.flush();
        bw.close();
    }
}
