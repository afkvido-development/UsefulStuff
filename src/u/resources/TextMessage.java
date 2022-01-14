/*
 * Copyright (c) 2022, gemsvidø
 * All rights reserved.
 */

package u.resources;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public @UseFul class TextMessage {

    private String author_name;
    private String author_color;
    private String author_prefix;

    private String recipient_name;
    private String recipient_color;
    private String recipient_prefix;

    private String message_content;
    private String message_color;


    public @UseFul TextMessage (@NotNull String message_content, @NotNull String author_name, @NotNull String recipient_name, @Nullable String author_color, @Nullable String author_prefix, @Nullable String recipient_color, @Nullable String recipient_prefix, @Nullable String message_color) {



        if (author_color == null || author_color.equals("")) {
            this.author_color = c.rs;
        } else {
            this.author_color = author_color;
        }

        this.author_name = this.author_color + author_name;


        if (author_prefix == null || author_prefix.equals("")) {
            this.author_prefix = "";
        } else {
            this.author_prefix = this.author_color + "[" + author_prefix + "]";
        }





        if (recipient_color == null || recipient_color.equals("")) {
            this.recipient_color = c.rs;
        } else {
            this.recipient_color = recipient_color;
        }

        this.recipient_name = this.recipient_color + recipient_name;


        if (author_prefix == null || author_prefix.equals("")) {
            this.recipient_prefix = "";
        } else {
            this.recipient_prefix = this.recipient_color + "[" + recipient_prefix + "]";
        }



        this.message_content = message_content;


        if (message_color == null || message_color.equals("")) {
            this.message_color = c.rs;
        } else {
            this.message_color = message_color;
        }



    }

    public @UseFul @Override @NotNull String toString() {

        return c.bl + "{" + this.author_prefix + " " + this.author_name + c.bl + " to " + this.recipient_prefix + " " + this.recipient_name + c.bl + "}: " + message_color + message_content;
    }

}
