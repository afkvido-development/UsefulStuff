/*
 * Copyright (c) 2022, gemsvidø
 * All rights reserved.
 */

package u.programs;

import u.resources.UseFul;
import u.resources.c;

import java.util.Scanner;

public interface FibonacciNumbers {

    static @UseFul String fire (short attempts) {

        StringBuffer construct = new StringBuffer();


        construct.append(c.pr + "1\n1");
        long f1 = 1;
        long f2 = 1;
        long temp;
        for (long i = 0; i < attempts; i++) {
            temp = f1 + f2;
            construct.append(c.pr).append(temp).append(c.rs);
            f1 = f2;
            f2 = temp;



        }

        return construct.toString();
    }

    static @UseFul void interactive () {


        Scanner input1 = new Scanner(System.in);
        System.out.print(c.yw + "\nEnter amount (Byte to prevent overflow): ");
        byte fb = input1.nextByte();


        System.out.println(c.pr + "1\n1");
        long f1 = 1;
        long f2 = 1;
        long temp;
        for (long i = 0; i < fb; i++) {
            temp = f1 + f2;
            System.out.println(c.pr + temp + c.rs);
            f1 = f2;
            f2 = temp;

        }


    }

}
