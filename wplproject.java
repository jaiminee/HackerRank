import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class wplproject {
	public static void main(String[] args) {
		Bean bean = new Bean();
		//insertProductDetails(bean);
		ArrayList<String> idOfProduct = new ArrayList<String>();
		bean.setProductId("1");
		bean.setProductId("2");
		//idOfProduct.add("1");
		idOfProduct.add("2");
		deleteProducts(idOfProduct,bean);
		
	}
	public static void insertProductDetails(Bean bean) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/giftregistry?autoReconnect=true&useSSL=false","root","Krunal1!");
			Statement st;
			bean.setProductName("laptop");
			bean.setProductDesc("i5");
			bean.setPrice(700);
			bean.setBrand("Apple");
			bean.setColor("spacegrey");
			bean.setCategory("electronics");
			System.out.println("in");
				st = con.createStatement();
				String insertQuery = "insert into product (productname,productdesc,price,brand,color,category)"
						
						+"values ('"+ bean.getProductName() + "', '" + bean.getProductDesc() + "', '" + bean.getPrice() +"', '" + bean.getBrand() + "', '" + bean.getColor() + "', '" + bean.getCategory() + "')"; 
				st.executeUpdate(insertQuery);
				System.out.println("in_out");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void deleteProducts(ArrayList<String> idOfProduct, Bean bean) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/giftregistry?autoReconnect=true&useSSL=false","root","Krunal1!");
			Statement st=con.createStatement();
			int size = idOfProduct.size();
			int i =0;
			System.out.println("in_out");
			while(i<size) {
				String deleteQuery = "delete from product where productid='"+idOfProduct.get(i)+"'";
				st.executeUpdate(deleteQuery);
				System.out.println("in_out");
				i++;
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

class Bean{
	private String productname;
	private String productdesc;
	private int price;
	private String brand;
	private String color;
	private String category;
	private String productid;
	Bean(){
		productname = "";
		productdesc = "";
		price = 0;
		brand = "";
		color = "";
		category = "";
		productid = "";
	}
	String getProductName() {
		return productname;
	}
	String getProductId() {
		return productid;
	}
	String getProductDesc() {
		return productdesc;
	}
	int getPrice() {
		return price;
	}
	String getBrand() {
		return brand;
	}
	String getColor() {
		return color;
	}
	String getCategory() {
		return category;
	}
	void setProductName(String productname) {
		this.productname = productname;
	}
	void setProductDesc(String productdesc) {
		this.productdesc = productdesc;
	}
	void setPrice(int price) {
		this.price = price;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	void setColor(String color) {
		this.color = color;
	}
	void setCategory(String category) {
		this.category = category;
	}
	void setProductId(String productid) {
		this.productid = productid;
	}
}
