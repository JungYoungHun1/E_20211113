package exam;

import java.util.Scanner;

public class Study {
    public static String solution(String s) {
        String[] numArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i=0; i<numArr.length; i++) {
            s = s.replace(numArr[i], Integer.toString(i));
        }

        return s;
    }
    public static void main(String[] args) {
        System.out.println(solution("onetwoseven5"));
    }
}

