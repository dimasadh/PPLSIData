package panel.list;

import panel.form.*;

import javax.swing.JPanel;

import system.Mainn;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.CardLayout;

public class OperatorList extends JPanel {

	/**
	 * Create the panel.
	 */
	public OperatorList() {
		setLayout(null);
		
		JLabel lblListOperator = new JLabel("List Operator");
		lblListOperator.setBounds(303, 5, 95, 14);
		add(lblListOperator);
		
		JList list = new JList();
		list.setBounds(10, 52, 596, 224);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Operator1", "Operator2", "Operator3"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		add(list);
		
		JPanel MainPanel = new JPanel();
		MainPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		MainPanel.setBackground(new Color(222, 184, 135));
		MainPanel.setBounds(0, 0, 620, 409);
		add(MainPanel);
		MainPanel.setLayout(null);
		
		JButton btnDeactive = new JButton("Deactive");
		btnDeactive.setBounds(267, 375, 95, 23);
		MainPanel.add(btnDeactive);
		
		JButton btnCreateNewOperator = new JButton("Create New Operator");
		btnCreateNewOperator.setBounds(10, 375, 191, 23);
		MainPanel.add(btnCreateNewOperator);
		btnCreateNewOperator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new OperatorForm();
				Mainn.setMainPanel(panel);
			}
		});

	}
}
