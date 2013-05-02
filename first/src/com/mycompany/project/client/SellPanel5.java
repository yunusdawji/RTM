package com.mycompany.project.client;


import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;


import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.SwingConstants;

import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.exception.DRException;

import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTable;



@SuppressWarnings("serial")
public class SellPanel5 extends JPanel {
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblTagNo;
	private JLabel lblMrp;
	private JLabel lblDiscount;
	private JLabel lblFinalPrice;
	private JButton btnConfirmSale;
	private JLabel lblEnterTagNo;
	private JTextField textField;
	private JButton btnGetData;
	private JTextField textField_4;
	private JPanel panel;
	private JLabel lblQuantity;
	private JTextField textField_5;
	private JLabel lblEnterQuantity;
	private JTextField textField_6;
	private JButton btnNewButton;
	private static ArrayList<cart> list = new ArrayList<cart>();
	private static ArrayList<String> list1 = new ArrayList<String>();
	private JPanel panel_1;
	private JPanel panel_3;
	private JTextField textField_7;
	private JLabel lblSubTotal;
	private JLabel lblDiscount_1;
	private JLabel lblTaxes;
	private JLabel lblFinalAmount;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JButton btnCancelSale;
	private JButton btnClearData;
	private JPanel panel_4;
	private JLabel lblNewLabel;
	private static JTextField textField_11;
	private JLabel lblAddress;
	private static JTextField textField_12;
	private JScrollPane scrollPane;
	private JTable table;
	
	/**
	 * Create the panel.
	 */
	public SellPanel5() {
		setBackground(UIManager.getColor("Label.background"));
		setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("center:max(150dlu;min):grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.MIN_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.DEFAULT_ROWSPEC,}));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(UIManager.getColor("Label.background"));
		panel_2.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_2.setAlignmentX(Component.LEFT_ALIGNMENT);
		add(panel_2, "1, 1, fill, fill");
		panel_2.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.GROWING_BUTTON_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("left:default"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("center:50dlu"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("center:default"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("center:default"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("right:max(50dlu;pref):grow"), },
				new RowSpec[] { RowSpec.decode("max(7dlu;default)"),
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.PREF_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.PREF_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.PREF_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.PREF_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.PREF_ROWSPEC, }));

		btnGetData = new JButton("Get Data");
		btnGetData.setBackground(UIManager.getColor("Button.light"));
		btnGetData.addActionListener(new actionlistener());

		lblEnterTagNo = new JLabel("Enter Tag No");
		panel_2.add(lblEnterTagNo, "6, 3");

		textField = new JTextField();
		panel_2.add(textField, "8, 3, center, center");
		textField.setColumns(10);
		panel_2.add(btnGetData, "10, 3");

		lblTagNo = new JLabel("Tag No");
		panel_2.add(lblTagNo, "4, 5, center, default");

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		panel_2.add(textField_1, "6, 5, center, center");
		textField_1.setColumns(10);

		lblQuantity = new JLabel("Quantity");
		lblQuantity.setHorizontalTextPosition(SwingConstants.CENTER);
		lblQuantity.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblQuantity, "8, 5, center, default");

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		panel_2.add(textField_5, "10, 5, center, default");
		textField_5.setColumns(10);

		lblMrp = new JLabel("MRP");
		panel_2.add(lblMrp, "4, 7, center, default");

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		panel_2.add(textField_2, "6, 7, center, center");
		textField_2.setColumns(10);

		lblDiscount = new JLabel("Discount");
		panel_2.add(lblDiscount, "8, 7, center, default");

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		panel_2.add(textField_3, "10, 7, center, center");
		textField_3.setColumns(10);

		lblEnterQuantity = new JLabel("Enter Quantity");
		panel_2.add(lblEnterQuantity, "4, 9, right, default");

		textField_6 = new JTextField();
		textField_6.setEditable(false);
		panel_2.add(textField_6, "6, 9, center, default");
		textField_6.setColumns(10);
		
				lblFinalPrice = new JLabel("Descreption");
				panel_2.add(lblFinalPrice, "8, 9, center, default");

		btnNewButton = new JButton("Add To Cart");
		btnNewButton.setBackground(UIManager.getColor("Button.light"));
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new actionlistener());
		
				textField_4 = new JTextField();
				textField_4.setEditable(false);
				panel_2.add(textField_4, "10, 9, center, center");
				textField_4.setColumns(10);
		
		btnClearData = new JButton("Clear Data");
		btnClearData.setBackground(UIManager.getColor("Button.light"));
		btnClearData.addActionListener(new actionlistener());
		btnClearData.setEnabled(false);
		panel_2.add(btnClearData, "8, 11");
		panel_2.add(btnNewButton, "10, 11, center, center");
		
		panel_4 = new JPanel();
		panel_4.setBackground(UIManager.getColor("Label.background"));
		add(panel_4, "1, 3, fill, fill");
		panel_4.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("100dlu"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("150dlu"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.PREF_ROWSPEC,}));
		
