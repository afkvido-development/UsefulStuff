/*
 * Copyright (c) 2022, gemsvidø
 * All rights reserved.
 */

package u.programs;

import u.resources.UseFul;
import u.resources.c;
import u.resources.Rectangle;
import java.util.Scanner;


public @UseFul interface RectangleTest_Interactive {


    static @UseFul void fromWidthAndHeight() {

        Scanner scanner = new Scanner(System.in);

        System.out.print(c.pr + "Enter rectangle width: ");


        Long w = scanner.nextLong();


        System.out.print(c.pr + "Enter rectangle height: ");

        Long h = scanner.nextLong();

        Rectangle rectangle = new Rectangle(w, h);


        System.out.println(rectangle);



    }

    static @UseFul void fromPerimeterAndHeight() {


        Scanner scanner = new Scanner(System.in);

        System.out.print(c.pr + "Enter rectangle perimeter: ");


        long p = scanner.nextLong();


        System.out.print(c.pr + "Enter rectangle height: ");

        long h = scanner.nextLong();


        long w = (p - h*2) / 2;


        Rectangle rectangle = new Rectangle(w, h);


        System.out.println(rectangle);



    }

    static @UseFul void fromPerimeterAndWidth() {


        Scanner scanner = new Scanner(System.in);

        System.out.print(c.pr + "Enter rectangle perimeter: ");


        long p = scanner.nextLong();


        System.out.print(c.pr + "Enter rectangle width: ");

        long w = scanner.nextLong();


        long h = (p - w*2) / 2;


        Rectangle rectangle = new Rectangle(w, h);


        System.out.println(rectangle);



    }

    static @UseFul void fromAreaAndHeight () {



        Scanner scanner = new Scanner(System.in);

        System.out.print(c.pr + "Enter rectangle area: ");


        long a = scanner.nextLong();


        System.out.print(c.pr + "Enter rectangle height: ");

        long h = scanner.nextLong();


        long w = a / h;


        Rectangle rectangle = new Rectangle(w, h);


        System.out.println(rectangle);


    }

    static @UseFul void fromAreaAndWidth () {



        Scanner scanner = new Scanner(System.in);

        System.out.print(c.pr + "Enter rectangle area: ");


        long a = scanner.nextLong();


        System.out.print(c.pr + "Enter rectangle width: ");

        long w = scanner.nextLong();


        long h = a / w;


        Rectangle rectangle = new Rectangle(w, h);


        System.out.println(rectangle);


        Scanner wait = new Scanner(System.in);
        wait.nextLine();




    }




}
