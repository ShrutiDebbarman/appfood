package org.foodapp.model;



//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer itemId;
    String itemName;
//    @Lob
//    @Column(name = "Image", length = Integer.MAX_VALUE, nullable = true)
//    private byte[] image;
    @ManyToOne
    Category category;
    //Integer quantity;
    Double cost;
    @ManyToOne
    Restaurant restaurant;
	
  
	public Item(String itemName, Category category, Double cost, Restaurant restaurant) {  //, byte[] image
		super();
		this.itemName = itemName;
		this.category = category;
		this.cost = cost;
		this.restaurant = restaurant;
		//this.image = image;
	}

	public Item() {
	
	}


	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	} 
    
	 public Restaurant getRestaurant() {
			return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
			this.restaurant = restaurant;
	}
	
//	public byte[] getImage() {
//			return image;
//	}
//	public void setImage(byte[] image) {
//			this.image = image;
//	}

}
	
