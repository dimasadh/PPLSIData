package panel.form;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import system.Mainn;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.CardLayout;
import javax.swing.JTextField;

public class AssessmentForm extends JPanel {
	private JTextField textField_Entity1;
	private JTextField textField_Entity2;
	private JTextField textField_Entity3;
	private JTextField textField_Entity4;

	/**
	 * Create the panel.
	 */
	public AssessmentForm() {
		setLayout(null);
		
		JPanel Form = new JPanel();
		Form.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Form.setBackground(new Color(222, 184, 135));
		Form.setBounds(0, 0, 620, 409);
		add(Form);
		Form.setLayout(null);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(269, 332, 82, 23);
		Form.add(btnSubmit);
		
		JButton btnAddParameter = new JButton("Add Parameter");
		btnAddParameter.setBounds(59, 332, 133, 23);
		Form.add(btnAddParameter);
		
		JLabel lblAssessmentForm = new JLabel("Assessment Form");
		lblAssessmentForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblAssessmentForm.setBounds(243, 11, 133, 14);
		Form.add(lblAssessmentForm);
		
		textField_Entity1 = new JTextField();
		textField_Entity1.setBounds(307, 54, 279, 20);
		Form.add(textField_Entity1);
		textField_Entity1.setColumns(10);
		
		textField_Entity2 = new JTextField();
		textField_Entity2.setBounds(307, 85, 279, 20);
		Form.add(textField_Entity2);
		textField_Entity2.setColumns(10);
		
		textField_Entity3 = new JTextField();
		textField_Entity3.setBounds(307, 116, 279, 20);
		Form.add(textField_Entity3);
		textField_Entity3.setColumns(10);
		
		textField_Entity4 = new JTextField();
		textField_Entity4.setBounds(307, 147, 279, 20);
		Form.add(textField_Entity4);
		textField_Entity4.setColumns(10);
		
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
		btnAddParameter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new QualityParameterForm();
				Mainn.setMainPanel(panel);
			}
		});
		//submit form report
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
	}
}
