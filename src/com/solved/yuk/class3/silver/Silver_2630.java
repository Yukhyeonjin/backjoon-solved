package com.solved.yuk.class3.silver;

import java.io.*;

public class Silver_2630 {
    static int[][] square;
    static int whiteCount = 0, blueCount = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class3
        int N = Integer.parseInt(br.readLine());
        square = new int[N][N];
        String[] input;
        for(int i = 0; i < N; i++){
            input = br.readLine().split(" ");
            for(int j = 0; j < N; j ++){
                square[i][j]  = Integer.parseInt(input[j]);
            }
        }
        findSquare(0,0,N);
        bw.write(whiteCount + "\n");
        bw.write(blueCount + "");
        bw.flush();
        bw.close();
    }
    public static void findSquare(int row ,int column, int N){
        int k = N;
        int sum = 0;
        for(int i = row; i < row+k; i ++){
            for(int j = column; j < column+k; j++){
                sum += square[i][j];
            }
        }
        //System.out.println("row : " + row + " column : " + column + " N : " + N);
        //System.out.println(sum);
        if(sum == k*k){
            blueCount++;
        }else if(sum == 0){
            whiteCount++;
        }else{
            findSquare(row, column, k/2);
            findSquare(row+k/2, column, k/2);
            findSquare(row, column+k/2, k/2);
            findSquare(row+k/2, column+k/2, k/2);
        }
    }
}
