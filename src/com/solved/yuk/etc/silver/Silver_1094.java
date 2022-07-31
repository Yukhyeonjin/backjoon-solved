package com.solved.yuk.etc.silver;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Silver_1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine()), sum = 64;
        List<Integer> barList = new ArrayList<Integer>();
        barList.add(64);
        while (true){
            if(sum == X) break;
            int minBar = barList.get(barList.size()-1),
                halfMinBar = minBar/2;
            if(sum - halfMinBar >= X){
                barList.set(barList.size()-1,halfMinBar);
                sum -= halfMinBar;
            }else {
                barList.set(barList.size()-1,halfMinBar);
                barList.add(halfMinBar);
            }
        }

        bw.write(barList.size()+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
