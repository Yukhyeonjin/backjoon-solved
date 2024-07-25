package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_20839 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        double A = Double.parseDouble(input[0]);
        double C = Double.parseDouble(input[1]);
        double E = Double.parseDouble(input[2]);

        input = br.readLine().split(" ");
        double studentA = Double.parseDouble(input[0]);
        double studentC = Double.parseDouble(input[1]);
        double studentE = Double.parseDouble(input[2]);

        if (studentA >= A && studentC >= C && studentE >= E) {
            bw.write("A");
        }
        else if (studentA >= A / 2 && studentC >= C && studentE >= E) {
            bw.write("B");
        }
        else if (studentC >= C && studentE >= E) {
            bw.write("C");
        }
        else if (studentC >= C / 2 && studentE >= E / 2) {
            bw.write("D");
        }
        else {
            bw.write("E");
        }

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

