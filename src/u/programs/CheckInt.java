package u.programs;

import org.jetbrains.annotations.NotNull;
import u.resources.UseFul;
import u.resources.c;

import java.util.Scanner;

public @UseFul interface CheckInt {

    static @UseFul boolean fire(@NotNull String input) {


        boolean isInt1 = true;


        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isDigit(ch)) {
                isInt1 = false;
            }


        }


        return isInt1;


    }

    static @UseFul void interactive() {

        Scanner sc = new Scanner(System.in);
        System.out.print(c.yw + "\nEnter string to check: ");
        String check = sc.nextLine();


        boolean isInt1 = true;


        for (int i = 0; i < check.length(); i++) {
            char ch = check.charAt(i);
            if (!Character.isDigit(ch)) {
                isInt1 = false;
            }


        }



        if (isInt1) {

            System.out.println(c.cy + check + c.gr + " is an integer");

        } else {

            System.out.println(c.cy + check + c.rd + " is not an integer");

        }


    }


}
