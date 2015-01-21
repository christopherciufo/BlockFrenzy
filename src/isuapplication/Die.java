package isuapplication;

// The "Exercise213" class.
import java.awt.*;

public class Die {

    static int clr, xCoor, yCoor, s;

    public Die() {
    }

    public void setColor(int x) {
        clr = x;

    }

    public void setSize(int size) {
        s = size;
    }

    public void setValue(int v) {
    }

    public void setPosition(int x, int y) {
        xCoor = x;
        yCoor = y;
    }

    public static void dot(Graphics g1, int x, int y, int size) {


        g1.setColor(Color.white);
        g1.fillOval(x * size + xCoor, y * size + yCoor, size * 2, size * 2);
        g1.setColor(Color.black);
        g1.drawOval(x * size + xCoor, y * size + yCoor, size * 2, size * 2);
    }

    public static void draw(Graphics g, int x, int y, int size, int value, Color c) {
        xCoor = x;
        yCoor = y;

        g.setColor(c);
        g.fillRect(x, y, size * 10, size * 10);
        g.setColor(Color.black);
        g.drawRect(x - 1, y - 1, size * 10, size * 10);

        drawDot(g, value, size);
    }

    public static void drawLeft(Graphics g, int x, int y, int size, int value, Color c) {
        xCoor = x;
        yCoor = y;
        g.setColor(c);
        g.fillRect(x, y, size * 10, size * 10);
        g.setColor(Color.black);
        g.drawRect(x, y, size * 10, size * 10);

        drawDot(g, value, size);

        int xPoints[] = new int[4];
        xPoints[0] = x + size * 10;
        xPoints[1] = x + size * 10 + size * 2;
        xPoints[2] = x + size * 10 + size * 2;
        xPoints[3] = x + size * 10;

        int yPoints[] = new int[4];
        yPoints[0] = y;
        yPoints[1] = y + size;
        yPoints[2] = y + size * 9;
        yPoints[3] = y + size * 10;

        g.setColor(Color.red);
        g.fillPolygon(xPoints, yPoints, 4);
        g.setColor(Color.black);
        g.drawPolygon(xPoints, yPoints, 4);
    }

    public static void drawRight(Graphics g, int x, int y, int size, int value, Color c) {
        xCoor = x;
        yCoor = y;
        g.setColor(c);
        g.fillRect(x, y, size * 10 - 1, size * 10);
        g.setColor(Color.black);
        g.drawRect(x, y, size * 10 - 1, size * 10);

        drawDot(g, value, size);

        int xPoints[] = new int[4];
        xPoints[0] = x;
        xPoints[1] = x - size * 2;
        xPoints[2] = x - size * 2;
        xPoints[3] = x;

        int yPoints[] = new int[4];
        yPoints[0] = y;
        yPoints[1] = y + size;
        yPoints[2] = y + size * 9;
        yPoints[3] = y + size * 10;

        g.setColor(Color.blue);
        g.fillPolygon(xPoints, yPoints, 4);
        g.setColor(Color.black);
        g.drawPolygon(xPoints, yPoints, 4);

    }

    public static void drawDot(Graphics g, int value, int size) {

        switch (value) {
            case 0:
                dot(g, 4, 4, size);
                break;
            case 1:
                dot(g, 1, 1, size);
                dot(g, 7, 7, size);
                break;
            case 2:
                dot(g, 1, 1, size);
                dot(g, 4, 4, size);
                dot(g, 7, 7, size);
                break;
            case 3:
                dot(g, 1, 1, size);
                dot(g, 7, 1, size);
                dot(g, 1, 7, size);
                dot(g, 7, 7, size);
                break;
            case 4:
                dot(g, 1, 1, size);
                dot(g, 7, 1, size);
                dot(g, 4, 4, size);
                dot(g, 1, 7, size);
                dot(g, 7, 7, size);
                break;
            case 5:
                dot(g, 1, 1, size);
                dot(g, 1, 4, size);
                dot(g, 7, 1, size);
                dot(g, 7, 4, size);
                dot(g, 1, 7, size);
                dot(g, 7, 7, size);
                break;
            case 6:
                dot(g, 1, 1, size);
                dot(g, 1, 4, size);
                dot(g, 7, 1, size);
                dot(g, 7, 4, size);
                dot(g, 1, 7, size);
                dot(g, 7, 7, size);
                dot(g, 4, 4, size);
                break;
            case 7:
                dot(g, 1, 1, size);
                dot(g, 1, 4, size);
                dot(g, 7, 1, size);
                dot(g, 7, 4, size);
                dot(g, 1, 7, size);
                dot(g, 7, 7, size);
                dot(g, 4, 6, size);
                dot(g, 4, 2, size);
                break;
        }
    }
} // Exercise213 class

