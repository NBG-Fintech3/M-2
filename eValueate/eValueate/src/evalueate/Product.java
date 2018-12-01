public class Product{
	
	private static int productID=0;
	private String name;
	private String description;
	private double value;
	
	public Product(String n,String desc,double val){
		name = n;
		description = desc;
		value = val;
		productID++;
	}
	
	public int getProductID(){
		return productID;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public double getValue(){
		return value;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setDescription(String desc){
		description = desc;
	}
	
	public void setValue(double value){
		this.value=value;
	}
	
}