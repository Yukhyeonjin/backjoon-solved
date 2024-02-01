package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Bronze_8974 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]),
            B = Integer.parseInt(input[1]);
        List<Integer> list = new ArrayList<Integer>();
        int i = 1;
        while (true){
            for(int j = 0; j < i; j++){
                list.add(i);
                if(list.size() == 1000) break;
            }
            i++;
            if(list.size() == 1000) break;
        }
        int sum = 0;
        for(int j = A-1; j <= B-1; j++){
            sum += list.get(j);
        }
        bw.write(sum+"");



        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws Exception {
        solution();
    }
}
