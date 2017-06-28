package system.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PRODUCT")
public class ProductEntity implements Serializable {

    @Id
    @Column(name = "ID")
    @TableGenerator(name = "prodid", table = "productspktbl", pkColumnName = "idproduct",
            pkColumnValue = "idProductValue", allocationSize = 1)
    @GeneratedValue
    private Integer id;

    @Column(name = "PRODNAME")
    private String prodName;

    @Column(name = "PRICE")
    private String price;
//    private String size;
    @Column(name = "COMMENTS")
    private String comments;

    public ProductEntity() {
    }

    public ProductEntity(int id) {
        this.id = id;
    }

    public ProductEntity(int id, String prodName, String price) {
        this.id = id;
        this.prodName = prodName;
        this.price = price;
    }

    public ProductEntity(String prodName, String price, String comments) {
        this.prodName = prodName;
        this.price = price;
        this.comments = comments;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
