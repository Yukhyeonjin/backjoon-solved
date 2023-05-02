package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_11328 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String firstArr[], secondArr[], input[];
        boolean flag;
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            firstArr = input[0].split("");
            secondArr = input[1].split("");
            Arrays.sort(firstArr);
            Arrays.sort(secondArr);
            flag = true;
            for(int j = 0; j < firstArr.length; j ++){
                if(!firstArr[j].equals(secondArr[j])){
                    flag = false;
                    break;
                }
            }
            if(flag) bw.write("Possible\n");
            else bw.write("Impossible\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

