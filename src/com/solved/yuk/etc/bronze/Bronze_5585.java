package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 500, 100, 50, 10, 5, 1
        int money = 1000
          , inputMoney = Integer.parseInt(br.readLine())
          , count = 0;
        money -= inputMoney;
        int arr[] = {500,100,50,10,5,1};
        for(int i = 0; i < arr.length;i++){
            if(money >= arr[i]){
                count += money / arr[i];
                money = money % arr[i];
            }
            if(money == 0) break;;
        }
        bw.write(count+"");


        bw.flush();
        bw.close();
    }
}
