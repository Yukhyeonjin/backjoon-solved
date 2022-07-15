package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2947 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        boolean flag = false;
        String input[] = br.readLine().split(" ");
        int arr[] = {Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2]), Integer.parseInt(input[3]), Integer.parseInt(input[4])};
        for (int j=0;j<5;j++){
            for (int i = 0; i < 4; i++) {
                if(arr[i]>arr[i+1]){
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    for (int num : arr) {
                        bw.write(num+" ");
                    }
                    bw.newLine();
                }
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
