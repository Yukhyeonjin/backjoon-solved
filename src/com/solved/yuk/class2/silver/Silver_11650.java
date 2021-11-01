package com.solved.yuk.class2.silver;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Silver_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        String[] input;
        for(int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(input[0]);
            arr[i][1] = Integer.parseInt(input[1]);
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int x1 = o1[0], y1 = o1[1], x2 = o2[0], y2 = o2[1];
                if(x1 < x2){
                    return -1;
                }else if(x1 > x2){
                    return 1;
                }else {
                    if(y1 < y2){
                        return -1;
                    }else if(y1 > y2){
                        return 1;
                    }else return 0;
                }
            }
        });
        for(int i = 0; i < N; i ++){
            bw.write(arr[i][0]+" " + arr[i][1] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
