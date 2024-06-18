import java.io.Serializable;

public class ProductBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private int productId;
    private String productName;
    private double price;
    private int quantity;

    //constructor sin parametros

    public ProductBean() {
    }

    //constructor con parametros

    public ProductBean(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    //getters and setters

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ProductBean [productid: " + productId + "\nproductName: " + productName + "\nprice: " + price + "\nquantity: " + quantity + "]";
    }
}
