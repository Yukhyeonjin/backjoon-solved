package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32801 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]) + 1;
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);
        int Fizz = 0, Buzz = 0, FizzBuzz = 0;
        while (n --> 1) {
            if(n % a == 0 && n % b == 0) FizzBuzz++;
            else if(n % a == 0) Fizz++;
            else if(n % b == 0) Buzz++;
        }
        bw.write(Fizz + " " + Buzz + " " + FizzBuzz);
        
        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
