package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Bronze_29729 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int S = Integer.parseInt(input[0]),
            N = Integer.parseInt(input[1]),
            M = Integer.parseInt(input[2]),
            element;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N + M; i ++){
            element = Integer.parseInt(br.readLine());
            if(element == 1) {
                if (list.size() == S) S*=2;
                list.add(element);
            }
            else if (element == 0) {
                list.remove(list.size()-1);
            }
        }
        bw.write(S+"");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

