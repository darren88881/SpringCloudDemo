package cn.itcast.order.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * 商品实体类
 * @author darren
 * @create 2020-12-25 23:09
 */
@Data
@Entity
@Table(name="tb_product")
public class Product {
    @Id
    private	Long	id;
    private	String	productName;
    private	Integer	stauts;
    private BigDecimal price;
    private	String	productDesc;
    private	String	caption;
    private	Integer	inventory;



}
