package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bronze_25629 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Integer> a = new ArrayList<>(), b = new ArrayList<>();
        boolean flag = true;
        String input[] = br.readLine().split(" ");
        for(int i = 0; i < N; i ++){
            int num = Integer.parseInt(input[i]);
            if(num % 2 == 1) a.add(num);
            else b.add(num);
        }
        int ans = 1;
        if(a.size() - b.size() > 1 || a.size() - b.size() < 0){
            ans = 0;
        }
        else {
            Collections.sort(a);
            Collections.sort(b);
            for(int i = 1; i < a.size(); i ++){
                if(a.get(i) < a.get(i-1)) {
                    ans = 0;
                    break;
                }
            }

            if(ans != 0) {
                for(int i = 1; i < b.size(); i ++){
                    if(b.get(i) < b.get(i-1)) {
                        ans = 0;
                        break;
                    }
                }
            }
        }

        bw.write(ans+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

