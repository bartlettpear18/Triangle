package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Main {


    static Mouse m = new Mouse();

    public static void main(String[] args) {
	// write your code here
        JFrame frame = new JFrame("MouesTriangle");
        frame.addMouseListener(m);

        frame.setSize(100,1000);
        frame.setVisible(true);
    }

    static class Mouse implements MouseListener {


        @Override
        public void mouseClicked(MouseEvent e) {
            Point mouse = MouseInfo.getPointerInfo().getLocation();
            System.out.println(mouse.x + ", " + mouse.y);
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}


