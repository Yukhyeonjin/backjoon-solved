package com.solved.yuk.etc.silver;

import java.io.*;

public class Silver_1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[1001],
            number = 1, count = 1;
        arr[0] = 0;
        for(int i = 1; i < 1001; i ++){
            arr[i] = number;
            if(count == number) {
                count = 1;
                number++;
            }else count++;
        }
        String input[] = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]),
            B = Integer.parseInt(input[1]), sum = 0;
        for(int i = A; i <= B; i ++){
            sum += arr[i];
        }
        bw.write(sum+"");

        bw.flush();
        bw.close();
    }
}
