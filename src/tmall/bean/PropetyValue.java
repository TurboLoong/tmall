package tmall.bean;

/**
 * Created by TurboLoong on 2017/8/13.
 */
public class PropetyValue {
    private String value;
    private Product product;
    private Product property;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProperty() {
        return property;
    }

    public void setProperty(Product property) {
        this.property = property;
    }
}
