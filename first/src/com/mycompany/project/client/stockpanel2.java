package com.mycompany.project.client;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

public class stockpanel2 extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_5;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JLabel lblQuantity;
	private JTextField textField_4;
	private JLabel lblAddTagNo;
	private JTextField textField_6;
	private JLabel lblMrp_1;
	private JTextField textField_7;
	private JLabel lblBuyingPrice_1;
	private JTextField textField_8;
	private JLabel lblQuantity_1;
	private JTextField textField_9;
	private JLabel lblType_1;
	private JTextField textField_10;
	private JLabel lblSellersName_1;
	private JTextField textField_11;
	private JLabel lblBillNo_1;
	private JTextField textField_12;
	private JLabel lblBillDate_1;
	private JTextField textField_13;

	/**
	 * Create the panel.
	 */
	public stockpanel2() {
		setForeground(Color.BLUE);
		setBackground(UIManager.getColor("Label.background"));
		this.setSize(getMaximumSize());
		setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("center:max(48dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("center:max(90dlu;pref)"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(17dlu;default)"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(17dlu;default)"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(17dlu;default)"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(17dlu;default)"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(17dlu;default)"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(17dlu;default)"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(17dlu;pref)"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblBillDate = new JLabel("Bill Date");
		add(lblBillDate, "4, 4");
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Label.background"));
		add(panel, "8, 4, center, center");
		
		comboBox = new JComboBox();
		comboBox.setBackground(UIManager.getColor("Label.background"));
		for(int i = 1; i < 32; i++){
			comboBox.addItem(i);
		}
		panel.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBackground(UIManager.getColor("Label.background"));
		for(int i = 1; i < 13; i++){
			comboBox_1.addItem(i);
		}
		panel.add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBackground(UIManager.getColor("Label.background"));
		for(int i = 2011; i < 2020; i++){
			comboBox_2.addItem(i);
		}
		panel.add(comboBox_2);
		
		JLabel lblBillNo = new JLabel("Bill No");
		add(lblBillNo, "4, 6");
		
		textField = new JTextField();
		add(textField, "8, 6, fill, default");
		textField.setColumns(10);
		
		JLabel lblSellersName = new JLabel("Seller's Name");
		add(lblSellersName, "4, 8");
		
		textField_1 = new JTextField();
		add(textField_1, "8, 8, fill, default");
		textField_1.setColumns(10);
		
		JLabel lblBuyingPrice = new JLabel("Buying Price");
		add(lblBuyingPrice, "4, 10");
		
		textField_2 = new JTextField();
		add(textField_2, "8, 10, fill, default");
		textField_2.setColumns(10);
		
		JLabel lblMrp = new JLabel("MRP");
		add(lblMrp, "4, 12");
		
		textField_3 = new JTextField();
		add(textField_3, "8, 12, fill, default");
		textField_3.setColumns(10);
		
		JLabel lblType = new JLabel("Type");
		add(lblType, "4, 14");
		
		textField_5 = new JTextField();
		textField_5.setBackground(UIManager.getColor("Label.background"));
		textField_5.setVisible(false);
		
		//String[] type = {};
		comboBox_3 = new JComboBox();
		comboBox_3.setBackground(UIManager.getColor("Label.background"));
		
		String connectionUrl = "jdbc:sqlserver://localhost;"
				+ "user=Yunus;" + "password=abcd1234;"
				+ "databaseName=NRI;";
	
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(connectionUrl);
			try {
				String SQL = null;
				
					stmt = con.createStatement();
					SQL = "SELECT  Type From TypeTable";
					//System.out.print(SQL);
					rs = stmt.executeQuery(SQL);
				//	int lenght = 0;
					while(rs.next()){
						comboBox_3.addItem(rs.getString("Type"));
						//type[lenght] = rs.getString("Type");
						//lenght++;
					}
					rs.close();
					stmt.close();
					con.close();
			} catch (Exception ee) {
				ee.printStackTrace();
			}
		}catch (Exception ee) {
			ee.printStackTrace();
		}
		
	
		
		add(comboBox_3, "8, 14, fill, default");
		
		lblQuantity = new JLabel("Quantity");
		add(lblQuantity, "4, 16");
		
		textField_4 = new JTextField();
		textField_4.setAlignmentX(Component.LEFT_ALIGNMENT);
		textField_4.setHorizontalAlignment(SwingConstants.LEFT);
		add(textField_4, "8, 16, fill, default");
		textField_4.setColumns(10);
		textField_4.setText("1");
		
		textField_5.setEditable(false);
		add(textField_5, "10, 18, fill, default");
		textField_5.setColumns(10);
		
		JButton button = new JButton("Submit");
		button.setBackground(UIManager.getColor("Button.highlight"));
		add(button, "10, 20, center, default");
		
		lblAddTagNo = new JLabel("Added Tag No");
		add(lblAddTagNo, "4, 24");
		
		textField_6 = new JTextField();
		textField_6.setForeground(Color.BLACK);
		textField_6.setBackground(Color.WHITE);
		textField_6.setEditable(false);
		add(textField_6, "8, 24, fill, default");
		textField_6.setColumns(10);
		
		lblMrp_1 = new JLabel("MRP");
		add(lblMrp_1, "4, 26");
		
		textField_7 = new JTextField();
		textField_7.setForeground(Color.BLACK);
		textField_7.setBackground(Color.WHITE);
		textField_7.setEditable(false);
		add(textField_7, "8, 26, fill, default");
		textField_7.setColumns(10);
		
		lblBuyingPrice_1 = new JLabel("Buying Price");
		add(lblBuyingPrice_1, "4, 28");
		
		textField_8 = new JTextField();
		textField_8.setForeground(Color.BLACK);
		textField_8.setBackground(Color.WHITE);
		textField_8.setEditable(false);
		add(textField_8, "8, 28, fill, default");
		textField_8.setColumns(10);
		
		lblQuantity_1 = new JLabel("Quantity");
		add(lblQuantity_1, "4, 30");
		
		textField_9 = new JTextField();
		textField_9.setForeground(Color.BLACK);
		textField_9.setBackground(Color.WHITE);
		textField_9.setEditable(false);
		add(textField_9, "8, 30, fill, default");
		textField_9.setColumns(10);
		
		lblType_1 = new JLabel("Type");
		add(lblType_1, "4, 32");
		
		textField_10 = new JTextField();
		textField_10.setForeground(Color.BLACK);
		textField_10.setBackground(Color.WHITE);
		textField_10.setEditable(false);
		add(textField_10, "8, 32, fill, default");
		textField_10.setColumns(10);
		
		lblSellersName_1 = new JLabel("Sellers Name");
		add(lblSellersName_1, "4, 34");
		
		textField_11 = new JTextField();
		textField_11.setForeground(Color.BLACK);
		textField_11.setBackground(Color.WHITE);
		textField_11.setEditable(false);
		add(textField_11, "8, 34, fill, default");
		textField_11.setColumns(10);
		
		lblBillNo_1 = new JLabel("Bill No");
		add(lblBillNo_1, "4, 36");
		
		textField_12 = new JTextField();
		textField_12.setBackground(Color.WHITE);
		textField_12.setForeground(Color.BLACK);
		textField_12.setEditable(false);
		add(textField_12, "8, 36, fill, default");
		textField_12.setColumns(10);
		
		lblBillDate_1 = new JLabel("Bill Date");
		add(lblBillDate_1, "4, 38");
		
		textField_13 = new JTextField();
		textField_13.setForeground(Color.BLACK);
		textField_13.setBackground(Color.WHITE);
		textField_13.setEditable(false);
		add(textField_13, "8, 38, fill, default");
		textField_13.setColumns(10);
		button.addActionListener(new Buttonactionperformed());
	}
	
	private class Buttonactionperformed implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="Submit"){
			String billdate =comboBox_1.getSelectedItem() +"/"+comboBox.getSelectedItem()+"/"+comboBox_2.getSelectedItem();
			String billno = textField.getText();
			String sellersname = textField_1.getText();
			String buyingprice = textField_2.getText();
			String mrp = textField_3.getText();
			String quantity = textField_4.getText();
			String type = (String) comboBox_3.getSelectedItem();
			boolean temp = true;
			
			
				temp = Moneyfieldcheck.check(buyingprice);
				temp = Moneyfieldcheck.check(mrp);
			
			
			if(temp){
		    	 String connectionUrl = "jdbc:sqlserver://localhost;" +"user=Yunus;"+"password=abcd1234;"+
		    	         "databaseName=NRI;";
		    	      Connection con = null;
		    	      try {
		    	    	 con = DriverManager.getConnection(connectionUrl);
		    	    	 try {
		    	    		 int k = 0;
		    	    		 if(Integer.parseInt(quantity)>1)
		    	    			 k= 1;
		 
		    	    		String SQL = "INSERT INTO Table_1 VALUES ("+"'"+billno+"','"+billdate+"', '"+sellersname+"',"+buyingprice+", "+mrp+","+0.0+","+0+","+k+",'"+type+"')";
		    	    		Statement stmt = con.createStatement();
		    	    	    stmt.executeUpdate(SQL);
		    	    	    
		    	    	    String SQL1 = "SELECT IDENT_CURRENT('TABLE_1');";
		    	    	    String s = null;
		    	    	    ResultSet rs = stmt.executeQuery(SQL1);
							
		    	    	    	
							while (rs.next()) {
		    	    	    	  s = rs.getString(""); 
								}
							if(k==1){
							String SQL2 = "INSERT INTO Table_2 VALUES ("+Integer.parseInt(s)+","+Integer.parseInt(quantity)+","+ 0 +")";
							stmt.executeUpdate(SQL2);
							}
							
							rs = new selectclass().con("[Bill No], [Bill Date], [Seller's Name], [Buying Price], MRP, [Table 2], Type", "Table_1", "[Tag No] = " + s);
							while (rs.next()) {
		    	    	    	  textField_6.setText(s);
		    	    	    	  textField_7.setText(rs.getString("MRP"));
		    	    	    	  textField_8.setText(rs.getString("Buying Price"));
		    	    	    	  if(!rs.getBoolean("Table 2"))
		    	    	    	  textField_9.setText("1");
		    	    	    	  else
		    	    	    	  {
		    	    	    		  ResultSet rs1 = new selectclass().con("Quantity", "Table_2", "[Tag No] = " + s);
		    	    	    		  while(rs1.next()){
		    	    	    			  textField_9.setText(rs1.getString("Quantity")); 
		    	    	    		  }
		    	    	    	  }
		    	    	    	  textField_10.setText(rs.getString("Type"));
		    	    	    	  textField_11.setText(rs.getString("Seller's Name"));
		    	    	    	  textField_12.setText(rs.getString("Bill No"));
		    	    	    	  textField_13.setText(rs.getString("Bill Date"));
								}  
						
							
							textField.setText("");
		    	  			textField_1.setText("");
		    	  			textField_2.setText("");
		    	  			textField_3.setText("");
		    	  			textField_4.setText("1");
		    	  			comboBox.setSelectedIndex(3);
		    				comboBox_1.setSelectedIndex(6);
		    				comboBox_2.setSelectedIndex(1);
		    	    	    stmt.close();
		    	    	   }
		    	    	   catch (Exception ee) {
		    	    	      ee.printStackTrace();
		    	    	   }
		    	      }
		    	      catch (Exception ee)
		    	        {
		    	            ee.printStackTrace();
		    	        }
				}
			}
		}	
	}
}