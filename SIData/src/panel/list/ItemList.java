package panel.list;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import system.Mainn;
import panel.form.*;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;

public class ItemList extends JPanel {

	/**
	 * Create the panel.
	 */
	public ItemList() {
		setLayout(null);
		
		JPanel MainPanel = new JPanel();
		MainPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		MainPanel.setBackground(new Color(222, 184, 135));
		MainPanel.setBounds(0, 0, 620, 409);
		add(MainPanel);
		MainPanel.setLayout(null);
		
		JLabel lblItemName = new JLabel("Item Name");
		lblItemName.setBounds(246, 34, 127, 14);
		lblItemName.setHorizontalAlignment(SwingConstants.CENTER);
		MainPanel.add(lblItemName);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Item1", "Item2", "Item3"};
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
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(483, 377, 127, 23);
		MainPanel.add(btnSearch);
		
		JButton btnAddItem = new JButton("Add Item");
		btnAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new ItemForm();
				Mainn.setMainPanel(panel);
			}
		});
		btnAddItem.setBounds(10, 377, 89, 23);
		MainPanel.add(btnAddItem);

	}

}
