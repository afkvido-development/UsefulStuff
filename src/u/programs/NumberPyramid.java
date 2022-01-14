/*
 * Copyright (c) 2022, gemsvidø
 * All rights reserved.
 */

package u.programs;

import u.resources.UseFul;

import java.util.Scanner;

public interface NumberPyramid {

    static @UseFul String fire_pyramid (short lines) {

        StringBuffer construct = new StringBuffer();

        for (int row = 1; row <= lines; row++) {

            for (int column = lines; column >= row; column--) {
                construct.append(" ");
            }
            for (int column = row; column > 1; column--) {
                construct.append(column);
            }


            for (int column = 1; column <= 7; column++) {

                if (row >= column) {
                    construct.append(column);
                }
            }


            construct.append("\n");
        }


    return construct.toString();

    }

    static @UseFul void interactive_pyramid () {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int inp = input.nextInt();
        System.out.println();

        for (int row = 1; row <= inp; row++) {

            for (int column = inp; column >= row; column--) {
                System.out.print(" ");
            }
            for (int column = row; column > 1; column--) {
                System.out.print(column);
            }


            for (int column = 1; column <= 7; column++) {

                if (row >= column) {
                    System.out.print(column);
                }
            }


            System.out.println();
        }



    }

    static @UseFul String fire_cliff (byte lines) {

    StringBuffer construct = new StringBuffer();

        for (int row = 1; row <= lines; row++) {

            for (int column = lines; column >= row; column--) {

                construct.append(column).append(" ");


            }

            construct.append("\n");

        }

        return construct.toString();

    }

    static @UseFul void interactive_cliff () {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of lines (Byte): ");
        byte inp = input.nextByte();
        System.out.println();


        for (int row = 1; row <= inp; row++) {

            for (int column = inp; column >= row; column--) {

                System.out.print(column + " ");


            }

            System.out.println();

        }


    }



}