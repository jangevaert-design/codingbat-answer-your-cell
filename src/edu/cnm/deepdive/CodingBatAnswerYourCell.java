package edu.cnm.deepdive;

/*
Your cell phone rings.
Return true if you should answer it.
Normally you answer, except in the morning you only answer if it is your mom calling.
In all cases, if you are asleep, you do not answer.

answerCell(false, false, false) → true
answerCell(false, false, true) → false
answerCell(true, false, false) → false
 */

public class CodingBatAnswerYourCell {

  public static void main(String[] args) {

    System.out.printf("if isMorning is %s, isMom is %s and isAsleep is %s, the outcome is " +
        answerCell(false, false, false) +".\n", false, false, false);
    System.out.printf("if isMorning is %s, isMom is %s and isAsleep is %s, the outcome is " +
        answerCell(false, false, true) +".\n", false, false, true);
    System.out.printf("if isMorning is %s, isMom is %s and isAsleep is %s, the outcome is " +
        answerCell(true, false, false) +".\n", true, false, false);

  }

  public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    if (isMorning && isMom && !isAsleep) {
      return true;
    } else
      return (!isMorning && !isAsleep);
  }

}
