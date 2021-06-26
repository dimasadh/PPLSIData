package panel.form;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ProfileForm extends JPanel {
	private JTextField textFieldName;
	private JTextField textFieldPosition;
	private JTextField textFieldMobileNumber;
	private JTextField textFieldEmail;
	private JTextField textFieldInstituion;

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
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(269, 332, 82, 23);
		Form.add(btnAdd);
		
		JLabel lblProfileForm = new JLabel("Profile Form");
		lblProfileForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfileForm.setBounds(260, 11, 99, 14);
		Form.add(lblProfileForm);
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		textFieldName.setBounds(307, 54, 279, 20);
		Form.add(textFieldName);
		
		textFieldPosition = new JTextField();
		textFieldPosition.setColumns(10);
		textFieldPosition.setBounds(307, 85, 279, 20);
		Form.add(textFieldPosition);
		
		textFieldMobileNumber = new JTextField();
		textFieldMobileNumber.setColumns(10);
		textFieldMobileNumber.setBounds(307, 116, 279, 20);
		Form.add(textFieldMobileNumber);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(307, 147, 279, 20);
		Form.add(textFieldEmail);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(59, 57, 46, 14);
		Form.add(lblName);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setBounds(59, 88, 46, 14);
		Form.add(lblPosition);
		
		JLabel lblMobileNumber = new JLabel("Mobile Number");
		lblMobileNumber.setBounds(59, 119, 90, 14);
		Form.add(lblMobileNumber);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(59, 150, 46, 14);
		Form.add(lblEmail);
		
		JLabel lblInstitution = new JLabel("Institution");
		lblInstitution.setBounds(59, 181, 90, 14);
		Form.add(lblInstitution);
		
		textFieldInstituion = new JTextField();
		textFieldInstituion.setColumns(10);
		textFieldInstituion.setBounds(307, 178, 279, 20);
		Form.add(textFieldInstituion);

	}
	
	public ProfileForm(int idProfile) {
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
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		textFieldName.setBounds(307, 54, 279, 20);
		Form.add(textFieldName);
		
		textFieldPosition = new JTextField();
		textFieldPosition.setColumns(10);
		textFieldPosition.setBounds(307, 85, 279, 20);
		Form.add(textFieldPosition);
		
		textFieldMobileNumber = new JTextField();
		textFieldMobileNumber.setColumns(10);
		textFieldMobileNumber.setBounds(307, 116, 279, 20);
		Form.add(textFieldMobileNumber);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(307, 147, 279, 20);
		Form.add(textFieldEmail);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(59, 57, 46, 14);
		Form.add(lblName);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setBounds(59, 88, 46, 14);
		Form.add(lblPosition);
		
		JLabel lblMobileNumber = new JLabel("Mobile Number");
		lblMobileNumber.setBounds(59, 119, 90, 14);
		Form.add(lblMobileNumber);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(59, 150, 46, 14);
		Form.add(lblEmail);
		
		JLabel lblInstitution = new JLabel("Institution");
		lblInstitution.setBounds(59, 181, 90, 14);
		Form.add(lblInstitution);
		
		textFieldInstituion = new JTextField();
		textFieldInstituion.setColumns(10);
		textFieldInstituion.setBounds(307, 178, 279, 20);
		Form.add(textFieldInstituion);

	}
	
	private void addProfile() {
		
	}
	
	
}
