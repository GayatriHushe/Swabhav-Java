package com.techlab.model;

public class LineItem 
{
	private int lid;
	private Product product;
	private int qty;
	
	public LineItem(int lid, int qty, Product product) {
		this.lid = lid;
		this.product = product;
		this.qty = qty;
	}
	public int getLid() 
	{	return lid;		}

	public Product getProduct() 
	{	return product;	}

	public int getQty() 
	{	return qty;		}

	public void updateQty(int qty) {
		this.qty+=qty;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineItem other = (LineItem) obj;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LineItem [lid=" + lid + ", product=" + product + ", qty=" + qty + "]";
	}
}
