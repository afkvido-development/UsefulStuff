/*
 * Copyright (c) 2022, gemsvidø
 * All rights reserved.
 */

package u.programs;

import u.resources.UseFul;
import u.resources.c;

import java.util.Random;
import java.util.Scanner;

public @UseFul interface CoinFlip {

    static @UseFul void flipOnce() {

        Random random = new Random();
        byte rndm = (byte)(random.nextInt(3));

        if (rndm == 1) {
            System.out.println(c.gr + "Heads!");
        } else {
            System.out.println(c.rd + "Tails!");
        }


        Scanner wait = new Scanner(System.in);
        wait.nextLine();


    }

    static @UseFul void massFlip (int amount, boolean showNumbers) {


        Random random;
        byte rndm;
        int timesHeads = 0;
        int timesTails = 0;


        for (int i = 0; i < amount; i++) {

            random = new Random();
            rndm = (byte) (random.nextInt(2) + 1);

            if (rndm == 1 && showNumbers) {

                System.out.println(c.cy + i + c.gr + " Heads!");
                timesHeads++;

            } else if (rndm == 2 && showNumbers) {


                System.out.println(c.cy + i + c.rd + " Tails!");
                timesTails++;

            } else if (rndm == 1 && (!showNumbers)) {

                System.out.println(c.gr + "Heads!");
                timesHeads++;

            } else if (rndm == 2 && (!showNumbers)) {


                System.out.println(c.rd + "Tails!");
                timesTails++;
            }
        }


        System.out.println(c.bl + "\nResults:\n\n" + c.gr + "Times Heads: " + c.cy + timesHeads + c.rd + "\nTimes Tails: " + c.cy + timesTails);

        if (timesHeads == timesTails) {
            System.out.println(c.cy + "\nEqual Amount");
        } else if (timesHeads > timesTails) {
            System.out.println(c.gr + "\nMore Heads than Tails: " + c.cy + (timesHeads - timesTails));
        } else {
            System.out.println(c.rd + "\nMore Tails than Heads: " + c.cy + (timesTails - timesHeads));
        }




        Scanner wait = new Scanner(System.in);
        wait.nextLine();


    }

    static @UseFul void interactive () {

        Scanner sc = new Scanner(System.in);
        System.out.print(c.yw + "How many coins are you flipping? ");
        int flips = sc.nextInt();
        System.out.println(c.pr + "Flipping " + c.cy + flips + c.pr + " coins.");
        massFlip(flips, true);


    }

}
