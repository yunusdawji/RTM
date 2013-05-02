package com.mycompany.project.client;

//import java.awt.Component;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;
//import java.sql.SQLException;
//import java.sql.SQLException;
//import javax.swing.JScrollPane;
//import javax.swing.JScrollBar;

@SuppressWarnings("serial")
public class ReturnPanel1 extends JPanel {
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_3;
	private JTextField textField_7, textField_11;
	private JLabel lblSubTotal;
	private JLabel lblDiscount_1;
	private JLabel lblTaxes;
	private JLabel lblFinalAmount;
	private JTextField textField_8, textField_12;
	private JTextField textField_9, textField_13;
	private JTextField textField_10, textField_14;
	private JPanel panel_2;
	private JLabel lblEnterInvoiceNo;
	private JTextField textField;
	private JButton btnGetInvoice;
	private static ArrayList<Item> list, list1;
	private JPanel panel_4;
	private JLabel lblEnterTagNo;
	private JTextField textField_1;
	private JButton btnAddToCart;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private final JPanel panel_8 = new JPanel();
	private JButton btnCancel;
	private JButton btnConfirmReturn;
//	private JScrollBar scrollBar;
	private static Integer invoiceno;
	private JButton btnClear;
	private JScrollPane scrollPane;
	/**
	 * @wbp.nonvisual location=-27,71
	 */
	private JTable table;
	private JScrollPane scrollPane_1;
	/**
	 * @wbp.nonvisual location=-17,121
	 */
	private JTable table_1;
	/**
	 * Create the panel.
	 */
	public ReturnPanel1() {
		setLayout(new BorderLayout(0, 0));
		panel_8.setBackground(UIManager.getColor("Label.background"));
		add(panel_8, BorderLayout.CENTER);
		panel_8.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("600px:grow"),},
			new RowSpec[] {
				RowSpec.decode("29px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("90dlu:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.MIN_ROWSPEC,
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("90dlu:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.MIN_ROWSPEC,}));

		panel_2 = new JPanel();
		panel_2.setBackground(UIManager.getColor("Label.background"));
		panel_8.add(panel_2, "1, 1, fill, fill");
		panel_2.setLayout(new FormLayout(new ColumnSpec[] {
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
				RowSpec.decode("max(17dlu;default)"),}));

		lblEnterInvoiceNo = new JLabel("Enter Invoice No");
		panel_2.add(lblEnterInvoiceNo, "4, 1, right, default");

		textField = new JTextField();
		panel_2.add(textField, "6, 1, center, center");
		textField.setColumns(10);

		btnGetInvoice = new JButton("Get Invoice");
		btnGetInvoice.setBackground(UIManager.getColor("Button.light"));
		btnGetInvoice.addActionListener(new actionlistener());
		panel_2.add(btnGetInvoice, "8, 1, center, center");
		
		btnClear = new JButton("Cancel");
		btnClear.setBackground(UIManager.getColor("Button.light"));
		panel_2.add(btnClear, "10, 1");
		btnClear.addActionListener(new actionlistener());
		
		scrollPane = new JScrollPane();
		table = new JTable();
		
		scrollPane.setViewportView(table);
		panel_8.add(scrollPane, "1, 3, fill, fill");

		panel = new JPanel();
		panel.setBackground(UIManager.getColor("Label.background"));
		panel_8.add(panel, "1, 5, fill, fill");
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
				FormFactory.PREF_ROWSPEC,}));

		panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("Label.background"));
		panel.add(panel_1, "9, 1, center, fill");
		panel_1.setLayout(new FormLayout(new ColumnSpec[] { ColumnSpec
				.decode("120px"), }, new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, }));

		lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_1.add(lblSubTotal, "1, 1");

		lblDiscount_1 = new JLabel("Discount");
		lblDiscount_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDiscount_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblDiscount_1, "1, 3");

		lblTaxes = new JLabel("Taxes");
		lblTaxes.setHorizontalAlignment(SwingConstants.CENTER);
		lblTaxes.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(lblTaxes, "1, 5");

		lblFinalAmount = new JLabel("Final Amount");
		lblFinalAmount.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFinalAmount.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblFinalAmount, "1, 7");

		panel_3 = new JPanel();
		panel_3.setBackground(UIManager.getColor("Label.background"));
		panel.add(panel_3, "11, 1, fill, fill");
		panel_3.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));

		textField_7 = new JTextField();
		textField_7.setForeground(Color.RED);
		textField_7.setBackground(Color.BLACK);
		textField_7.setEditable(false);
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_7, "1, 1, fill, fill");
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setForeground(Color.RED);
		textField_8.setBackground(Color.BLACK);
		textField_8.setEditable(false);
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_8, "1, 2, fill, default");
		textField_8.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setForeground(Color.RED);
		textField_9.setBackground(Color.BLACK);
		textField_9.setEditable(false);
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_9, "1, 3, fill, default");
		textField_9.setColumns(10);

		textField_10 = new JTextField();
		textField_10.setForeground(Color.RED);
		textField_10.setBackground(Color.BLACK);
		textField_10.setEditable(false);
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setInheritsPopupMenu(true);
		panel_3.add(textField_10, "1, 4, fill, fill");
		textField_10.setColumns(10);

		panel_4 = new JPanel();
		panel_4.setBackground(UIManager.getColor("Label.background"));
		panel_8.add(panel_4, "1, 7, fill, fill");
		panel_4.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"), },
				new RowSpec[] { FormFactory.PREF_ROWSPEC, }));

		lblEnterTagNo = new JLabel("Enter Tag No");
		panel_4.add(lblEnterTagNo, "4, 1, right, default");

		textField_1 = new JTextField();
		panel_4.add(textField_1, "6, 1, fill, default");
		textField_1.setColumns(10);
		textField_1.setEditable(false);
		
		btnAddToCart = new JButton("Add To Cart");
		btnAddToCart.setBackground(UIManager.getColor("Button.light"));
		panel_4.add(btnAddToCart, "8, 1, fill, fill");
		btnAddToCart.addActionListener(new actionlistener());
		btnAddToCart.setEnabled(false);
		
		scrollPane_1 = new JScrollPane();
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		panel_8.add(scrollPane_1, "1, 9, fill, fill");
		
		panel_5 = new JPanel();
		panel_5.setBackground(UIManager.getColor("Label.background"));
		panel_8.add(panel_5, "1, 11, fill, fill");
		panel_5.setLayout(new FormLayout(new ColumnSpec[] {
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

		panel_6 = new JPanel();
		panel_6.setBackground(UIManager.getColor("Label.background"));
		panel_5.add(panel_6, "9, 2, fill, fill");

		panel_6.setLayout(new FormLayout(new ColumnSpec[] { ColumnSpec
				.decode("120px"), }, new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, }));

		lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_6.add(lblSubTotal, "1, 1");

		lblDiscount_1 = new JLabel("Discount");
		lblDiscount_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDiscount_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblDiscount_1, "1, 3");

		lblTaxes = new JLabel("Taxes");
		lblTaxes.setHorizontalAlignment(SwingConstants.CENTER);
		lblTaxes.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_6.add(lblTaxes, "1, 5");

		lblFinalAmount = new JLabel("Final Amount");
		lblFinalAmount.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFinalAmount.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblFinalAmount, "1, 7");

		panel_7 = new JPanel();
		panel_7.setBackground(UIManager.getColor("Label.background"));
		panel_5.add(panel_7, "11, 2, fill, fill");
		panel_7.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));

		textField_11 = new JTextField();
		textField_11.setForeground(Color.RED);
		textField_11.setBackground(Color.BLACK);
		textField_11.setEditable(false);
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(textField_11, "1, 1, fill, default");
		textField_11.setColumns(10);

		textField_12 = new JTextField();
		textField_12.setForeground(Color.RED);
		textField_12.setBackground(Color.BLACK);
		textField_12.setEditable(false);
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(textField_12, "1, 2, fill, default");
		textField_12.setColumns(10);

		textField_13 = new JTextField();
		textField_13.setForeground(Color.RED);
		textField_13.setBackground(Color.BLACK);
		textField_13.setEditable(false);
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(textField_13, "1, 3, fill, default");
		textField_13.setColumns(10);

		textField_14 = new JTextField();
		textField_14.setForeground(Color.RED);
		textField_14.setBackground(Color.BLACK);
		textField_14.setEditable(false);
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setInheritsPopupMenu(true);
		panel_7.add(textField_14, "1, 4, fill, default");
		textField_14.setColumns(10);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBackground(UIManager.getColor("Button.light"));
		panel_5.add(btnCancel, "9, 4");
		btnCancel.addActionListener(new actionlistener());
		
		btnConfirmReturn = new JButton("Confirm Return");
		btnConfirmReturn.setBackground(UIManager.getColor("Button.light"));
		panel_5.add(btnConfirmReturn, "11, 4");
		btnConfirmReturn.addActionListener(new actionlistener());

		// scrollBar = new JScrollBar();
		// add(scrollBar, BorderLayout.EAST);
		// scrollBar.addMouseMotionListener(p);

		list = new ArrayList<Item>();
		list1 = new ArrayList<Item>();
	}

	public static ArrayList<Item> getList() {
		return list1;
	}
	public static Integer getInvoiceno() {
		return invoiceno;
	}

	public class actionlistener implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			if (event.getActionCommand() == "Get Invoice") {
				table = new JTable();
				scrollPane.setViewportView(table);
				list = new ArrayList<Item>();
				list1 = new ArrayList<Item>();
				
				try {
					invoiceno = Integer.parseInt(textField.getText());
					ResultSet rs = new selectclass().con(
							"[Tag No], Discount, Quantity, Returned", "Salestable",
							"[Invoice No] = " + textField.getText());
					
					while (rs.next()) {
						if(!rs.getBoolean("Returned")){
						String tagno = "\n\t" + rs.getString("Tag No") + "\n";
						String discount = "\n\t" + rs.getString("Discount")
								+ "\n";
						String quantity = "\n\t" + rs.getString("Quantity")
								+ "\n";
						String desp = null;
						String MRP = null;
						// try{
						ResultSet rs1 = new selectclass().con("Type, MRP",
								"Table_1",
								"[Tag No] = " + rs.getString("Tag No"));
						while (rs1.next()) {
							Integer i = Integer.parseInt(rs
									.getString("Quantity"));
							BigDecimal j = BigDecimal.valueOf(Double
									.parseDouble(rs1.getString("MRP")));
							BigDecimal k = BigDecimal.valueOf(Double
									.parseDouble(rs.getString("Discount")));
							
							list.add(new Item(rs1.getString("Type"), i, j, rs
									.getString("Tag No"), k));
							desp = "\n\t" + rs1.getString("Type") + "\n";
							MRP = "\n\t" + rs1.getString("MRP") + "\n";
						}
						Double price = Double.parseDouble(MRP)
								* Double.parseDouble(quantity);
						String pric = "\n\t" + price.toString() + "\n";
						
						// }catch (Exception e) {

						// e.printStackTrace();
						// }
						}
					}
					Vector<String> columnNames = new Vector<String>();
					Vector data = new Vector();
					
					columnNames.addElement( "Tag No" );
			        columnNames.addElement( "Description" );
			        columnNames.addElement( "Quantity" );
			        columnNames.addElement( "Unit Price" );
			        columnNames.addElement( "Price" );
					
					Iterator<Item> ite = list.iterator();

					double totaldiscount = 0.0;
					double subtotal = 0.0;
					double total = 0.0;
					while (ite.hasNext()) {
						Item item = ite.next();
						Double temp1 = item.getUnitprice().doubleValue()*item.getQuantity();
						Double mrp = Double.parseDouble(item.getUnitprice().toPlainString());
						
						totaldiscount = totaldiscount
								+ (item.getDiscount().doubleValue()*item.getQuantity());
						subtotal = subtotal
								+ (item.getUnitprice().doubleValue())
								* item.getQuantity();
					
						Vector row = new Vector(5);
						
						row.addElement(item.getTagno());
						row.addElement(item.getDescription());
						row.addElement(item.getQuantity());
						row.addElement(item.getUnitprice().doubleValue());
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

					textField_7.setText("" + subtotal + "");
					textField_8.setText("" + totaldiscount + "");
					textField_10.setText("" + total + "");
				} catch (Exception e) {

					e.printStackTrace();
				}
				textField.setEditable(false);
				btnGetInvoice.setEnabled(false);
				textField_1.setEditable(true);
				btnAddToCart.setEnabled(true);
				textField.setText("");
			}else if(event.getActionCommand()=="Add To Cart"){
				boolean temp = Integercheck.check(textField_1.getText());
				if(temp){
					Iterator<Item> ite = list.iterator();
					while(ite.hasNext()){
						Item item = ite.next();
						if(item.getTagno().equals(textField_1.getText())){
							list1.add(item);
							Double price = item.getUnitprice().doubleValue()*item.getQuantity();
							}
					}
					Vector<String> columnNames = new Vector<String>();
					Vector data = new Vector();
					
					columnNames.addElement( "Tag No" );
			        columnNames.addElement( "Description" );
			        columnNames.addElement( "Quantity" );
			        columnNames.addElement( "Unit Price" );
			        columnNames.addElement( "Price" );
					
					Iterator<Item> ite1 = list1.iterator();

					double totaldiscount = 0.0;
					double subtotal = 0.0;
					double total = 0.0;
					while (ite1.hasNext()) {
						Item item = ite1.next();
						Double temp1 = item.getUnitprice().doubleValue()*item.getQuantity();
						Double mrp = Double.parseDouble(item.getUnitprice().toPlainString());
						
						totaldiscount = totaldiscount
								+ (item.getDiscount().doubleValue()*item.getQuantity());
						subtotal = subtotal
								+ (item.getUnitprice().doubleValue())
								* item.getQuantity();
						Vector row = new Vector(5);
						
						row.addElement(item.getTagno());
						row.addElement(item.getDescription());
						row.addElement(item.getQuantity());
						row.addElement(item.getUnitprice().doubleValue());
						row.addElement(temp1.toString());
						
						data.addElement(row);
				}
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
			        scrollPane_1.repaint();
				    scrollPane_1.setViewportView(table_1);
				    	
					
					total = subtotal - totaldiscount;
					textField_1.setText("");
					textField_11.setText("" + subtotal + "");
					textField_12.setText("" + totaldiscount + "");
					textField_14.setText("" + total + "");
					textField.setEditable(false);
					btnGetInvoice.setEnabled(false);
				}
			}else if(event.getActionCommand()=="Confirm Return"){
				System.out.print("Sucess");
				Iterator<Item> ite = list1.iterator();
				try {
				while(ite.hasNext()){
					Item item = ite.next();
					ResultSet rs = new selectclass().con("[Table 2], Sold, Discount", "Table_1", "[Tag No] = "+item.getTagno());
					
						while(rs.next()){
							if(rs.getBoolean("Table 2")){
								ResultSet rs1 = new selectclass().con("Sold", "Table_2", "[Tag No] = "+item.getTagno());
								Integer sold = null;
								while(rs1.next())
									sold = Integer.parseInt(rs1.getString("Sold")) - item.getQuantity();
								System.out.print(sold);
								new Updateclass().con("Table_2","Sold = "+sold.toString() , "[Tag No] = " + item.getTagno());
								Double discount = Double.parseDouble(rs.getString("Discount")) - (double) (item.getDiscount().floatValue()*item.getQuantity());
								new Updateclass().con("Table_1", "Discount = "+discount.toString(), "[Tag No] =" +item.getTagno());
							}
							else{
								Double discount = Double.parseDouble(rs.getString("Discount")) - (double) (item.getDiscount().floatValue()*item.getQuantity());
								new Updateclass().con("Table_1", "Discount = "+discount.toString(), "[Tag No] =" +item.getTagno());
						
							}
							if(rs.getBoolean("Sold"))
								new Updateclass().con("Table_1","Sold = 0" , "[Tag No] = " + item.getTagno());
							
						}
				
					new Updateclass().con("Salestable", "Returned = 1", "[Tag No] = " + item.getTagno()+" AND [Invoice No] = "+invoiceno.toString());
					Insertclass.con("Returntable", "( " + invoiceno.toString() + "," + item.getTagno() + ",'" + datecheck.getdate(new Date()) + "')");
				}	textField_7.setText("");
					textField_8.setText("");
					textField_9.setText("");
					textField_10.setText("");
					textField_11.setText("");
					textField_12.setText("");
					textField_13.setText("");
					textField_14.setText("");
					
					table = new JTable();
					scrollPane.setViewportView(table);
					table_1 = new JTable();
					scrollPane_1.setViewportView(table_1);

					textField_1.setText("");

					
					ReturnInvoiceDesign design = new ReturnInvoiceDesign();
					JasperReportBuilder report = design.build();
					report.show(false);
					report.print(false);
					report.print(false);
					
					textField.setEditable(true);
					btnGetInvoice.setEnabled(true);

					
					list = new ArrayList<Item>();
					list1 = new ArrayList<Item>();
					
				
					} catch (Exception e) {
						e.printStackTrace();
					}
				
			}else if(event.getActionCommand()=="Cancel"){
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				table = new JTable();
				scrollPane.setViewportView(table);
				table_1 = new JTable();
				scrollPane_1.setViewportView(table_1);

				textField_1.setText("");

				list = new ArrayList<Item>();
				list1 = new ArrayList<Item>();
				
				textField.setEditable(true);
				btnGetInvoice.setEnabled(true);
				textField_1.setEditable(false);
				btnAddToCart.setEnabled(false);
			}
		}
	}
}
