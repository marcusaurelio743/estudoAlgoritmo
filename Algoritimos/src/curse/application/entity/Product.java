package curse.application.entity;

public class Product {
	private String nome;
	private Double price;
	private Integer quantity;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double totalValueInStock() {
		return this.quantity * this.price;
	}

	public void addProduct(Integer quantity) {
		this.quantity += quantity;
	}

	public void removeProduct(Integer quantity) {
		this.quantity -= quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
