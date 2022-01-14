/*
 * Copyright (c) 2022, gemsvidø
 * All rights reserved.
 */

package u.programs;

import u.resources.UseFul;
import u.resources.c;
import java.util.Random;

public @UseFul interface NewLicensePlate {

    static @UseFul String fire() {

        Random random = new Random();


        int rndm1 = (random.nextInt(9998) + 1);
        int rndm2= (random.nextInt(8) + 1);
        int rndm3= (random.nextInt(8) + 1);
        int rndm4= (random.nextInt(8) + 1);
        StringBuilder plate = new StringBuilder();
        plate.append(rndm1);

        switch (rndm2) {
            case 1:
                plate.append("A");
                break;
            case 2:
                plate.append("B");
                break;
            case 3:
                plate.append("C");
                break;
            case 4:
                plate.append("D");
                break;
            case 5:
                plate.append("E");
                break;
            case 6:
                plate.append("F");
                break;
            case 7:
                plate.append("G");
                break;
            case 8:
                plate.append("H");
                break;
            case 9:
                plate.append("I");
                break;
            default:
                throw new IllegalStateException("How did we get here?");
        }

        switch (rndm3) {
            case 1:
                plate.append("J");
                break;
            case 2:
                plate.append("K");
                break;
            case 3:
                plate.append("L");
                break;
            case 4:
                plate.append("M");
                break;
            case 5:
                plate.append("N");
                break;
            case 6:
                plate.append("O");
                break;
            case 7:
                plate.append("P");
                break;
            case 8:
                plate.append("Q");
                break;
            case 9:
                plate.append("R");
                break;
            default:
                throw new IllegalStateException("How did we get here?");
        }

        switch (rndm4) {
            case 1:
                plate.append("S");
                break;
            case 2:
                plate.append("T");
                break;
            case 3:
                plate.append("U");
                break;
            case 4:
                plate.append("V");
                break;
            case 5:
                plate.append("W");
                break;
            case 6:
                plate.append("X");
                break;
            case 7:
                plate.append("Y");
                break;
            case 8:
                plate.append("Z");
                break;
            case 9:
                plate.append("A");
                break;
            default:
                throw new IllegalStateException("How did we get here?");
        }

        return (c.bl +  "\n[" + c.cy + plate + c.bl + "]");


    }
}
