package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input, inputArr[];
        int triangle[] = new int[3];
        while (true){
            input = br.readLine();
            if(input.equals("0 0 0")) break;

            inputArr = input.split(" ");
            triangle[0] = Integer.parseInt(inputArr[0]);
            triangle[1] = Integer.parseInt(inputArr[1]);
            triangle[2] = Integer.parseInt(inputArr[2]);
            Arrays.sort(triangle);
            if(triangle[0] + triangle[1] <= triangle[2]) bw.write("Invalid\n");
            else if(triangle[0] == triangle[1] && triangle[1] == triangle[2]) bw.write("Equilateral\n");
            else if(triangle[0] == triangle[1] || triangle[1] == triangle[2] || triangle[0] == triangle[2]) bw.write("Isosceles\n");
            else bw.write("Scalene \n");
        }

        bw.flush();
        bw.close();

    }
}
