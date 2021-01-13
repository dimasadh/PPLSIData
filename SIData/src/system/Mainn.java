package system;

import panel.form.*;
import panel.list.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.border.MatteBorder;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mainn extends JFrame {

	private JPanel bodyPanel = new JPanel();
	public static JPanel MainPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainn frame = new Mainn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Mainn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 498);
		
		//create Body Panel
		bodyPanel.setBackground(new Color(160, 82, 45));
		bodyPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(bodyPanel);
		bodyPanel.setLayout(null);
		
		//create Master Data Panel
		JPanel MasterDataPanel = new JPanel();
		MasterDataPanel.setBackground(new Color(222, 184, 135));
		MasterDataPanel.setBounds(5, 11, 136, 409);
		MasterDataPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		FlowLayout fl_MasterDataPanel = (FlowLayout) MasterDataPanel.getLayout();
		bodyPanel.add(MasterDataPanel);
		
		JComboBox comboViewData = new JComboBox();
		comboViewData.setModel(new DefaultComboBoxModel(new String[] {"View Data", "Standard", "Device", "Unit", "Type", "Element"}));
		MasterDataPanel.add(comboViewData);
		
		//create Main Panel
		MainPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		MainPanel.setBackground(new Color(222, 184, 135));
		MainPanel.setBounds(146, 11, 620, 409);
		bodyPanel.add(MainPanel);
		MainPanel.setLayout(new CardLayout(0, 0));
		
		//create Menu Bar
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnReport = new JMenu("Report");
		menuBar.add(mnReport);
		
		JMenuItem mntmCreateReport = new JMenuItem("Create Report");
		mntmCreateReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new AssessmentForm();
				setMainPanel(panel);
			}
		});
		mnReport.add(mntmCreateReport);
		
		JMenuItem mntmViewReport = new JMenuItem("View Report");
		mntmViewReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new ReportList();
				setMainPanel (panel);
			}
		});
		mnReport.add(mntmViewReport);
		
		JMenu mnAssignment = new JMenu("Assignment");
		menuBar.add(mnAssignment);
		
		JMenuItem mntmViewAssignments = new JMenuItem("View Assignments");
		mntmViewAssignments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new AssignmentList();
				setMainPanel(panel);
			}
		});
		mnAssignment.add(mntmViewAssignments);
		
		JMenuItem mntmNewAssignment = new JMenuItem("New Assignment");
		mntmNewAssignment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new AssignmentForm();
				setMainPanel(panel);
			}
		});
		mnAssignment.add(mntmNewAssignment);
		
		JMenu mnOperator = new JMenu("Operator");
		menuBar.add(mnOperator);
		
		JMenuItem mntmViewOperator = new JMenuItem("View Operator");
		mntmViewOperator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new OperatorList();
				setMainPanel (panel);
			}
		});
		mnOperator.add(mntmViewOperator);
		
		JMenu mnProfile = new JMenu("Profile");
		menuBar.add(mnProfile);
		
		JMenuItem mntmViewProfile = new JMenuItem("View Profile");
		mntmViewProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new ProfileForm();
				setMainPanel(panel);
			}
		});
		mnProfile.add(mntmViewProfile);
	}
	
	public static void setMainPanel (JPanel panel) {
		//remove panel
		MainPanel.removeAll();
		MainPanel.repaint();
		MainPanel.revalidate();
		
		//add panel
		MainPanel.add(panel);
		MainPanel.repaint();
		MainPanel.revalidate();
		
	}
}
