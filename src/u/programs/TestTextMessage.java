/*
 * Copyright (c) 2022, gemsvidø
 * All rights reserved.
 */

package u.programs;

import u.resources.TextMessage;
import u.resources.c;

public interface TestTextMessage {


    static void test() {

        System.out.println();

        TextMessage testMessage = new TextMessage("hello your computer has virus", "gemsvido", "gemsvidoAlt", c.rd, "OWNER", c.pr, "ALT", c.yw);

        System.out.println(testMessage);

    }

}
