package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_6825 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double weight = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());
        double BMI = weight / (height * height);
        if(BMI >= 25) bw.write("Overweight");
        else if(BMI >= 18.5 && BMI < 25) bw.write("Normal weight");
        else bw.write("Underweight");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}