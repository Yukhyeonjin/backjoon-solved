package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Bronze_28431 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5;i ++){
            int number = Integer.parseInt(br.readLine());
            if(list.contains(number))list.remove(list.indexOf(number));
            else list.add(number);
        }
        bw.write(list.get(0)+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

