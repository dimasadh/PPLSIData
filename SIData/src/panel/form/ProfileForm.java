package panel.form;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ProfileForm extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public ProfileForm() {
		setLayout(null);
		
		JPanel Form = new JPanel();
		Form.setLayout(null);
		Form.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Form.setBackground(new Color(222, 184, 135));
		Form.setBounds(0, 0, 620, 409);
		add(Form);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(269, 332, 82, 23);
		Form.add(btnUpdate);
		
		JLabel lblProfileForm = new JLabel("Profile Form");
		lblProfileForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfileForm.setBounds(260, 11, 99, 14);
		Form.add(lblProfileForm);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(307, 54, 279, 20);
		Form.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(307, 85, 279, 20);
		Form.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(307, 116, 279, 20);
		Form.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(307, 147, 279, 20);
		Form.add(textField_3);
		
		JLabel lblEntity1 = new JLabel("Entity1");
		lblEntity1.setBounds(59, 57, 46, 14);
		Form.add(lblEntity1);
		
		JLabel lblEntity2 = new JLabel("Entity2");
		lblEntity2.setBounds(59, 88, 46, 14);
		Form.add(lblEntity2);
		
		JLabel lblEntity3 = new JLabel("Entity3");
		lblEntity3.setBounds(59, 119, 46, 14);
		Form.add(lblEntity3);
		
		JLabel lblEntity4 = new JLabel("Entity4");
		lblEntity4.setBounds(59, 150, 46, 14);
		Form.add(lblEntity4);

	}
}
