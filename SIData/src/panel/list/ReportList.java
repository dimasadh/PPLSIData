package panel.list;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class ReportList extends JPanel {

	/**
	 * Create the panel.
	 */
	public ReportList() {
		setLayout(null);
		
		JPanel MainPanel = new JPanel();
		MainPanel.setLayout(null);
		MainPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		MainPanel.setBackground(new Color(222, 184, 135));
		MainPanel.setBounds(0, 0, 620, 409);
		add(MainPanel);
		
		JLabel lblReportList = new JLabel("Report List");
		lblReportList.setHorizontalAlignment(SwingConstants.CENTER);
		lblReportList.setBounds(246, 34, 127, 14);
		MainPanel.add(lblReportList);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Report1", "Report2", "Report3"};
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
		
		JButton btnAssignments = new JButton("Assignments");
		btnAssignments.setBounds(246, 377, 127, 23);
		MainPanel.add(btnAssignments);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setBounds(10, 377, 89, 23);
		MainPanel.add(btnPrint);

	}

}
