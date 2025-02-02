package com.logicalStatementsAndOperators04;
/*
 while loop:
    - while loop in java is a control flow statement that allows code to be executed repeatedly based on a given boolean condition;
    - Condition Check: Before each iteration, the condition is evaluated.
    - Execution: If the condition is true, the code block inside the loop is executed.
    - Re-evaluation: After executing the code block, the condition is checked again.
    - Termination: The loop continues until the condition becomes false.
 */

public class WhileLoop05 {
    public static void main(String[] args) {

//      here is the syntax of the while loop;
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        /*
        The loop starts with i equal to 0.
        The condition i < 5 is checked.
        Since the condition is true, System.out.println(i) is executed, printing the value of i.
        The variable i is incremented by 1.
        This process repeats until i is no longer less than 5.
        */

        /*
        Common Mistakes:
            - Forgetting to Update the Condition: If you forget to update the variable involved in the condition, you might create an infinite loop.
        */

//      Infinite Loop:
//          - If the condition never becomes false, the loop will run indefinitely.
//      For example:
        while (true) {
            // infinite loop
        }

    }
}
