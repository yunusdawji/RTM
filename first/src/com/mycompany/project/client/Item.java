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

/**
 * 
 * @author Ricardo Mariaca (dynamicreports@gmail.com) 
 * ReWritten By - Yunus Dawji 
 */
public class Item {
	private String description;
	private Integer quantity;
	private BigDecimal unitprice;
	private String tagno;
	private BigDecimal discount;
	
	public Item(){
		
	}
	public Item(String description, Integer quantity, BigDecimal unitprice, String tagno, BigDecimal discount){
		this.description = description;
		this.discount = discount;
		this.quantity = quantity;
		this.tagno = tagno;
		this.unitprice = unitprice;
	}
	public BigDecimal getDiscount(){
		return discount;
	}
	
	public void setDiscount(BigDecimal discount){
		this.discount = discount;
	}
	
	public String getTagno(){
		return tagno;
	}
	
	public void setTagno(String tagno){
		this.tagno = tagno;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(BigDecimal unitprice) {
		this.unitprice = unitprice;
	}
}
