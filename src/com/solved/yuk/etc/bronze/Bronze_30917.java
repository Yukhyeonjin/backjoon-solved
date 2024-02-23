package com.solved.yuk.etc.bronze;

import java.io.IOException;
import java.util.Scanner;

public class Bronze_30917 {

    public static void solution() throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = 0, B = 0;
        for(int a=1; a<=9; a++){
            // A가 a인지 물어보고 flush를 한다.
            // System.out.println은 자동으로 flush도 해준다.
            System.out.println("? A " + a);

            // 채점기의 답변을 입력받는다.
            int resp = sc.nextInt();

            if(resp == 1){
                // 답변이 "예"이므로 A의 값은 a이다.
                // B의 값도 알아내야 하는데, 이 부분은 직접 채워보자.
                A = a;
                break;
            }
        }
        
        for(int b=1; b<=9; b++){
            System.out.println("? B " + b);

            int resp = sc.nextInt();

            if(resp == 1){
                B = b;
                break;
            }
        }

        System.out.println("! " + (A + B));
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

