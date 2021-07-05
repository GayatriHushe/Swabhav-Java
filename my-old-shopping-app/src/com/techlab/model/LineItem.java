package com.techlab.model;

public class LineItem 
{
	private static int lineItemCount=0;
		
	private int lid;
	private Product product;
	private int qty;
	private double totalPrice;

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		LineItem other = (LineItem) obj;
		if (product == null) 
		{
			if (other.product != null) return false;
		} 
		else if (!product.equals(other.product)) return false;
		return true;
	}

	public LineItem(Product product, int qty)
	{
		this.lid = ++lineItemCount;
		this.product = product;
		this.qty = qty;
		this.setTotalPrice();
	}

	public int getId() 
	{
		return lid;
	}

	public Product getProduct() 
	{
		return product;
	}

	public int getQty() 
	{
		return qty;
	}

	public double getTotalPrice()
	{
		return totalPrice;
	}

	public void setQty(int qty) 
	{
		this.qty += qty;
		setTotalPrice();
	}

	public void setTotalPrice()
	{
		this.totalPrice = qty * product.getCost();
	}

	@Override
	public String toString() {
		return "LineItem [lid=" + lid + ", product=" + product + ", qty=" + qty + ", totalPrice=" + totalPrice + "]";
	}

	
}
