package com.mycompany.project.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

public class ReportPanel extends JPanel {
	/**
	 * @wbp.nonvisual location=53,-19
	 */
	private  JPanel panel_1 = new JPanel();
	private  JPanel panel_5 = new JPanel();
	private JTable table;
	private JScrollPane scrollPane;
	private JPanel panel_6;
	private JButton btnNewButton;
	private JPanel panel_4;
	private JLabel lblDate;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_7;
	private JScrollPane scrollPane_1;
	private JTable table_1;
	private JPanel panel_8;
	private JLabel lblTotal;
	private JTextField textField;
	private JPanel panel_9;
	private JLabel lblReturnedAmount;
	private JLabel lblFinalAmount;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblReturnedInvoices;
	private JLabel lblInvoices;
	private JPanel panel_10;
	private JPanel panel_11;
	private JComboBox comboBox_3;
	private JButton btnGetStock;
	private JScrollPane scrollPane_2;
	private JTable table_2;
	private JPanel panel_12;
	private JLabel lblNewLabel;
	private JComboBox comboBox_4;
	private JButton btnNewButton_1;
	private JLabel lblInvoices_1;
	private JPanel panel_13;
	private JPanel panel_14;
	private JLabel lblNewLabel_1;
	private JPanel panel_15;
	private JScrollPane scrollPane_4;
	private JTable table_4;
	private JPanel panel_16;
	private JLabel lblNewLabel_2;
	private JTextField textField_3;
	private JLabel lblSubTotal;
	private JTextField textField_4;
	private JLabel lblNewLabel_3;
	private JTextField textField_5;
	private JPanel panel_17;
	private JScrollPane scrollPane_3;
	private JTable table_3;
	private JButton btnNewButton_2;
	private JComboBox comboBox_5;

