package Tables;

public class Website {

	private String url;
	private String brand;
	private String model;
	private String alternativeName;
	
	public Website(String url, String brand, String model, String alternativeName) {
		this.url = url;
		this.brand = brand;
		this.model = model;
		this.alternativeName = alternativeName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getAlternativeName() {
		return alternativeName;
	}

	public void setAlternativeName(String alternativeName) {
		this.alternativeName = alternativeName;
	}
	
}
