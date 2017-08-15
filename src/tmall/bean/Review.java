package tmall.bean;

import java.util.Date;
/**
 * Created by TurboLoong on 2017/8/13.
 */
public class Review {
    private String content;
    private Date createDate;
    private User user;
    private Product Product;
    private int id;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public tmall.bean.Product getProduct() {
        return Product;
    }

    public void setProduct(tmall.bean.Product product) {
        Product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
