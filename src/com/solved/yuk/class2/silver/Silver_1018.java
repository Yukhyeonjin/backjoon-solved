package com.solved.yuk.class2.silver;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class Silver_1018 {
    public static char[][] chess;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]), // 행
            N = Integer.parseInt(input[1]); // 열
        // 경우의수 = 2 * (M-7) * (N-7)
        chess = new char[M][N];
        for(int i = 0; i < M; i ++){
            String line = br.readLine();
            for(int j =0; j < N; j ++){
                chess[i][j] = line.charAt(j);
            }
        }
        Set<Integer> set = new TreeSet<Integer>();
        for(int i = 0; i < M-7; i ++){
            for(int j = 0; j < N-7; j ++) {
                set.add(compare(i,j));
            }
        }
        bw.write(set.toArray()[0]+"");
        bw.flush();
        bw.close();
    }

    public static int compare(int x, int y) {
        int firstCase = 0, secondCase = 0;
        for(int i = 0; i < 8; i ++){
            for(int j = 0; j <8; j++){
                if(i%2 != 0) {
                    if(j%2 != 0) {
                        if(chess[x+i][y+j] == 'W') firstCase++;
                        else secondCase++;
                    } else {
                        if(chess[x+i][y+j] == 'W') secondCase++;
                        else firstCase++;
                    }
                } else {
                    if(j%2 != 0) {
                        if(chess[x+i][y+j] == 'W') secondCase++;
                        else firstCase++;
                    } else {
                        if(chess[x+i][y+j] == 'W') firstCase++;
                        else secondCase++;
                    }
                }
            }
        }
        return Math.min(secondCase,firstCase);
    }
}
