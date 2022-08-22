package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Bronze_2605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input[] = br.readLine().split(" ");
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        for(int i = 1; i < N; i ++){
            int number = Integer.parseInt(input[i]);
            if(number == 0){
                list.add(i+1);
            }
            else list.add(i-number,i+1);
        }

        for(int i = 0; i < N; i ++){
            bw.write(list.get(i)+" ");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