	/**
	 * Create the panel.
	 */
	public ReportPanel() {
		setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("450px:grow"),},
			new RowSpec[] {
				RowSpec.decode("300px:grow"),}));
		
		panel = new JPanel();
		add(panel, "1, 1, fill, fill");
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("450px:grow"),},
			new RowSpec[] {
				RowSpec.decode("300px:grow"),}));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Daily Report", panel_1);
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("445px:grow"),},
			new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC,
				RowSpec.decode("50dlu:grow"),
				FormFactory.PREF_ROWSPEC,
				RowSpec.decode("50dlu:grow"),
				FormFactory.DEFAULT_ROWSPEC,}));
		
		panel_4 = new JPanel();
		panel_1.add(panel_5, "1, 1, fill, top");
		panel_5.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.MIN_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				RowSpec.decode("30px"),
				FormFactory.DEFAULT_ROWSPEC,}));
		
		lblDate = new JLabel("Date");
		panel_5.add(lblDate, "3, 1, left, center");
		panel_5.add(panel_4, "5, 1, left, top");
		
		comboBox = new JComboBox();
		for(int i = 1; i < 32; i++){
			comboBox.addItem(i);
		}
		panel_4.add(comboBox);
		
		comboBox_1 = new JComboBox();
		for(int i = 1; i < 13; i++){
			comboBox_1.addItem(i);
		}
		panel_4.add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		for(int i = 2012; i < 2020; i++){
			comboBox_2.addItem(i);
		}
		panel_4.add(comboBox_2);
		
		btnNewButton = new JButton("Get Daily Report");
		btnNewButton.addActionListener(new actionlistener());
		panel_5.add(btnNewButton, "7, 1");
		
		lblInvoices = new JLabel(" Invoices");
		panel_5.add(lblInvoices, "1, 2");
		
		panel_6 = new JPanel();
		panel_1.add(panel_6, "1, 2, fill, fill");
		panel_6.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		
		table = new JTable();
		scrollPane.setViewportView(table);
		//panel_7.add(table);
		panel_6.add(scrollPane);
		
		panel_8 = new JPanel();
		panel_1.add(panel_8, "1, 3, fill, fill");
		panel_8.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		lblTotal = new JLabel("Total");
		panel_8.add(lblTotal, "4, 1, right, default");
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField.setEditable(false);
		panel_8.add(textField, "6, 1, fill, default");
		textField.setColumns(10);
		
		lblReturnedInvoices = new JLabel("Returned Invoices");
		panel_8.add(lblReturnedInvoices, "2, 2");
		
		panel_7 = new JPanel();
		panel_1.add(panel_7, "1, 4, fill, fill");
		panel_7.setLayout(new BorderLayout(0, 0));
		
		scrollPane_1 = new JScrollPane();
		
		table_1 = new JTable();
		//panel_7.add(table_1, BorderLayout.NORTH);
		scrollPane_1.setViewportView(table_1);
		panel_7.add(scrollPane_1);
		
		panel_9 = new JPanel();
		panel_1.add(panel_9, "1, 5, fill, fill");
		panel_9.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		lblReturnedAmount = new JLabel("Returned Amount");
		panel_9.add(lblReturnedAmount, "4, 2, right, default");
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_1.setEditable(false);
		panel_9.add(textField_1, "6, 2, fill, default");
		textField_1.setColumns(10);
		
		lblFinalAmount = new JLabel("Final Amount");
		panel_9.add(lblFinalAmount, "4, 4, right, default");
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.RED);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_2.setEditable(false);
		panel_9.add(textField_2, "6, 4, fill, default");
		textField_2.setColumns(10);
		
		panel.add(tabbedPane, "1, 1, fill, fill");
		
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Montly Report", null, panel_2, null);
		panel_2.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				RowSpec.decode("max(16dlu;default):grow"),
				FormFactory.DEFAULT_ROWSPEC,}));
		
		panel_12 = new JPanel();
		panel_2.add(panel_12, "1, 1, fill, fill");
		panel_12.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("46px"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("center:default"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		lblNewLabel = new JLabel("Date");
		panel_12.add(lblNewLabel, "2, 1, right, center");
		
		comboBox_4 = new JComboBox();
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
		for(int i=0; i < 12; i++){
			comboBox_4.addItem(months[i]);
		}
		panel_12.add(comboBox_4, "4, 1, fill, default");
		
		btnNewButton_1 = new JButton("Get Invoices");
		btnNewButton_1.addActionListener(new actionlistener());
		
		comboBox_5 = new JComboBox();
		for(int i= 2012; i < 2020; i++)
			comboBox_5.addItem(i);
		panel_12.add(comboBox_5, "6, 1, fill, default");
		panel_12.add(btnNewButton_1, "8, 1");
		
		lblInvoices_1 = new JLabel("Invoices");
		panel_12.add(lblInvoices_1, "1, 2");
		
		panel_17 = new JPanel();
		panel_2.add(panel_17, "1, 2, fill, fill");
		panel_17.setLayout(new BorderLayout(0, 0));
		
		scrollPane_3 = new JScrollPane();
		
		
		table_3 = new JTable();
		scrollPane_3.setViewportView(table_3);
		panel_17.add(scrollPane_3);
		
		panel_13 = new JPanel();
		panel_2.add(panel_13, "1, 3, fill, fill");
		panel_13.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC,}));
		
		lblNewLabel_3 = new JLabel("Sub Total");
		panel_13.add(lblNewLabel_3, "3, 1, right, default");
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		panel_13.add(textField_5, "5, 1, fill, default");
		textField_5.setColumns(10);
		
		panel_14 = new JPanel();
		panel_2.add(panel_14, "1, 4, fill, fill");
		panel_14.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC,}));
		
		lblNewLabel_1 = new JLabel("Returned Invoices");
		panel_14.add(lblNewLabel_1, "1, 1, center, center");
		
		panel_15 = new JPanel();
		panel_2.add(panel_15, "1, 5, fill, fill");
		panel_15.setLayout(new BorderLayout(0, 0));
		
		scrollPane_4 = new JScrollPane();
		//panel_15.add(scrollPane_4);
		
		table_4 = new JTable();
		scrollPane_4.setViewportView(table_4);
		panel_15.add(scrollPane_4);
		
		panel_16 = new JPanel();
		panel_2.add(panel_16, "1, 6, fill, fill");
		panel_16.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("199px:grow"),
				FormFactory.MIN_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		lblNewLabel_2 = new JLabel("Returned Amount");
		panel_16.add(lblNewLabel_2, "2, 1, center, top");
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		panel_16.add(textField_3, "4, 1, fill, default");
		textField_3.setColumns(10);
		
		lblSubTotal = new JLabel("Total");
		panel_16.add(lblSubTotal, "2, 3, right, default");
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		panel_16.add(textField_4, "4, 3, fill, default");
		textField_4.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Complete Stock", null, panel_3, null);
		panel_3.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		panel_11 = new JPanel();
		panel_3.add(panel_11, "1, 1, fill, fill");
		
		comboBox_3 = new JComboBox();
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
		comboBox_3.addItem("Complete Stock");
		panel_11.add(comboBox_3);
		
		btnGetStock = new JButton("Get Stock");
		btnGetStock.addActionListener(new actionlistener());
		panel_11.add(btnGetStock);
		
		panel_10 = new JPanel();
		panel_3.add(panel_10, "1, 2, fill, fill");
		panel_10.setLayout(new BorderLayout(0, 0));
		
		scrollPane_2 = new JScrollPane();
		panel_10.add(scrollPane_2);
		
		table_2 = new JTable();
		scrollPane_2.add(table_2);
		
		btnNewButton_2 = new JButton("Print");
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.addActionListener(new actionlistener());
		panel_3.add(btnNewButton_2, "1, 4, right, default");

	}
	public class actionlistener implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			if (event.getActionCommand() == "Get Daily Report") {
		    
				  Vector<String> columnNames = new Vector<String>();
				  Vector data = new Vector();
				  Double subtotal = 0.0;
		        try
		        {
		        	String selecteddate = comboBox_1.getSelectedItem() + "/" + comboBox.getSelectedItem() + "/" + comboBox_2.getSelectedItem();
		        	ResultSet rs = new selectclass().con("[Invoice No]", "Table_3", "[Date] = '"+ selecteddate +"'" );
		           
		                columnNames.addElement( "Invoice No" );
		                columnNames.addElement( "Total" );
		              
		            while(rs.next()){
		          
		            ResultSetMetaData md = rs.getMetaData();
		            int columns = md.getColumnCount();
		            Vector row = new Vector(columns);
		            
		            String invoiceTotal = RetriveData.invoiceTotal(rs.getString("Invoice No"));
		            subtotal = subtotal + Double.parseDouble(invoiceTotal);
		           
		            row.addElement( rs.getString("Invoice No") );
		            row.addElement(invoiceTotal);
		            
		            if(!RetriveData.invoiceTotal(rs.getString("Invoice No")).equals("0.0"))
		            data.addElement( row );
		           
	              }
		            rs.close();
		        }
		        catch(Exception e)
		        {
		            System.out.println( e );
		        }

		        //  Create table with database data
		        table = new JTable(data, columnNames)
		        {
		            public Class getColumnClass(int column)
		            {
		                for (int row = 0; row < getRowCount(); row++)
		                {
		                    Object o = getValueAt(row, column);

		                    if (o != null)
		                    {
		                        return o.getClass();
		                    }
		                }
		                return Object.class;
		            }
		        };
		        table.setVisible(true);
		    	table.revalidate();
			    scrollPane.repaint();
			    scrollPane.setViewportView(table);
			    textField.setText(subtotal.toString());
			    
			    columnNames = new Vector<String>();
				data = new Vector();
				Double returnedTotal = 0.0;
		        try
		        {
		        	String selecteddate = comboBox_1.getSelectedItem() + "/" + comboBox.getSelectedItem() + "/" + comboBox_2.getSelectedItem();
		        	ResultSet rs = new selectclass().con("Distinct [Invoice No]", "Returntable", "[Return Date] = '"+ selecteddate +"'" );
		            columnNames.addElement( "Invoice No" );
		            columnNames.addElement( "Total" );
		            
		            while(rs.next()){
		           
		            //ResultSetMetaData md = rs.getMetaData();
		            int columns = 2;
		            Vector row = new Vector(columns);

		            
		            String returnedinvoiceTotal = RetriveData.returnedinvoiceTotal(rs.getString("Invoice No"), selecteddate, "="); 
		            returnedTotal = returnedTotal + Double.parseDouble(returnedinvoiceTotal);
		            
		            row.addElement( rs.getString("Invoice No") );
		            row.addElement(returnedinvoiceTotal);
		                
		            if(!RetriveData.returnedinvoiceTotal(rs.getString("Invoice No"), selecteddate, "=").equals("0.0"))
		                data.addElement(row);
		            }
		            rs.close();
		        }
		        catch(Exception e)
		        {
		            System.out.println( e );
		        }

		        //  Create table with database data
		        table_1 = new JTable(data, columnNames)
		        {
		            public Class getColumnClass(int column)
		            {
		                for (int row = 0; row < getRowCount(); row++)
		                {
		                    Object o = getValueAt(row, column);

		                    if (o != null)
		                    {
		                        return o.getClass();
		                    }
		                }
		                return Object.class;
		            }
		        };
		        table_1.setVisible(true);
		    	table_1.revalidate();
			    scrollPane_1.repaint();
			    scrollPane_1.setViewportView(table_1);
			    textField_1.setText(returnedTotal.toString());
			    Double total = subtotal - returnedTotal;
			    textField_2.setText(total.toString());
			    panel_8.setVisible(true);
			    panel_9.setVisible(true);
			    lblInvoices.setVisible(true);
			}
			else if(event.getActionCommand() == "Get Invoices"){
				 Vector<String> columnNames = new Vector<String>();
				  Vector data = new Vector();
				  Double subtotal = 0.0;
		        try
		        {
		        	String selecteddate = comboBox_4.getSelectedItem() + "%" + comboBox_5.getSelectedItem() + "%";
		        	System.out.print(selecteddate);
		        	ResultSet rs = new selectclass().con("[Invoice No]", "Table_3", "[Date] LIKE '"+ selecteddate +"' ORDER BY [Invoice No]" );
		           
		                columnNames.addElement( "Invoice No" );
		                columnNames.addElement( "Total" );
		              
		            while(rs.next()){
		          
		            ResultSetMetaData md = rs.getMetaData();
		            int columns = 2;
		            Vector row = new Vector(columns);
		            
		            String invoiceTotal = RetriveData.invoiceTotal(rs.getString("Invoice No"));
		            subtotal = subtotal + Double.parseDouble(invoiceTotal);
		           
		            row.addElement( rs.getString("Invoice No") );
		            row.addElement(invoiceTotal);
		            
		            if(!RetriveData.invoiceTotal(rs.getString("Invoice No")).equals("0.0"))
		            data.addElement( row );
		           
	              }
		            rs.close();
		        }
		        catch(Exception e)
		        {
		            System.out.println( e );
		        }

		        //  Create table with database data
		        table_3 = new JTable(data, columnNames)
		        {
		            public Class getColumnClass(int column)
		            {
		                for (int row = 0; row < getRowCount(); row++)
		                {
		                    Object o = getValueAt(row, column);

		                    if (o != null)
		                    {
		                        return o.getClass();
		                    }
		                }
		                return Object.class;
		            }
		        };
		        table_3.setVisible(true);
		    	table_3.revalidate();
			    scrollPane_3.repaint();
			    scrollPane_3.setViewportView(table_3);
			    textField_5.setText(subtotal.toString());
			    
			    columnNames = new Vector<String>();
				data = new Vector();
				Double returnedTotal = 0.0;
		        try
		        {
		        	String selecteddate = comboBox_4.getSelectedItem() + "%";
		        	ResultSet rs = new selectclass().con("Distinct [Invoice No]", "Returntable", "[Return Date] LIKE '"+ selecteddate +"'" );
		            columnNames.addElement( "Invoice No" );
		            columnNames.addElement( "Total" );
		            
		            while(rs.next()){
		           
		            ResultSetMetaData md = rs.getMetaData();
		            int columns = 2;
		            Vector row = new Vector(columns);

		            
		            String returnedinvoiceTotal = RetriveData.returnedinvoiceTotal(rs.getString("Invoice No"), selecteddate, "LIKE"); 
		            returnedTotal = returnedTotal + Double.parseDouble(returnedinvoiceTotal);
		            
		            row.addElement( rs.getString("Invoice No") );
		            row.addElement(returnedinvoiceTotal);
		                
		            if(!RetriveData.returnedinvoiceTotal(rs.getString("Invoice No"), selecteddate, "LIKE").equals("0.0"))
		                data.addElement(row);
		            }
		            rs.close();
		        }
		        catch(Exception e)
		        {
		            System.out.println( e );
		        }

		        //  Create table with database data
		        table_4 = new JTable(data, columnNames)
		        {
		            public Class getColumnClass(int column)
		            {
		                for (int row = 0; row < getRowCount(); row++)
		                {
		                    Object o = getValueAt(row, column);

		                    if (o != null)
		                    {
		                        return o.getClass();
		                    }
		                }
		                return Object.class;
		            }
		        };
		        table_4.setVisible(true);
		    	table_4.revalidate();
			    scrollPane_4.repaint();
			    scrollPane_4.setViewportView(table_4);
			    textField_3.setText(returnedTotal.toString());
			    Double total = subtotal - returnedTotal;
			    textField_4.setText(total.toString());
			    panel_8.setVisible(true);
			    panel_9.setVisible(true);
			    lblInvoices.setVisible(true);
			}
			else if(event.getActionCommand() == "Get Stock"){
				Vector columnNames = new Vector<String>();
				Vector data = new Vector();
				Double returnedTotal = 0.0;
		        try
		        {
		        	ResultSet rs;
		        	String selectedtype =  (String) comboBox_3.getSelectedItem();
		        	if(selectedtype.equals("Complete Stock"))
		        	rs = new selectclass().con("[Tag no], MRP, [Buying Price], Type", "Table_1", "Sold = 'false'" );
			        else
		        	rs = new selectclass().con("[Tag no], MRP, [Buying Price]", "Table_1", "Sold = 'false' AND Type LIKE '" + selectedtype + "'" );
		            columnNames.addElement( "Tag No" );
		            columnNames.addElement( "Buying Price" );
		            columnNames.addElement( "MRP" );
		            columnNames.addElement( "Quantity" );
		            if(selectedtype == "Complete Stock"){
		            	columnNames.addElement( "Type" );
			            
		            }
		            
		            while(rs.next()){
		            	
		            
		            
		            //ResultSetMetaData md = rs.getMetaData();
		            int columns = 4;
		            Vector row = new Vector(columns);

		            
		           
		            row.addElement(rs.getString("Tag No"));
		            row.addElement(rs.getString("Buying Price"));
		            row.addElement(rs.getString("MRP"));
		            row.addElement(RetriveData.getQuantity(rs.getString("Tag No")));
		            if(selectedtype == "Complete Stock"){
		            	 row.addElement(rs.getString("Type"));
				           
			            
		            }
		            
		            data.addElement(row);
		            }
		            rs.close();
		        }
		        catch(Exception e)
		        {
		            System.out.println( e );
		        }

		        //  Create table with database data
		        table_2 = new JTable(data, columnNames)
		        {
		            public Class getColumnClass(int column)
		            {
		                for (int row = 0; row < getRowCount(); row++)
		                {
		                    Object o = getValueAt(row, column);

		                    if (o != null)
		                    {
		                        return o.getClass();
		                    }
		                }
		                return Object.class;
		            }
		        };
		        scrollPane_2.repaint();
			    scrollPane_2.setViewportView(table_2);
			    btnNewButton_2.setEnabled(true);
			   
			}
			else if(event.getActionCommand()=="Print"){
				 MessageFormat header = new MessageFormat(comboBox_4.getSelectedItem()+" Page {0,number,integer}");
			        try {
			            table_2.print(JTable.PrintMode.FIT_WIDTH, header, null);
			        } catch (java.awt.print.PrinterException e) {
			            System.err.format("Cannot print %s%n", e.getMessage());
			        }
			}
		}
		
	}
}
