/*
 * Copyright (c) 2022, gemsvidø
 * All rights reserved.
 */

package u.programs;

import u.resources.UseFul;

import java.util.Scanner;

public interface TelephoneKeypad {

    static @UseFul byte fire (Character input) {


        return switch (input) {
            case 'A', 'a', 'B', 'b', 'C', 'c' -> 2;
            case 'D', 'd', 'E', 'e', 'F', 'f' -> 3;
            case 'G', 'g', 'H', 'h', 'I', 'i' -> 4;
            case 'J', 'j', 'K', 'k', 'L', 'l' -> 5;
            case 'M', 'm', 'N', 'n', 'O', 'o' -> 6;
            case 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's' -> 7;
            case 'T', 't', 'U', 'u', 'V', 'v' -> 8;
            case 'W', 'w', 'X', 'x', 'Y', 'y', 'Z', 'z' -> 9;
            default -> -1;
        };


    }

    static @UseFul void interactive () {


            Scanner inp = new Scanner(System.in);
            System.out.print("Enter a letter");
            String input = inp.next();
            System.out.println();


            switch (input.toUpperCase().charAt(0)) {
                case 'A':
                case 'B':
                case 'C':
                    System.out.println(2);
                    break;
                case 'D':
                case 'E':
                case 'F':
                    System.out.println(3);
                    break;
                case 'G':
                case 'H':
                case 'I':
                    System.out.println(4);
                    break;
                case 'J':
                case 'K':
                case 'L':
                    System.out.println(5);
                    break;
                case 'M':
                case 'N':
                case 'O':
                    System.out.println(6);
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    System.out.println(7);
                    break;
                case 'T':
                case 'U':
                case 'V':
                    System.out.println(8);
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    System.out.println(9);
                    break;
                default:
                    System.out.println("Invalid input (" + input + ")");
                    break;


        }

    }


}
