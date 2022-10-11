package com.solved.yuk.etc.silver;

import java.io.*;

public class Silver_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[10];
        String input = br.readLine();
        for(int i = 0; i < input.length(); i ++){
            int number = (int)input.charAt(i)-'0';
            if(number == 6 || number == 9){
                if(arr[6] == arr[9]){
                    arr[6]++;
                }
                else arr[9]++;
            }
            else arr[number]++;
        }
        int max = 0;
        for(int i = 0; i <= 9; i ++){
            max = Math.max(arr[i],max);
        }
        bw.write(max+"");


        bw.flush();
        br.close();
        bw.close();
    }
}
