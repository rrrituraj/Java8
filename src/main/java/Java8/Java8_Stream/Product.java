package Java8.Java8_Stream;

public class Product {
	private Integer price;
	private String name;

	public Product() {
	}

	public Product(Integer id, String name) {

		price = id;
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public Product setPrice(Integer price) {
		this.price = price;
		return this;
	}

	public String getName() {
		return name;
	}

	public Product setName(String name) {
		this.name = name;
		return this;
	}
}
