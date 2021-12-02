package com.solved.yuk.class3.silver;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Silver_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class3
        // 조합 이용 nCr = n!/r!(n-r)!
        // 해당 종류의 옷을 입지 않고 다른 종류의 옷만 입는 경우도 있으니 모든 종류 건에 대해 입지 않은 경우인 NULL 경우를 하나 추가 하고 조합을 구하고
        // 알몸인 케이스(모든 종류가 다 NULL)인 경우 1을 빼서 계산한다.
        // 해당 문제는 한 종류의 여러 옷이 있어도 한 가지의 옷만 선택하기 때문에 어떤 종류에 n개의 옷이 있다면 (입지 않는 경우를 포함해서 1 추가)
        // n+1C1 로 표현할 수 있다. -> (n+1)!/1!((n+1)-1)! -> (n+1)!/n! = n
        int N = Integer.parseInt(br.readLine());
        String[] input;
        String clothes, category;
        Map<String, Integer> clothesMap = new HashMap<>();
        for(int i = 0; i < N; i ++){
            int n = Integer.parseInt(br.readLine());
            for(int j = 0; j < n; j ++){
                input = br.readLine().split(" ");
                clothes = input[0]; category = input[1];
                int clothesCount = clothesMap.get(category) == null ? 1 : clothesMap.get(category) + 1;
                clothesMap.put(category, clothesCount);
            }
            int countCase = 1;
            for(int val : clothesMap.values()){
                countCase *= (val + 1);
            }
            bw.write(countCase - 1 + "\n");
            clothesMap.clear();
        }
        bw.flush();
        bw.close();
    }
}
