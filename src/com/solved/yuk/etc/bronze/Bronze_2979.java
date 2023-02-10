package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]),
            B = Integer.parseInt(input[1]),
            C = Integer.parseInt(input[2]), sum=0;
        int arr[] = new int[101];
        for(int i = 0; i < 3; i ++){
            input = br.readLine().split(" ");
            for(int j = Integer.parseInt(input[0]); j < Integer.parseInt(input[1]); j++){
                arr[j]++;
            }
        }
        for(int i = 1; i <= 100; i ++){
            if(arr[i] == 1) sum+=A;
            else if(arr[i] == 2) sum+=(2*B);
            else if(arr[i] == 3) sum+=(3*C);
        }
        bw.write(sum+"");


        bw.flush();
        br.close();
        bw.close();
    }

}
