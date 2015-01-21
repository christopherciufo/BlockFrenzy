package isuapplication;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class ISUMain extends JPanel implements MouseListener {

    //public JLabel label1;
    //all variable declarations
    static Color clr = new Color(0,205,250);
    static Color clrBlock = new Color(65,105,225);
    static boolean change = true;
    static int[] value = new int[8];
    static int score = 0;
    static int x1 = 150, x2 = x1 + 100, x3 = x1 + 200, x4 = x1, x5 = x1 + 100, x6 = x1 + 200, x7 = x1, x8 = x1 + 100;
    static int y1 = 85, y2 = y1, y3 = y1, y4 = y1 + 100, y5 = y1 + 100, y6 = y1 + 100, y7 = y1 + 200, y8 = y1 + 200;
    static int xSpace = x1 + 200, ySpace = y1 + 200, xSpace1 = xSpace + 100, ySpace1 = ySpace + 100;
    public JLabel scoreLabel, titleLabel;

    public ISUMain() {

        addMouseListener(this);//implements the mouse Listener
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        setLayout(null); //Set the layout manager to be NULL

        //sets the fonts
        Font scoreFont = new Font("Arial", Font.BOLD, 20);
        Font titleFont = new Font("Arial", Font.BOLD, 35);

        //sets the name, bounds and fonts of the score label
        scoreLabel = new JLabel("Moves: " + score);
        scoreLabel.setBounds(35, 0, 640, 100);
        scoreLabel.setFont(scoreFont);
        //sets the name, bounds and fonts of the title label
        titleLabel = new JLabel("Block Frenzy!");
        titleLabel.setBounds(185, 0, 640, 90);
        titleLabel.setFont(titleFont);

        //adds the labels to the Frame
        add(scoreLabel);
        add(titleLabel);

    }

    public static void main(String[] args) {
        JFrame f = new JFrame(); //Initializes a new frame
        ISUMain m = new ISUMain(); //new main
        f.add(m);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(640, 480);
        f.setTitle("Dice Solving");
        randValue(); //calls to randomize the dice values

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);

        g.setColor(clr);
        g.fillRect(0, 0, 640, 480); //Paints the background
        draw(g); //draws the inital setup


    }

    public void moveBlock(Graphics g, int mouseX, int mouseY) {

        //----------------------------------------------------------------------
        //-------------------------BLOCK 1 MOVEMENT-----------------------------
        //----------------------------------------------------------------------
        if (mouseX > x1 && mouseX <= x1 + 100 && mouseY > y1 && mouseY <= y1 + 100) {

            moveBlock1(g, mouseX, mouseY);

            //Assign new variables
            if (change == true) {
                int xTemp = x1;
                int yTemp = y1;
                x1 = xSpace;
                y1 = ySpace;
                xSpace = xTemp;
                ySpace = yTemp;
                xSpace1 = xSpace + 100;
                ySpace1 = ySpace + 100;
                score++;
                scoreLabel.setText("Moves: " + score);
            }
        }
        //----------------------------------------------------------------------
        //-------------------------BLOCK 2 MOVEMENT-----------------------------
        //----------------------------------------------------------------------
        if (mouseX > x2 && mouseX <= x2 + 100 && mouseY > y2 && mouseY <= y2 + 100) {

            moveBlock2(g, mouseX, mouseY);

            //Assign new variables
            if (change == true) {
                int xTemp = x2;
                int yTemp = y2;
                x2 = xSpace;
                y2 = ySpace;
                xSpace = xTemp;
                ySpace = yTemp;
                xSpace1 = xSpace + 100;
                ySpace1 = ySpace + 100;
                score++;
                scoreLabel.setText("Moves: " + score);
            }
        }
        //----------------------------------------------------------------------
        //-------------------------BLOCK 3 MOVEMENT-----------------------------
        //----------------------------------------------------------------------
        if (mouseX > x3 && mouseX <= x3 + 100 && mouseY > y3 && mouseY <= y3 + 100) {

            moveBlock3(g, mouseX, mouseY);

            //Assign new variables
            if (change == true) {
                int xTemp = x3;
                int yTemp = y3;
                x3 = xSpace;
                y3 = ySpace;
                xSpace = xTemp;
                ySpace = yTemp;
                xSpace1 = xSpace + 100;
                ySpace1 = ySpace + 100;
                score++;
                scoreLabel.setText("Moves: " + score);
            }
        }
        //----------------------------------------------------------------------
        //-------------------------BLOCK 4 MOVEMENT-----------------------------
        //----------------------------------------------------------------------
        if (mouseX > x4 && mouseX <= x4 + 100 && mouseY > y4 && mouseY <= y4 + 100) {

            moveBlock4(g, mouseX, mouseY);

            //Assign new variables
            if (change == true) {
                int xTemp = x4;
                int yTemp = y4;
                x4 = xSpace;
                y4 = ySpace;
                xSpace = xTemp;
                ySpace = yTemp;
                xSpace1 = xSpace + 100;
                ySpace1 = ySpace + 100;
                score++;
                scoreLabel.setText("Moves: " + score);
            }
        }
        //----------------------------------------------------------------------
        //-------------------------BLOCK 5 MOVEMENT-----------------------------
        //----------------------------------------------------------------------
        if (mouseX > x5 && mouseX <= x5 + 100 && mouseY > y5 && mouseY <= y5 + 100) {

            moveBlock5(g, mouseX, mouseY);

            //Assign new variables
            if (change == true) {
                int xTemp = x5;
                int yTemp = y5;
                x5 = xSpace;
                y5 = ySpace;
                xSpace = xTemp;
                ySpace = yTemp;
                xSpace1 = xSpace + 100;
                ySpace1 = ySpace + 100;
                score++;
                scoreLabel.setText("Moves: " + score);
            }
        }
        //----------------------------------------------------------------------
        //-------------------------BLOCK 6 MOVEMENT-----------------------------
        //----------------------------------------------------------------------
        if (mouseX > x6 && mouseX <= x6 + 100 && mouseY > y6 && mouseY <= y6 + 100) {

            moveBlock6(g, mouseX, mouseY);

            //Assign new variables
            if (change == true) {
                int xTemp = x6;
                int yTemp = y6;
                x6 = xSpace;
                y6 = ySpace;
                xSpace = xTemp;
                ySpace = yTemp;
                xSpace1 = xSpace + 100;
                ySpace1 = ySpace + 100;
                score++;
                scoreLabel.setText("Moves: " + score);
            }
        }
        //----------------------------------------------------------------------
        //-------------------------BLOCK 7 MOVEMENT-----------------------------
        //----------------------------------------------------------------------
        if (mouseX > x7 && mouseX <= x7 + 100 && mouseY > y7 && mouseY <= y7 + 100) {

            moveBlock7(g, mouseX, mouseY);

            //Assign new variables
            if (change == true) {
                int xTemp = x7;
                int yTemp = y7;
                x7 = xSpace;
                y7 = ySpace;
                xSpace = xTemp;
                ySpace = yTemp;
                xSpace1 = xSpace + 100;
                ySpace1 = ySpace + 100;
                score++;
                scoreLabel.setText("Moves: " + score);
            }


        }
        //----------------------------------------------------------------------
        //-------------------------BLOCK 8 MOVEMENT-----------------------------
        //----------------------------------------------------------------------
        if (mouseX > x8 && mouseX <= x8 + 100 && mouseY > y8 && mouseY <= y8 + 100) {

            moveBlock8(g, mouseX, mouseY);

            //Assign new variables
            if (change == true) {
                int xTemp = x8;
                int yTemp = y8;
                x8 = xSpace;
                y8 = ySpace;
                xSpace = xTemp;
                ySpace = yTemp;
                xSpace1 = xSpace + 100;
                ySpace1 = ySpace + 100;
                score++;
                scoreLabel.setText("Moves: " + score);
            }

        }
    }

    public static void randValue() { //Shuffles the dice number values

        Random rgen = new Random();  // Random number generator

        for (int i = 0; i < value.length; i++) {
            value[i] = i;
        }

        for (int i = 0; i < value.length; i++) {
            int randomPosition = rgen.nextInt(value.length);
            int temp = value[i];
            value[i] = value[randomPosition];
            value[randomPosition] = temp;
        }
    }

    public void moveBlock1(Graphics g, int mouseX, int mouseY) {
        if (mouseX + 100 > xSpace && mouseX + 100 < xSpace1 && mouseY > ySpace && mouseY < ySpace1) { //Checks to see if the empty space is to the right
            for (int i = 0; i <= 100; i += 10) { //counter for moving the block

                g.setColor(clr);
                g.fillRect(x1, y1, 99, 99); //Continuously redraws the blank box to clear the moving box
                Die.draw(g, x1 + i, y1, 10, value[0], clrBlock);//Moving block
                Delay.go(15);//delay 
            }
            change = true;
        } else if (mouseX - 100 > xSpace && mouseX - 100 < xSpace1 && mouseY > ySpace && mouseY < ySpace1) {//Checks to see if the empty space is to the left
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x1, y1, 99, 99);
                Die.draw(g, x1 - i, y1, 10, value[0], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else if (mouseY + 100 > ySpace && mouseY + 100 < ySpace1 && mouseX > xSpace && mouseX < xSpace1) {//Checks to see if the empty space is below
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x1, y1, 99, 99);
                Die.draw(g, x1, y1 + i, 10, value[0], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else if (mouseY - 100 > ySpace && mouseY - 100 < ySpace1 && mouseX > xSpace && mouseX < xSpace1) {//Checks to see if the empty space is above
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x1, y1, 99, 99);
                Die.draw(g, x1, y1 - i, 10, value[0], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else {
            change = false;
        }


    }

    public void moveBlock2(Graphics g, int mouseX, int mouseY) {
        if (mouseX + 100 > xSpace && mouseX + 100 < xSpace1 && mouseY > ySpace && mouseY < ySpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x2, y2, 99, 99);
                Die.draw(g, x2 + i, y2, 10, value[1], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else if (mouseX - 100 > xSpace && mouseX - 100 < xSpace1 && mouseY > ySpace && mouseY < ySpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x2, y2, 99, 99);
                Die.draw(g, x2 - i, y2, 10, value[1], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else if (mouseY + 100 > ySpace && mouseY + 100 < ySpace1 && mouseX > xSpace && mouseX < xSpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x2, y2, 99, 99);
                Die.draw(g, x2, y2 + i, 10, value[1], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else if (mouseY - 100 > ySpace && mouseY - 100 < ySpace1 && mouseX > xSpace && mouseX < xSpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x2, y2, 99, 99);
                Die.draw(g, x2, y2 - i, 10, value[1], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else {
            change = false;
        }
    }

    public void moveBlock3(Graphics g, int mouseX, int mouseY) {
        if (mouseX + 100 > xSpace && mouseX + 100 < xSpace1 && mouseY > ySpace && mouseY < ySpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x3, y3, 99, 99);
                Die.draw(g, x3 + i, y3, 10, value[2], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else if (mouseX - 100 > xSpace && mouseX - 100 < xSpace1 && mouseY > ySpace && mouseY < ySpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x3, y3, 99, 99);
                Die.draw(g, x3 - i, y3, 10, value[2], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else if (mouseY + 100 > ySpace && mouseY + 100 < ySpace1 && mouseX > xSpace && mouseX < xSpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x3, y3, 99, 99);
                Die.draw(g, x3, y3 + i, 10, value[2], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else if (mouseY - 100 > ySpace && mouseY - 100 < ySpace1 && mouseX > xSpace && mouseX < xSpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x3, y3, 99, 99);
                Die.draw(g, x3, y3 - i, 10, value[2], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else {
            change = false;
        }
    }

    public void moveBlock4(Graphics g, int mouseX, int mouseY) {
        if (mouseX + 100 > xSpace && mouseX + 100 < xSpace1 && mouseY > ySpace && mouseY < ySpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x4, y4, 99, 99);
                Die.draw(g, x4 + i, y4, 10, value[3], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else if (mouseX - 100 > xSpace && mouseX - 100 < xSpace1 && mouseY > ySpace && mouseY < ySpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x4, y4, 99, 99);
                Die.draw(g, x4 - i, y4, 10, value[3], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else if (mouseY + 100 > ySpace && mouseY + 100 < ySpace1 && mouseX > xSpace && mouseX < xSpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x4, y4, 99, 99);
                Die.draw(g, x4, y4 + i, 10, value[3], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else if (mouseY - 100 > ySpace && mouseY - 100 < ySpace1 && mouseX > xSpace && mouseX < xSpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x4, y4, 99, 99);
                Die.draw(g, x4, y4 - i, 10, value[3], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else {
            change = false;
        }
    }

    public void moveBlock5(Graphics g, int mouseX, int mouseY) {
        if (mouseX + 100 > xSpace && mouseX + 100 < xSpace1 && mouseY > ySpace && mouseY < ySpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x5, y5, 99, 99);
                Die.draw(g, x5 + i, y5, 10, value[4], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else if (mouseX - 100 > xSpace && mouseX - 100 < xSpace1 && mouseY > ySpace && mouseY < ySpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x5, y5, 99, 99);
                Die.draw(g, x5 - i, y5, 10, value[4], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else if (mouseY + 100 > ySpace && mouseY + 100 < ySpace1 && mouseX > xSpace && mouseX < xSpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x5, y5, 99, 99);
                Die.draw(g, x5, y5 + i, 10, value[4], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else if (mouseY - 100 > ySpace && mouseY - 100 < ySpace1 && mouseX > xSpace && mouseX < xSpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x5, y5, 99, 99);
                Die.draw(g, x5, y5 - i, 10, value[4], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else {
            change = false;
        }
    }

    public void moveBlock6(Graphics g, int mouseX, int mouseY) {
        if (mouseX + 100 > xSpace && mouseX + 100 < xSpace1 && mouseY > ySpace && mouseY < ySpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x6, y6, 99, 99);
                Die.draw(g, x6 + i, y6, 10, value[5], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else if (mouseX - 100 > xSpace && mouseX - 100 < xSpace1 && mouseY > ySpace && mouseY < ySpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x6, y6, 99, 99);
                Die.draw(g, x6 - i, y6, 10, value[5], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else if (mouseY + 100 > ySpace && mouseY + 100 < ySpace1 && mouseX > xSpace && mouseX < xSpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x6, y6, 99, 99);
                Die.draw(g, x6, y6 + i, 10, value[5], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else if (mouseY - 100 > ySpace && mouseY - 100 < ySpace1 && mouseX > xSpace && mouseX < xSpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x6, y6, 99, 99);
                Die.draw(g, x6, y6 - i, 10, value[5], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else {
            change = false;
        }
    }

    public void moveBlock7(Graphics g, int mouseX, int mouseY) {
        if (mouseX + 100 > xSpace && mouseX + 100 < xSpace1 && mouseY > ySpace && mouseY < ySpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x7, y7, 99, 99);
                Die.draw(g, x7 + i, y7, 10, value[6], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else if (mouseX - 100 > xSpace && mouseX - 100 < xSpace1 && mouseY > ySpace && mouseY < ySpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x7, y7, 99, 99);
                Die.draw(g, x7 - i, y7, 10, value[6], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else if (mouseY + 100 > ySpace && mouseY + 100 < ySpace1 && mouseX > xSpace && mouseX < xSpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x7, y7, 99, 99);
                Die.draw(g, x7, y7 + i, 10, value[6], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else if (mouseY - 100 > ySpace && mouseY - 100 < ySpace1 && mouseX > xSpace && mouseX < xSpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x7, y7, 99, 99);
                Die.draw(g, x7, y7 - i, 10, value[6], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else {
            change = false;
        }
    }

    public void moveBlock8(Graphics g, int mouseX, int mouseY) {

        if (mouseX + 100 > xSpace && mouseX + 100 < xSpace1 && mouseY > ySpace && mouseY < ySpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x8, y8, 99, 99);
                Die.draw(g, x8 + i, y8, 10, value[7], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else if (mouseX - 100 > xSpace && mouseX - 100 < xSpace1 && mouseY > ySpace && mouseY < ySpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x8, y8, 99, 99);
                Die.draw(g, x8 - i, y8, 10, value[7], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else if (mouseY + 100 > ySpace && mouseY + 100 < ySpace1 && mouseX > xSpace && mouseX < xSpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x8, y8, 99, 99);
                Die.draw(g, x8, y8 + i, 10, value[7], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else if (mouseY - 100 > ySpace && mouseY - 100 < ySpace1 && mouseX > xSpace && mouseX < xSpace1) {
            for (int i = 0; i <= 100; i += 10) {

                g.setColor(clr);
                g.fillRect(x8, y8, 99, 99);
                Die.draw(g, x8, y8 - i, 10, value[7], clrBlock);
                Delay.go(15);
            }
            change = true;
        } else {
            change = false;
        }
    }

    public void draw(Graphics g) {

        //draws all the blocks and the outline of the black space
        Die.draw(g, x1, y1, 10, value[0], clrBlock);
        Die.draw(g, x2, y2, 10, value[1], clrBlock);
        Die.draw(g, x3, y3, 10, value[2], clrBlock);
        Die.draw(g, x4, y4, 10, value[3], clrBlock);
        Die.draw(g, x5, y5, 10, value[4], clrBlock);
        Die.draw(g, x6, y6, 10, value[5], clrBlock);
        Die.draw(g, x7, y7, 10, value[6], clrBlock);
        Die.draw(g, x8, y8, 10, value[7], clrBlock);
        g.drawRect(xSpace - 1, ySpace - 1, 100, 100);

    }

    public static void defaults() {

        //resets the values of all x-coordinates
        x1 = 150;
        x2 = x1 + 100;
        x3 = x1 + 200;
        x4 = x1;
        x5 = x1 + 100;
        x6 = x1 + 200;
        x7 = x1;
        x8 = x1 + 100;
        //resets the values of all y-coordinates
        y1 = 85;
        y2 = y1;
        y3 = y1;
        y4 = y1 + 100;
        y5 = y1 + 100;
        y6 = y1 + 100;
        y7 = y1 + 200;
        y8 = y1 + 200;
        //resets the values of all space-coordinates
        xSpace = x1 + 200;
        ySpace = y1 + 200;
        xSpace1 = xSpace + 100;
        ySpace1 = ySpace + 100;
    }

    @Override
    public void mouseClicked(MouseEvent evt) {
    }

    @Override
    public void mousePressed(MouseEvent evt) {
        Graphics g = getGraphics();
        int x = evt.getXOnScreen();//gets the x coordinates
        int y = evt.getYOnScreen();//gets the y coordinates
        repaint();
        moveBlock(g, x, y);

    }

    @Override
    public void mouseReleased(MouseEvent evt) {
    }

    @Override
    public void mouseEntered(MouseEvent evt) {
    }

    @Override
    public void mouseExited(MouseEvent evt) {
    }
}
