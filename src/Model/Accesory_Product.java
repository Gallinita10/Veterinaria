package Model;

public class Accesory_Product extends Product {

	protected String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Accesory_Product() {
		super();
	}

	public Accesory_Product(int id_Product, String product_Name, float cost_Price, float sale_Price,
			String description) {
		super(id_Product, product_Name, cost_Price, sale_Price);
		this.description = description;
	}

	public Accesory_Product(String product_Name, float cost_Price, float sale_Price, String description) {
		super(product_Name, cost_Price, sale_Price);
		this.description = description;
	}
	
	
	
}
