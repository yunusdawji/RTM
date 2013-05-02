
package com.mycompany.project.client;


import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

public class main2 extends JFrame {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main2 frame = new main2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 3087227191895499102L;
	JPanel panel_2, panel_1;
	JPanel panel_4;
	SellPanel5 panel_3;
	CardLayout cardlayout;
	JScrollPane scrollpane;
	/**
	 * @wbp.nonvisual location=-27,-19
	 */
	private JPanel panel_5;
	private JButton btnReports;
	private JPanel panel_6;
	private JMenuBar menuBar;
	private JMenu mnOptions;
	private JMenuItem mntmAddType;
	private JInternalFrame internalFrame;
	private JPanel panel_7;
	private JPanel panel_8;
	private JLabel lblEnterType;
	private JTextField textField;
	private JButton btnAddType;
	private JButton btnCancel;
	private JMenuItem mntmMrpChange;
	private JPanel panel_9;
	private JLabel lblEnterTagNo;
	private JTextField textField_1;
	private JButton btnGetData;
	private JButton btnCancel_1;
	private JLabel lblTagNo;
	private JTextField textField_2;
	private JLabel lblMrp;
	private JTextField textField_3;
	private JLabel lblQuantity;
	private JTextField textField_4;
	private JPanel panel_10;
	private JPanel panel_11;
	private JLabel lblEnterNewMrp;
	private JTextField textField_5;
	private JButton btnUpdate;
	private JButton btnCancel_2;
	private JPanel panel_12;
	/**
	 * Create the panel.
	 */
	public main2() {
		setForeground(Color.DARK_GRAY);
		setBackground(Color.DARK_GRAY);
		setSize(new Dimension(1000, 700));
		getContentPane().setLayout(new BorderLayout(0, 0));
		menubaractionlistener buttonlistenerobject = new menubaractionlistener();
		
		//panel_5.setLayout(new BorderLayout(0, 0));
		//getContentPane().add(panel_5);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Label.background"));
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("297px:grow"),},
			new RowSpec[] {
				RowSpec.decode("default:grow"),
				FormFactory.MIN_ROWSPEC,
				RowSpec.decode("33px"),}));
		
		panel_8 = new JPanel();
		panel_8.setBackground(UIManager.getColor("Label.background"));
		panel_8.setVisible(false);
		panel.add(panel_8, "1, 1, fill, fill");
		panel_8.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC,}));
		
		lblEnterType = new JLabel("Enter Type");
		panel_8.add(lblEnterType, "3, 1, right, default");
		
		textField = new JTextField();
		panel_8.add(textField, "5, 1, fill, default");
		textField.setColumns(10);
		
		btnAddType = new JButton("Add Type");
		btnAddType.setBackground(UIManager.getColor("Button.light"));
		btnAddType.addActionListener(new optionActionListener());
		panel_8.add(btnAddType, "7, 1");
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBackground(UIManager.getColor("Button.light"));
		btnCancel.addActionListener(new optionActionListener());
		panel_8.add(btnCancel, "9, 1");
		
		panel_9 = new JPanel();
		panel_9.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC,}));
		
		lblEnterTagNo = new JLabel("Enter Tag No:");
		panel_9.add(lblEnterTagNo, "10, 1, right, default");
		
		textField_1 = new JTextField();
		panel_9.add(textField_1, "12, 1, fill, default");
		textField_1.setColumns(10);
		
		btnGetData = new JButton("Get Data");
		panel_9.add(btnGetData, "14, 1");
		btnGetData.addActionListener(new optionActionListener());
		
		btnCancel_1 = new JButton("Cancel");
		panel_9.add(btnCancel_1, "16, 1");
		btnCancel_1.addActionListener(new optionActionListener());
		
		panel_11 = new JPanel();
	//	panel.add(panel_11, "1, 4, fill, fill");
		panel_11.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("fill:pref"),}));
		
		lblEnterNewMrp = new JLabel("Enter New MRP");
		panel_11.add(lblEnterNewMrp, "4, 2, right, default");
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		panel_11.add(textField_5, "6, 2, center, center");
		textField_5.setColumns(10);
		
		btnUpdate = new JButton("Update");
		panel_11.add(btnUpdate, "8, 2, center, center");
		btnUpdate.addActionListener(new optionActionListener());
		
		btnCancel_2 = new JButton("Cancel");
		panel_11.add(btnCancel_2, "10, 2, center, center");
		btnCancel_2.addActionListener(new optionActionListener());
		
		
		panel_12 = new JPanel();
		panel_12.setVisible(false);
		panel_12.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("442px:grow"),},
			new RowSpec[] {
				FormFactory.PREF_ROWSPEC,
				FormFactory.PREF_ROWSPEC,
				FormFactory.PREF_ROWSPEC,
				FormFactory.LINE_GAP_ROWSPEC,}));
		panel_12.add(panel_9, "1, 1, fill, center");
		
		
		panel_10 = new JPanel();
		//panel.add(panel_10, "1, 3, fill, fill");
		panel_10.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		lblTagNo = new JLabel("Tag No");
		panel_10.add(lblTagNo, "4, 2");
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		panel_10.add(textField_2, "6, 2");
		textField_2.setColumns(10);
		
		lblMrp = new JLabel("MRP");
		panel_10.add(lblMrp, "8, 2");
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		panel_10.add(textField_3, "10, 2");
		textField_3.setColumns(10);
		
		lblQuantity = new JLabel("Quantity");
		panel_10.add(lblQuantity, "12, 2");
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		panel_10.add(textField_4, "14, 2");
		textField_4.setColumns(10);
		panel_12.add(panel_10, "1, 2, fill, top");
		panel_12.add(panel_11, "1, 3, fill, top");
		panel.add(panel_12, "1, 2, fill, fill");
		
		
		panel_7 = new JPanel();
		panel_7.setBackground(UIManager.getColor("Label.background"));
		panel.add(panel_7, "1, 3, center, top");
		
		JButton btnNewButton = new JButton("Stock Entry");
		panel_7.add(btnNewButton);
		btnNewButton.setBackground(UIManager.getColor("Button.highlight"));
		
		JButton btnNewButton_1 = new JButton("Sell");
		panel_7.add(btnNewButton_1);
		btnNewButton_1.setBackground(UIManager.getColor("Button.highlight"));
		
		JButton btnNewButton_2 = new JButton("Return");
		panel_7.add(btnNewButton_2);
		btnNewButton_2.setBackground(UIManager.getColor("Button.highlight"));
		
		btnReports = new JButton("Reports");
		btnReports.setBackground(UIManager.getColor("Button.highlight"));
		panel_7.add(btnReports);
		btnReports.addActionListener(buttonlistenerobject);
		btnNewButton_2.addActionListener(buttonlistenerobject);
		btnNewButton_1.addActionListener(buttonlistenerobject);
		btnNewButton.addActionListener(buttonlistenerobject);
		cardlayout = new CardLayout();
		panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(cardlayout);
		
		panel_2 = new stockpanel2();
		panel_2.setBackground(UIManager.getColor("Label.background"));
		//panel_2.setBackground(SystemColor.control);
		panel_2.setSize(new Dimension(0, 0));
		panel_1.add("panel_2", panel_2);
		
		panel_3 = new SellPanel5();
		panel_1.add("panel_3", panel_3);
		
		panel_4 = new JPanel();
		panel_4.setSize(new Dimension(0, 0));
		panel_1.add("panel_4", panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		
		panel_5 = new ReturnPanel1();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setMinimumSize(new Dimension(900, 928));
		scrollpane = new JScrollPane(panel_5);
		scrollpane.setBackground(Color.DARK_GRAY);
		scrollpane.setForeground(Color.LIGHT_GRAY);
		//getContentPane().add(scrollpane, BorderLayout.EAST);

		panel_4.add(scrollpane);
		
		panel_6 = new ReportPanel();
		panel_1.add("panel_6", panel_6);
		
		menuBar = new JMenuBar();
		menuBar.setBackground(UIManager.getColor("Menu.background"));
		setJMenuBar(menuBar);
		
		mnOptions = new JMenu("Options");
		menuBar.add(mnOptions);
		
		mntmAddType = new JMenuItem("Add Type");
		mnOptions.add(mntmAddType);
		mntmAddType.addActionListener(new menubaractionlistener());
		
		mntmMrpChange = new JMenuItem("Change MRP");
		mnOptions.add(mntmMrpChange);
		mntmMrpChange.addActionListener(new menubaractionlistener());
		
		internalFrame = new JInternalFrame("Add Type.");
		//this.add(internalFrame);
		//mnOptions.add(internalFrame);
		internalFrame.setVisible(false);
		
		
				
	}
