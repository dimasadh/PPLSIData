package panel.form;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class QualityParameterForm extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public QualityParameterForm() {
		setLayout(null);
		
		JLabel lblQualityParameterForm = new JLabel("Quality Parameter Form");
		lblQualityParameterForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblQualityParameterForm.setBounds(243, 11, 165, 14);
		add(lblQualityParameterForm);
		
		JPanel MainPanel = new JPanel();
		MainPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		MainPanel.setBackground(new Color(222, 184, 135));
		MainPanel.setBounds(0, 0, 620, 409);
		add(MainPanel);
		MainPanel.setLayout(null);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(273, 375, 74, 23);
		MainPanel.add(btnClose);
		
		JList list = new JList();
		list.setBounds(10, 209, 598, 145);
		MainPanel.add(list);
		
		JLabel lblAddedParameter = new JLabel("Added Parameter");
		lblAddedParameter.setBounds(10, 184, 117, 14);
		MainPanel.add(lblAddedParameter);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(265, 156, 89, 23);
		MainPanel.add(btnAdd);
		
		textField = new JTextField();
		textField.setBounds(302, 44, 306, 20);
		MainPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(302, 75, 306, 20);
		MainPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(302, 106, 306, 20);
		MainPanel.add(textField_2);
		
		JLabel lblEntity1 = new JLabel("Entity1");
		lblEntity1.setBounds(10, 47, 46, 14);
		MainPanel.add(lblEntity1);
		
		JLabel lblEntity2 = new JLabel("Entity2");
		lblEntity2.setBounds(10, 78, 46, 14);
		MainPanel.add(lblEntity2);
		
		JLabel lblEntity3 = new JLabel("Entity3");
		lblEntity3.setBounds(10, 109, 46, 14);
		MainPanel.add(lblEntity3);

	}
}
