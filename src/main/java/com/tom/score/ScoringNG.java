package com.tom.score;

public class ScoringNG {
    public static void main(String[] args) {
        String[] names = {"Jack", "Hank", "Karen", "Elva", "Benny"};
        int[] englishs = {70, 80, 90, 60, 40};
        int[] maths = {88, 97, 54, 32, 75};
        for (int i = 0; i < 5; i++) {
            if (i != 3) {
                System.out.println(names[i] + "\t" + englishs[i] + "\t" + maths[i] + "\t" + (englishs[i] + maths[i]) / 2);
            }
        }
    }
}
