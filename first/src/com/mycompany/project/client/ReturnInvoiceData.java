/**
 * DynamicReports - Free Java reporting library for creating reports dynamically
 *
 * Copyright (C) 2010 - 2012 Ricardo Mariaca
 * http://dynamicreports.sourceforge.net
 *
 * This file is part of DynamicReports.
 *
 * DynamicReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * DynamicReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with DynamicReports. If not, see <http://www.gnu.org/licenses/>.
 */

package com.mycompany.project.client;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 * @author Ricardo Mariaca (dynamicreports@gmail.com)
 */
public class ReturnInvoiceData {
	private Invoice invoice;

	public ReturnInvoiceData() {
		invoice = createInvoice();
	}

	private Invoice createInvoice() {
		Invoice invoice = new Invoice();
	//	String id = LastIndexclass.con("Table_3");
		
		invoice.setId(ReturnPanel1.getInvoiceno());
		invoice.setShipping(new BigDecimal(10));
		invoice.setTax(0.2);
		
		ResultSet rs = new selectclass().con("[Customers Name], [Customers Address]", "Table_3", "[Invoice No] = "+ReturnPanel1.getInvoiceno());
		
			try {
				while(rs.next())
				invoice.setBillTo(createCustomer(rs.getString("Customers Name"), rs.getString("Customers Address")));
			} catch (SQLException e) {
				e.printStackTrace();
			}

		List<Item> items = ReturnPanel1.getList();
	//	while(ite.hasNext()){
		//	Item temp = ite.next();
	//		items.add(createItem(temp));
	//	}
	//	//items.add(createItem("Notebook","34", 1, new BigDecimal(1000),new BigDecimal(10)));
		//items.add(createItem("DVD", 5, new BigDecimal(40)));
		//items.add(createItem("Book","36", 2, new BigDecimal(10),new BigDecimal(30)));
		//items.add(createItem("Phone","39", 1, new BigDecimal(200),new BigDecimal(20)));
		invoice.setItems(items);

		return invoice;
	}

	private Customer createCustomer(String name, String address) {
		Customer customer = new Customer();
		customer.setName(name);
		customer.setAddress(address);
		return customer;
	}
	private Item createItem(cart citem){
		Item item = new Item();
		item.setDiscount(BigDecimal.valueOf(Double.parseDouble(citem.getdiscount())*Integer.parseInt(citem.getenteredquantity())));
		item.setTagno(citem.gettagno());
		item.setDescription(citem.gettype());
		item.setQuantity(Integer.parseInt(citem.getenteredquantity()));
		item.setUnitprice(BigDecimal.valueOf(Double.parseDouble(citem.getmrp())));
		return item;
	}
	public Invoice getInvoice() {
		return invoice;
	}

	public JRDataSource createDataSource() {
		return new JRBeanCollectionDataSource(invoice.getItems());
	}
}
