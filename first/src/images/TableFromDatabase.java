package images;

import java.awt.*;
import java.sql.*;
import java.util.*;
import java.util.Date;

import javax.swing.*;
import javax.swing.table.*;

public class TableFromDatabase extends JFrame {
	private JTable jtable = new JTable();

	public JTable getTable() {
		return jtable;
	}

	public TableFromDatabase() {
		Vector<String> columnNames = new Vector<String>();
		Vector data = new Vector();

		try {
			// Connect to an Access Database

			// String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
			// String url = "jdbc:odbc:???"; // if using ODBC Data Source name
			// String url =
			// "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=c:/directory/???.mdb";
			// String userid = "";
			// String password = "";

			// Class.forName( driver );
			// Connection connection = DriverManager.getConnection( url, userid,
			// password );

			// Read data from a table
			//
			// String sql = "Select * from ???";
			// Statement stmt = connection.createStatement();
			ResultSet rs = new selectclass().con("[Invoice No]", "Table_3",
					"[Date] = '7/9/2012'");
			// for (int i = 1; i <= columns; i++)
			// {
			columnNames.addElement("Discount");
			columnNames.addElement("Tag No");
			columnNames.addElement("Quantity");
			// }
			while (rs.next()) {
				ResultSet rs1 = new selectclass().con(
						"Discount, [Tag No], Quantity", "SalesTable",
						"[Invoice No] = " + rs.getString("Invoice No")
								+ "AND [Returned] = 'False'");

				ResultSetMetaData md = rs1.getMetaData();
				int columns = md.getColumnCount();

				// Get column names

				// Get row data

				while (rs1.next()) {
					Vector row = new Vector(columns);

					for (int i = 1; i <= columns; i++) {
						row.addElement(rs1.getObject(i));
					}

					data.addElement(row);
				}

				// stmt.close();
				// connection.close();

			}
			rs.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		// Create table with database data

		jtable = new JTable(data, columnNames) {
			public Class getColumnClass(int column) {
				for (int row = 0; row < getRowCount(); row++) {
					Object o = getValueAt(row, column);

					if (o != null) {
						return o.getClass();
					}
				}

				return Object.class;
			}
		};

		JScrollPane scrollPane = new JScrollPane(jtable);
		getContentPane().add(scrollPane);

		JPanel buttonPanel = new JPanel();
		getContentPane().add(buttonPanel, BorderLayout.SOUTH);
	}

	// public static JTable getTable(Date d){
	// return jtable;
	// }
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JScrollPane scrollPane = new JScrollPane(
				new TableFromDatabase().getTable());
		frame.getContentPane().add(scrollPane);

		JPanel buttonPanel = new JPanel();
		frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
		// TableFromDatabase frame = new TableFromDatabase();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
