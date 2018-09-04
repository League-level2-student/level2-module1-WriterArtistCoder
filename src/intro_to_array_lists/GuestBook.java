package intro_to_array_lists;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class GuestBook implements ActionListener {
	static ArrayList<String> guests = new ArrayList<String>();
	
	public static void main(String args[]) {
		// Create a GUI with two buttons. One button reads "Add Name" and the other
		// button reads "View Names".
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setMinimumSize(new Dimension(600, 600));

		JPanel panel = new JPanel();
		frame.add(panel);
		
		JButton add = new JButton("Add Name");
		panel.add(add);
		add.addActionListener(new GuestBook());
		
		JButton view = new JButton("View Names");
		panel.add(view);
		view.addActionListener(new GuestBook());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String txt = ((JButton) e.getSource()).getText();
		if (txt.equals("Add Name")) {
			// When the add name button is clicked, display an input dialog that asks the
			// user to enter a name. Add
			// that name to an ArrayList.
			String guest = JOptionPane.showInputDialog("Input a name to add to guest list.");
			guests.add(guest);
		} else if (txt.equals("View Names")) {
			// When the "View Names" button is clicked, display a
			// message dialog that displays
			// all the names added to the list. Format the list as follows:
			// Guest #1: Bob Banders
			// Guest #2: Sandy Summers
			// Guest #3: Greg Ganders
			// Guest #4: Donny Doners
			String list = "";
			for (int i = 0; i < guests.size(); i++) {
				list += "Guest #" + (i+1) + ": " + guests.get(i) + "\n ";
			}
			
			JOptionPane.showMessageDialog(null, list);
		}
	}
}
