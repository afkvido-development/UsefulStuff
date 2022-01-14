/*
 * Copyright (c) 2022, gemsvidø
 * All rights reserved.
 */

package u.programs;

import org.jetbrains.annotations.NotNull;
import u.resources.LOAN;
import u.resources.UseFul;
import u.resources.c;

import java.util.Scanner;

public @UseFul interface LoanCalculator {

    static @UseFul void interactive() {


        System.out.println(c.wh + "\nLoan Calculator - made by gemsvidø");

        Scanner input1 = new Scanner(System.in);
        System.out.print(c.yw + "\nEnter loan amount: ");
        double amount = input1.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.print(c.yw + "\nEnter number of years: ");
        byte years = input2.nextByte();
        Scanner input3 = new Scanner(System.in);
        System.out.print(c.yw + "\nEnter interest rate: ");
        double interest = input3.nextDouble();
        System.out.println(c.wh + "\nCalculating loan - please wait.");
        double total = (amount * ((interest + 100) / 100));
        double monthly = ((total / years) / 12);

        System.out.println("\n\n\n\n");
        System.out.print(c.cy + "Total payment: ");
        System.out.printf("%, d", (int)total);
        System.out.print("\nMonthly payment: ");
        System.out.printf("%, d", (int)monthly);
        System.out.print(c.rs);

        Scanner wait = new Scanner(System.in);
        wait.nextLine();




    }

    static @UseFul int fire (@NotNull @UseFul LOAN get, double amount, short years, double interest) {



        double total = (amount * ((interest + 100) / 100));
        double monthly = ((total / years) / 12);


        if (get == LOAN.TOTAL_PAYMENT) {
            return (int)total;
        } else {
            return (int)monthly;
        }





    }

}
