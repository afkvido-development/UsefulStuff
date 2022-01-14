/* Copyright (c) 2022, gemsvidø
All rights reserved. */

package u.resources;

public @UseFul class Rectangle {

    private long width;
    private long height;

    public @UseFul Rectangle(long rectWidth, long rectHeight) {
        width = rectWidth;
        height = rectHeight; }

    public @UseFul long getArea()
    {
        return width * height;
    }

    public @UseFul long getHeight()
    {
        return height;
    }

    public @UseFul long getWidth()
    {
        return width;
    }

    public @UseFul long getPerimeter() {

        return (width + width + height + height);
    }

    public @Override @UseFul String toString() {
        return c.gr + "Width: " + c.cy + getWidth() + c.gr + "\nHeight: " + c.cy + getHeight() + c.gr + "\nArea: " + c.cy + getArea() + c.gr + "\nPerimeter: " + c.cy + getPerimeter();
    }

}
