package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_3040 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int [] Person = new int[9];
        int fake1=0,fake2=0;
        int sum = 0;
        for(int i = 0 ; i < Person.length; i++) {
            Person[i] = Integer.parseInt(br.readLine());
            sum+=Person[i];
        }
        Arrays.sort(Person);
        for(int i = 0 ; i < Person.length; i++) {
            for(int j = 1 ; j < 9;j++) {
                if(Person[i]+Person[j]==sum-100) {
                    fake1=i;
                    fake2=j;
                    break;
                }
            }
        }
        for(int i = 0 ; i < Person.length;i++) {
            if(i==fake1||i==fake2) {
                continue;
            }
            bw.write(Person[i]+"\n");
        }

        bw.flush();
        bw.close();

    }
}
