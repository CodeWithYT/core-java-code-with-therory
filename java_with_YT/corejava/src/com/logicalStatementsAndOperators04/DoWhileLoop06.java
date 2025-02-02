package com.logicalStatementsAndOperators04;
/*
 do-while:
    - the do-while loop guarantees that the code block inside the loop is executed at least once, even if the condition is false from the beginning. This is because the condition is checked after the code block is executed.
How It Works:
    - Execution: The code block inside the do part is executed first.
    - Condition Check: After executing the code block, the condition is evaluated.
    - Repetition: If the condition is true, the loop repeats; if false, the loop terminates.
 */

public class DoWhileLoop06 {
    public static void main(String[] args) {

//      Here’s a simple example that prints numbers from 0 to 4:
        int i = 6;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
        /*
        The loop starts by executing System.out.println(i), printing the value of i.
        The variable i is incremented by 1.
        The condition i < 5 is checked.
        As the condition is false the loop will break by executing the statement once.
         */
        /*
        Common Mistakes:
            - Infinite Loop: Similar to the while loop, if the condition never becomes false, the loop will run indefinitely.
         */
        int j = 0;
        do {
            System.out.println(j);
            // i++; // This line is missing, causing an infinite loop
        } while (true);




    }
}
