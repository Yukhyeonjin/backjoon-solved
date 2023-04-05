package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27880 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input;
        int sum = 0, floorCount = 1;
        for(int i = 0; i < 4; i ++){
            input = br.readLine().split(" ");
            //floorCount = i != 2 ? 1 : 3;
            if("Es".equals(input[0])){
                sum += (Integer.parseInt(input[1])*21);
            }
            else {
                sum += (Integer.parseInt(input[1])*17);
            }
        }
        bw.write(sum+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

