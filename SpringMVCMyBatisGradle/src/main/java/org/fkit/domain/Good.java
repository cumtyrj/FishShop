package org.fkit.domain;

public class Good {
	private Integer good_id;
	private String name;
	private String price;
	private String image;
	private String detail;
	private Integer inventory;
	private Integer sales;
	private String goodtype;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Integer getInventory() {
		return inventory;
	}
	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Integer getSales() {
		return sales;
	}
	public void setSales(Integer sales) {
		this.sales = sales;
	}
	@Override
	public String toString() {
		return "Good [good_id=" + good_id + ", name=" + name + ", price=" + price
				+ ", detail=" + detail + ", image="
				+ image + ",inventory=" +inventory + ", sales=" + sales
				+ ",goodtype=" +goodtype + "]";
	}

	public String getGoodtype() {
		return goodtype;
	}
	public void setGoodtype(String goodtype) {
		this.goodtype = goodtype;
	}
	public Integer getGood_id() {
		return good_id;
	}
	public void setGood_id(Integer good_id) {
		this.good_id = good_id;
	}
}
