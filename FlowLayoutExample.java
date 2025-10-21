package Practical;

	import javax.swing.*;
	import java.awt.*;
	public class FlowLayoutExample {
	
		    public static void main(String[] args) {
		        JFrame f = new JFrame("FlowLayout");
		        f.setLayout(new FlowLayout());
		        for (int i = 1; i <= 4; i++) f.add(new JButton("Button " + i));
		        f.setSize(400, 200);
		        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        f.setVisible(true);
		    }
		}

