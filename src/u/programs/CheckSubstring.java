/*
 * Copyright (c) 2022, gemsvidø
 * All rights reserved.
 */

package u.programs;

import u.resources.UseFul;
import u.resources.c;
import java.util.Scanner;

public @UseFul interface CheckSubstring {

    static @UseFul boolean fire(String parent, String potentialSub) {
        return (parent.contains(potentialSub));


    }

    static @UseFul void interactive() {

        Scanner inp1 = new Scanner(System.in);
        System.out.print(c.yw + "\nEnter first string: ");
        String input1 = inp1.nextLine();
        Scanner inp2 = new Scanner(System.in);
        System.out.print(c.yw + "\nEnter potential substring: ");
        String input2 = inp2.nextLine();

        if (input1.contains(input2)) {

            System.out.println(c.cy + input2 + c.gr + " is a substring of " + input1);

        } else {

            System.out.println(c.cy + input2 + c.gr + " is not a substring of " + input1);

        }


        Scanner wait = new Scanner(System.in);
        wait.nextLine();


    }

}
