/*
 * Copyright (c) 2022, gemsvidø
 * All rights reserved.
 */

package u.programs;

import u.resources.c;

import java.util.Scanner;

public interface CheckPalindrome {

    static void interactive () {


        Scanner inp = new Scanner(System.in);
        System.out.print(c.yw + "Test for Palindrome: ");
        StringBuffer inp2 = new StringBuffer(inp.nextLine());


        if (fire(inp2)) {
            System.out.println(c.gr + inp2 + " is a Palindrome.");
        } else {
            System.out.println(c.rd + inp2 + " is not a Palindrome.");
        }

    }

    static boolean fire(StringBuffer check) {

        StringBuffer input = new StringBuffer(check);

        StringBuffer input1 = input;
        StringBuffer input2 = input.reverse();

        return input2 == input1;
    }



}
