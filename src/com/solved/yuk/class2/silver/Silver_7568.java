package com.solved.yuk.class2.silver;

import java.io.*;

public class Silver_7568 {
    static int[][] arr;
    static int[] rank;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        N = Integer.parseInt(br.readLine());
        arr = new int [N][2];
        rank = new int[N];
        String input[];
        for(int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]),
                    y = Integer.parseInt(input[1]);
            arr[i][0] = x;
            arr[i][1] = y;
        }
        for(int i = 0; i < N; i ++){
            compare(arr[i][0],arr[i][1], i);
            bw.write(Integer.toString(rank[i]) + " ");
        }

        bw.flush();
        bw.close();
    }
    public static void compare(int x, int y, int index){
        int count = 1;
        for(int i = 0; i < arr.length; i ++){
            if(i == index) continue;
            if(x < arr[i][0] && y < arr[i][1]){
                count++;
            }
        }
        rank[index] = count;
    }

}
