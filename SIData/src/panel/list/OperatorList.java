package panel.list;

import panel.form.*;
import database.DBHandler;

import javax.swing.JPanel;
import java.sql.SQLException;

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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OperatorList extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public OperatorList() {
		setLayout(null);
		
		JLabel lblListOperator = new JLabel("List Operator");
		lblListOperator.setBounds(303, 5, 95, 14);
		add(lblListOperator);
		
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
		
		table = new JTable();
		table.setBounds(10, 50, 600, 226);
		showOperator();
		MainPanel.add(table);
		btnCreateNewOperator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new OperatorForm();
				Mainn.setMainPanel(panel);
			}
		});

	}
	
	private void showOperator() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("No.");
		model.addColumn("Name");
		model.addColumn("Position");
		model.addColumn("Mobile Number");
		model.addColumn("Email");
		model.addColumn("Institution");
		
		try {
			int no = 1;
			String sql = "SELECT name, position, mobileNumber, email, institution FROM profile p, operator o where o.idProfile = p.idProfile";
			java.sql.Connection conn = DBHandler.configDB();
			java.sql.Statement stm = conn.createStatement();
			java.sql.ResultSet res = stm.executeQuery(sql);
			
			while(res.next()) {
				model.addRow(new Object[] {no++, 
						res.getString(1),
						res.getString(2),
						res.getString(3),
						res.getString(4),
						res.getString(5),
				});
			}
			
			table.setModel(model);
			
		}catch (SQLException e){
			System.out.println("Error " + e.getMessage());
		}
	}
}
