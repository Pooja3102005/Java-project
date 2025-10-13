package Inheritance;

import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener, MouseMotionListener {
    TextField tf;

    MouseEventDemo() {
        tf = new TextField(30);
        add(tf, BorderLayout.SOUTH);
        setSize(400, 300);
        setTitle("Mouse Event Demo");
        setVisible(true);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        tf.setText("Mouse Clicked at: X = " + e.getX() + ", Y = " + e.getY());
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public void mouseMoved(MouseEvent e) {
        setTitle("Mouse Moved at: X = " + e.getX() + ", Y = " + e.getY());
    }

    public void mouseDragged(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseEventDemo();
    }


}

