package panel.list;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class AssignmentList extends JPanel {

	/**
	 * Create the panel.
	 */
	public AssignmentList() {
		setLayout(null);
		
		JPanel MainPanel = new JPanel();
		MainPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		MainPanel.setBackground(new Color(222, 184, 135));
		MainPanel.setBounds(0, 0, 620, 409);
		add(MainPanel);
		MainPanel.setLayout(null);
		
		JLabel lblAssignmentList = new JLabel("Assignment List");
		lblAssignmentList.setHorizontalAlignment(SwingConstants.CENTER);
		lblAssignmentList.setBounds(246, 34, 127, 14);
		MainPanel.add(lblAssignmentList);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			//list assignment dari entity assignment
			String[] values = new String[] {"Assignment 1", "Assignment 2", "Assignment 3"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(10, 59, 600, 307);
		MainPanel.add(list);
		
		JButton button = new JButton("New button");
		button.setBounds(272, 327, 89, 23);
		MainPanel.add(button);
		
		JButton btnCancelAssignments = new JButton("Cancel Assignments");
		btnCancelAssignments.setBounds(231, 377, 157, 23);
		MainPanel.add(btnCancelAssignments);

	}
}
