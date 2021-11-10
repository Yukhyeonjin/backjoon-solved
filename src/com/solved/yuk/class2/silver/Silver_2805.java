package com.solved.yuk.class2.silver;

import java.io.*;

public class Silver_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        long M = Long.parseLong(input[1]);
        input = br.readLine().split(" ");
        long[] treeLength = new long[N];
        long max = -1;
        for(int i = 0; i < N; i ++){
            long tree = Long.parseLong(input[i]);
            treeLength[i] = tree;
            max = Math.max(tree, max);
        }
        long min = 1, mid, value;
        while (min < max){
            mid = (max+min)/2;
            value = 0;
            for(int i = 0; i < N; i ++){
                long tree = Long.parseLong(input[i]);
                long length = tree > mid ? tree - mid : 0;
                value += length;
            }
            if(value >= M){
                min = mid+1;
            }else{
                max = mid;
            }
        }
        bw.write(Long.toString(min-1));

        bw.flush();
        bw.close();
    }

}
