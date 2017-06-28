package system.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity //Этой аннотацией мы указываем, что данный класс является сущностью.
@Table(name = "CART")// Этой аннотацией мы указываем, что за эту сущность в БД отвечает таблица с именем CART
//Хочу отметить, что регистр не важен, эту анотацию можно не указывать, тогда хибернейт создаст нам БД с
//именем как у класса
public class CartEntity  implements Serializable {
    @Id
    @Column(name = "ID")
    //Здесь написать можно много)) Почему я написал здесь так? В общем можно в
    //@GeneratedValue(strategy=GenerationType.вместо TABLE написать AUTO) тогда
    //при первой загрузке таблицы, Id сгенерируются автоматически  от 1 до своего максимального значения.
    //Если у вас 20 вещей в таблице, то сгенерируется от 1 до 20.
    //Но при последующих добавлениях, id у добавленной вещи будет примерно таким - 345768.
    //Я написал все так, чтобы последний мой id хранился в таблице и генерировался потом адекватно при последующих добавлениях.
    //Также есть SEQUENCE, но он не поддерживается в Derby, а работать мы будем именно с ней.
    //В общем, это нюансы. Можете узнать про них самостоятельно
    @TableGenerator(name = "cartid", table = "cartpktbl", pkColumnName = "idCart",
            pkColumnValue = "idCartValue",allocationSize = 1)
    @GeneratedValue (strategy = GenerationType.TABLE, generator = "cartid")
    private Integer id;

//    @Size(max = 25)
    @Column(name = "NAMEITEM")
    private String nameItem;

    @Column(name = "PRICE")
    private Integer price;

    public CartEntity() {
    }

    public CartEntity( String nameItem, int price) {

        this.nameItem = nameItem;
        this.price = price;
    }

    public CartEntity(Integer id,String nameItem, int price) {
        this.id=id;
        this.nameItem = nameItem;
        this.price = price;
    }

    public CartEntity(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
