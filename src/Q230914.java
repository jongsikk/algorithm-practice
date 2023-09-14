package com.nhnacademy.aiot.basic;

import java.util.ArrayList;
import java.util.List;

public class Q230914 {

  public static void main(String[] args) {
    int[][] inputs = {
        { 25, 100 },
        { 12, 18 },
        { 66, 132 },
        { 8, 19 },
        { 7, 17 },
        { 144, 12 },
        { 555, 153 },
        { 987, 535 }
    };
    int[] outputs = { 25, 6, 66, 1, 1, 12, 3, 1 };

    System.out.println("정답률 = " + (test(inputs, outputs) / inputs.length) * 100 + "%");
  }

  public static double test(int[][] inputs, int[] outputs) {
    double score = 0;

    for (int i = 0; i < inputs.length; i++) {
      int correctAnwser = outputs[i];
      int yourAnwser = solution(inputs[i][0], inputs[i][1]);
      boolean isCorrected = (correctAnwser == yourAnwser);

      System.out.println("**** Case " + (i + 1) + " ****");

      String inputFormat = "Input : %d, %d \t -> Expected : %d %n";
      System.out.printf(inputFormat, inputs[i][0], inputs[i][1], correctAnwser);

      String resultFormat = "Your Answer : %d is ";
      System.out.printf(resultFormat, yourAnwser);

      if (isCorrected) {
        score++;
        System.out.println("Corrected Anwser");
      } else {
        System.out.println("Wrong Anwser");
      }
    }

    return score;
  }

  public static int solution(int input1, int input2) {
    int result = 0;
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    for (int i = 1; i <= input1; i++) {
      if (input1 % i == 0) {
        list1.add(i);
      }
    }

    for (int i = 1; i <= input2; i++) {
      if (input2 % i == 0) {
        list2.add(i);
      }
    }
    for (int i = 0; i < list1.size(); i++) {
      for (int j = 0; j < list2.size(); j++) {
        if (list1.get(i) == list2.get(j)) {
          result = list1.get(i);
        }
      }
    }
    return result;
  }
}
