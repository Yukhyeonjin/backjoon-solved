package com.solved.yuk.etc.silver;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Silver_25206 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F" , 0.0);

        String input[], grade;
        double credit, sum = 0, count = 0;
        for(int i = 0; i < 20; i ++){
            input = br.readLine().split(" ");
            grade = input[2];
            if("P".equals(grade)) {
                continue;
            }
            credit = Double.parseDouble(input[1]);
            count += credit;
            sum += gradeMap.get(grade)*credit;
        }
        bw.write(sum/count+"");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
