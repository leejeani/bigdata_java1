package inner;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.jws.Oneway;

public class Awt {

	public static void main(String[] args) {
		Frame f = new Frame();
		Button b = new Button("Click!!");
		f.setSize(300, 300);
		f.setBackground(Color.red);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
			}
		});
		f.add(b);
		f.setVisible(true);
	}
}