		lblNewLabel = new JLabel("Customer Name");
		panel_4.add(lblNewLabel, "4, 1, right, default");
		
		textField_11 = new JTextField(" ");
		panel_4.add(textField_11, "6, 1, fill, default");
		textField_11.setColumns(10);
		
		lblAddress = new JLabel("Address");
		panel_4.add(lblAddress, "8, 1, right, default");
		
		textField_12 = new JTextField(" ");
		panel_4.add(textField_12, "10, 1, fill, default");
		textField_12.setColumns(10);
		
		scrollPane = new JScrollPane();
		table = new JTable();
		scrollPane.setViewportView(table);
		add(scrollPane, "1, 4, fill, fill");

		panel = new JPanel();
		panel.setBackground(UIManager.getColor("Label.background"));
		add(panel, "1, 5, fill, fill");
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("50dlu"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("150dlu"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("80dlu"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("80dlu"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("80dlu"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.PREF_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("Label.background"));
		panel.add(panel_1, "9, 2, center, fill");
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("120px"),},
			new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_1.add(lblSubTotal, "1, 1");
		
		lblDiscount_1 = new JLabel("Discount");
		lblDiscount_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDiscount_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblDiscount_1, "1, 3");
		
		lblTaxes = new JLabel("Taxes");
		lblTaxes.setBackground(UIManager.getColor("Label.background"));
		lblTaxes.setHorizontalAlignment(SwingConstants.CENTER);
		lblTaxes.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(lblTaxes, "1, 5");
		
		lblFinalAmount = new JLabel("Final Amount");
		lblFinalAmount.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFinalAmount.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblFinalAmount, "1, 7");
		
		panel_3 = new JPanel();
		panel_3.setBackground(UIManager.getColor("Label.background"));
		panel.add(panel_3, "11, 2, fill, fill");
		panel_3.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		textField_7 = new JTextField();
		textField_7.setBackground(UIManager.getColor("TextField.background"));
		textField_7.setForeground(Color.BLACK);
		textField_7.setEditable(false);
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_7, "1, 1, fill, fill");
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setForeground(Color.BLACK);
		textField_8.setBackground(UIManager.getColor("TextField.background"));
		textField_8.setEditable(false);
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_8, "1, 2, fill, fill");
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setForeground(Color.BLACK);
		textField_9.setBackground(UIManager.getColor("TextField.background"));
		textField_9.setEditable(false);
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_9, "1, 3, fill, fill");
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setForeground(Color.BLACK);
		textField_10.setBackground(UIManager.getColor("TextField.background"));
		textField_10.setEditable(false);
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setInheritsPopupMenu(true);
		panel_3.add(textField_10, "1, 4, fill, fill");
		textField_10.setColumns(10);
				
				btnCancelSale = new JButton("Cancel Sale");
				btnCancelSale.setBackground(UIManager.getColor("Button.light"));
				panel.add(btnCancelSale, "9, 4");
				btnCancelSale.addActionListener(new actionlistener());
				
				btnConfirmSale = new JButton("Confirm Sale");
				btnConfirmSale.setBackground(UIManager.getColor("Button.light"));
				panel.add(btnConfirmSale, "11, 4");
				btnConfirmSale.addActionListener(new actionlistener());

		list = new ArrayList<cart>();
		list1 = new ArrayList<String>();
	}
	public static ArrayList<cart> getList(){
		return list;
	}
	public static ArrayList<String> getCustomer(){
		return list1;
	}
	
	public class actionlistener implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			if (event.getActionCommand() == "Get Data") {
					if(Integercheck.check(textField.getText()))
					try {
						
						textField_3.setText("0.0000");
						textField_3.setEditable(true);
						btnClearData.setEnabled(true);
						btnNewButton.setEnabled(true);
						btnGetData.setEnabled(false);
						ResultSet rs = new selectclass().con("MRP , Discount , [Table 2], Type", "Table_1", "[Tag No] = " + textField.getText());
						while (rs.next()) {
							textField_1.setText(textField.getText());
							textField_2.setText(rs.getString("MRP"));
							//textField_3.setText(rs.getString("Discount"));
							textField_4.setText(rs.getString("Type"));
							String temp = rs.getString("Table 2");
							System.out.print(temp);
							
							if (Integer.parseInt(temp) == 0){
								ResultSet rs1 = new selectclass().con("Sold", "Table_1", "[Tag No] = " + textField.getText());
								while(rs1.next()){
									System.out.print(rs1.getBoolean("Sold"));
									if(!rs1.getBoolean("Sold")){
										textField_5.setText("1");
										textField_6.setText("1");
									}
									else{
										textField_5.setText("0");
										textField_6.setText("0");
										btnNewButton.setEnabled(false);
									}		
									textField_6.setEditable(false);
								}
							}
							else {
								ResultSet rs1 = new selectclass().con("Quantity, Sold" ,"Table_2","[Tag No] = " + textField.getText());
								while (rs1.next()) {
									Iterator<cart> ite = list.iterator();
									Integer incart = 0;
									while(ite.hasNext()){
										cart ccart = ite.next();
										if(textField.getText().equals(ccart.gettagno()))
											incart = incart + Integer.parseInt(ccart.getenteredquantity());
									}
									Integer x = Integer.parseInt(rs1.getString("Quantity"))- incart - Integer.parseInt(rs1.getString("Sold"));
									textField_5.setText(x.toString());
									textField_6.setEditable(true);
									if(x==0){
										textField_6.setText("0");
										textField_6.setEditable(false);
										textField_5.setEditable(false);
										textField_3.setEditable(false);
										btnNewButton.setEnabled(false);
									}
									else if(x==1){
										textField_6.setText("1");
										textField_6.setEditable(false);
										textField_5.setEditable(false);
									
									}
								}
								
							}
						}
						textField.setText("");
						textField.setEditable(false);
					} catch(Exception ee){
						ee.printStackTrace();
					}
			} else if (event.getActionCommand() == "Confirm Sale") {
				if(!list.isEmpty())
				{	try {
						
						Iterator<cart> ite = list.iterator();
						
						while(ite.hasNext()){
							cart ccart = ite.next();
							System.out.print(ccart.getquantity());
							try {
								if(ccart.getquantity().equals("1"))
									new Updateclass().con("Table_1", "Sold = 1, Discount = "
											+ ccart.getdiscount()
											, " [Tag No] = "
											+ ccart.gettagno());
								else{
									ResultSet rs = new selectclass().con("Quantity, Sold", "Table_2"," [Tag No] = "
											+ ccart.gettagno());
									while(rs.next()){
										Integer temp = Integer.parseInt(rs.getString("Sold")) + Integer.parseInt(ccart.getenteredquantity());
										String sold = "Sold = " + temp;
										new Updateclass().con("Table_2", sold , " [Tag No] = "
												+ ccart.gettagno());
										ResultSet rs1 = new selectclass().con("Quantity, Sold", "Table_2"," [Tag No] = "
												+ ccart.gettagno());
											while(rs1.next())
												{if(Integer.parseInt(rs1.getString("Quantity"))-Integer.parseInt(rs1.getString("Sold"))==0)
												new Updateclass().con("Table_1", "Sold = 1"
														, " [Tag No] = "
														+ ccart.gettagno());}
										ResultSet rs2 = new selectclass().con("Discount", "Table_1"," [Tag No] = "
													+ ccart.gettagno());
											while(rs2.next())
											{
												Double discount = Double.parseDouble(rs2.getString("Discount"))+(Double.parseDouble(ccart.getdiscount())*(Double.parseDouble(ccart.getenteredquantity())));
												new Updateclass().con("Table_1", "Discount = " + discount
														, " [Tag No] = "
														+ ccart.gettagno());
											}
									}
									rs.close();
								}
							} catch (Exception ee) {
								ee.printStackTrace();
							}
						}
								textField.setText("");
								textField_1.setText("");
								textField_2.setText("");
								textField_3.setText("");
								textField_3.setEditable(false);
								textField_4.setText("");
								textField_5.setText("");
								textField_6.setText("");
								textField_6.setEditable(false);
								
								textField_7.setText("");
								textField_8.setText("");
								textField_9.setText("");
								textField_10.setText("");
								list1.add(textField_11.getText());
								list1.add(textField_12.getText());
								textField_11.setText("");
								textField_12.setText("");
								InvoiceDesign design = new InvoiceDesign();
								try {
									System.out.print("Yes");
									Date date = new Date();
									
									String temp = "('" + datecheck.getdate(date)+ "'";
									
									Iterator<String> ite2 = list1.iterator();
									while(ite2.hasNext()){
										Insertclass.con("Table_3", temp + " , '"+ ite2.next() +"' , '" + ite2.next()+ "')");
									} 
									JasperReportBuilder report = design.build();
									report.show(false);
									report.print(false);
									report.print(false);
								//OutputStream out = new OutputStream
								//report.toPdf(new OutputStream())
									String id = LastIndexclass.con("Table_3");
									Iterator<cart> ite1 = list.iterator();
									while(ite1.hasNext()){
										cart item = ite1.next();
										String col = "("+ id + "," + item.gettagno() + "," + item.getdiscount() + "," + item.getenteredquantity()+ ", 0 )";
										Insertclass.con("SalesTable", col);
									}
									
								}catch (DRException e) {
									e.printStackTrace();
								}
								list = new ArrayList<cart>();
								list1 = new ArrayList<String>();
								table = new JTable();
								scrollPane.setViewportView(table);
						
					} catch (Exception ee) {
						ee.printStackTrace();
					}
				}
				
			}else if (event.getActionCommand() == "Add To Cart") {
				boolean temp = true;
				
				if(Integer.parseInt(textField_5.getText()) == 0)
				{
					temp = false;
					System.out.print("yes");
				}
				temp = Moneyfieldcheck.check(textField_3.getText()) && Integercheck.check(textField_6.getText());
				if (temp){
				String tagfield = "\n\t" + textField_1.getText() + "\n";
				String desfield = "\n\t" + textField_4.getText() + "\n";
				
				String quantityfield;
				
				if(Integer.parseInt(textField_5.getText())==1)
					quantityfield = "\n\t" + "1" + "\n";
				else
					quantityfield = "\n\t" + textField_6.getText() + "\n";
				
				String unitprice = "\n\t" + textField_2.getText() + "\n";
				//String price = "\n\t" + temp1.toString() + "\n";
				
				
				try {
					ResultSet rs = new selectclass().con("[Table 2]", "Table_1", "[Tag No] = "+ textField_1.getText());
						
					while(rs.next())
						if(!rs.getBoolean("Table 2"))
							list.add(new cart(textField_1.getText(), textField_4.getText(), textField_2.getText(), textField_3.getText(), "1",textField_6.getText(), rs.getBoolean("Table 2")));
						else{
							ResultSet rs1 = null;
							rs1 = new selectclass().con("Quantity", "Table_2", "[Tag No] = "+ textField_1.getText());
							while(rs1.next()){
								list.add(new cart(textField_1.getText(), textField_4.getText(), textField_2.getText(), textField_3.getText(),textField_6.getText(), rs1.getString("Quantity"), rs.getBoolean("Table 2")));
								}
							}
					}catch (Exception e) {
						e.printStackTrace();
					}

				Vector<String> columnNames = new Vector<String>();
				Vector data = new Vector();
				
				columnNames.addElement( "Tag No" );
		        columnNames.addElement( "Description" );
		        columnNames.addElement( "Quantity" );
		        columnNames.addElement( "Unit Price" );
		        columnNames.addElement( "Price" );
				
				Iterator<cart> ite = list.iterator();
				
				double totaldiscount = 0.0;
				double subtotal = 0.0;
				double total = 0.0;
				while(ite.hasNext()){
					cart ccart = ite.next();
					Double temp1 = Double.parseDouble(ccart.getmrp())*Double.parseDouble(ccart.getenteredquantity());
					Double mrp = Double.parseDouble(ccart.getmrp());
					totaldiscount = totaldiscount + (Double.parseDouble(ccart.getdiscount())*Double.parseDouble(ccart.getenteredquantity()));
					subtotal = subtotal + temp1;
					
					Vector row = new Vector(5);
					
					row.addElement(ccart.gettagno());
					row.addElement(ccart.gettype());
					row.addElement(ccart.getenteredquantity());
					row.addElement(mrp.toString());
					row.addElement(temp1.toString());
					
					data.addElement(row);
					
				}
				
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
		        scrollPane.repaint();
			    scrollPane.setViewportView(table);
			    
				total = subtotal - totaldiscount;
				
				textField_7.setText(""+subtotal+"");
				textField_8.setText(""+totaldiscount+"");
				textField_10.setText(""+total+"");
				
				textField.setText("");
				textField.setEditable(true);
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_3.setEditable(false);
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_6.setEditable(false);
				btnClearData.setEnabled(false);
				btnNewButton.setEnabled(false);
				btnGetData.setEnabled(true);
				}
			}else if(event.getActionCommand()=="Cancel Sale"){
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_3.setEditable(false);
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_6.setEditable(false);
			/*	textArea.setText("");
				textPane_1.setText("");
				textPane_2.setText("");
				textPane_3.setText("");
				textPane_4.setText("");*/
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				btnClearData.setEnabled(false);
				btnNewButton.setEnabled(false);
				list = new ArrayList<cart>();
				list1 = new ArrayList<String>();
				textField.setEditable(true);
				btnGetData.setEnabled(true);
				table = new JTable();
				scrollPane.setViewportView(table);
			}else if(event.getActionCommand()=="Clear Data"){
				textField.setEditable(true);
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_3.setEditable(false);
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_6.setEditable(false);
				btnGetData.setEnabled(true);
				btnClearData.setEnabled(false);
				btnNewButton.setEnabled(false);
			}
		}
	}
}
