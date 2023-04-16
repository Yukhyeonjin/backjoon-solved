package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Bronze_1268 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][5];
        String[] input;
        for(int i = 0; i < n; i ++){
            input = br.readLine().split(" ");
            for(int j = 0; j < 5; j++){
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }

        int grade = 1, max = 0;
        for(int i = 0; i < n; i ++) { // 학생
            Set<Integer> set = new HashSet<>();
            for(int j = 0; j < 5; j++){ // 학년
                for(int k = 0; k < n; k ++){ // 학생 비교
                    /* i번 학생의 1학년 ~ 5학년
                    *  과 i가 아닌 k번 학생의 1학년 ~ 5학년 같은 반 비교
                    *  같은 반이 된 횟수가 많은 학생을 찾는게 아닌
                    *  한번이라도 같은 반이였던 사람을 찾는 것이기 때문에
                    *  set 사용
                    * */
                    if(i == k) continue;
                    if(arr[i][j] == arr[k][j]){
                        set.add(k);
                    }
                }
            }
            if( max < set.size() ) {
                max = set.size();
                grade = i + 1;
            }
        }
        bw.write(grade+"");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

