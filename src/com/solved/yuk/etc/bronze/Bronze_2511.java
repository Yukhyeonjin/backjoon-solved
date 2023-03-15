package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2511 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] Acard = br.readLine().split(" "),
                 Bcard = br.readLine().split(" ");
        int a, b, aScore = 0, bScore = 0, dCount = 0;
        String recentWinner = "";
        for(int i = 0; i < 10; i ++){
            a = Integer.parseInt(Acard[i]);
            b = Integer.parseInt(Bcard[i]);
            if(a == b) {
                aScore+=1;
                bScore+=1;
                dCount++;
            }
            else if(a > b) {
                aScore += 3;
                recentWinner = "A";
            }
            else if(b > a) {
                bScore += 3;
                recentWinner = "B";
            }
        }
        bw.write(aScore + " " + bScore + "\n");
        if(aScore > bScore) bw.write("A");
        else if(bScore > aScore) bw.write("B");
        else {
            if(dCount == 10) bw.write("D");
            else bw.write(recentWinner);
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