private class menubaractionlistener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			if(event.getActionCommand() == "Stock Entry"){
					cardlayout.show(panel_1,"panel_2");
			}
			else if(event.getActionCommand() == "Sell"){
					cardlayout.show(panel_1, "panel_3");
			}
			else if(event.getActionCommand() == "Return"){
					cardlayout.show(panel_1, "panel_4");
			}
			else if(event.getActionCommand() == "Reports"){
				panel_6 = new ReportPanel();
				panel_1.add("panel_6", panel_6);
				cardlayout.show(panel_1, "panel_6");
			}
			else if(event.getActionCommand() == "Add Type"){
				panel_8.setVisible(true);
				panel_12.setVisible(false);
			}
			else if(event.getActionCommand() == "Change MRP"){
				panel_12.setVisible(true);
				panel_8.setVisible(false);
			}
		}
	
	}
private class optionActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getActionCommand() == "Add Type"){
			if(textField.getText().length()!=0)
			Insertclass.con("TypeTable", "( '" + textField.getText() + "')");
			textField.setText("");
			panel_8.setVisible(false);
			panel_2 = new stockpanel2();
			panel_1.add("panel_2", panel_2);
			cardlayout.show(panel_1,"panel_2");
			
		}
		else if(event.getActionCommand() == "Cancel"){
			textField.setText("");
			textField_1.setText("");
			textField_2.setText("");
			textField_3.setText("");
			textField_4.setText("");
			textField_5.setEditable(false);
			panel_8.setVisible(false);
			panel_12.setVisible(false);
			
		}
		else if(event.getActionCommand() == "Get Data"){
			if(TagNofieldcheck.check(textField_1.getText())){
				textField_2.setText(textField_1.getText());
				textField_3.setText(RetriveData.getMRP(textField_1.getText()));
				textField_4.setText(RetriveData.getQuantity(textField_1.getText()));
				textField_1.setText("");
				textField_5.setEditable(true);
			}
		}
		else if(event.getActionCommand() == "Update"){
			if(TagNofieldcheck.check(textField_5.getText())){
				new Updateclass().con("Table_1", "[MRP] = " + textField_5.getText(), "[Tag No] = " + textField_2.getText());
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_5.setEditable(false);
				panel_8.setVisible(false);
				panel_12.setVisible(false);
			}
		}
	}
	
}
}

