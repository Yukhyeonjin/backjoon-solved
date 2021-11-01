package com.solved.yuk.class2.silver;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Silver_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        String input;
        for(int i = 0; i < N; i ++){
            input = br.readLine();
            arr[i] = input;
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int age1 = Integer.parseInt(o1.split(" ")[0]),
                        age2 = Integer.parseInt(o2.split(" ")[0]);
                if(age1 < age2){
                    return -1;
                } else if(age1 > age2){
                    return 1;
                }else {
                    return 0;
                }
            }
        });
        for(int i = 0; i < N; i ++){
            bw.write(arr[i] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
