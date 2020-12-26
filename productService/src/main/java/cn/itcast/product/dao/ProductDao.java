package cn.itcast.product.dao;

import cn.itcast.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author darren
 * @create 2020-12-25 23:29
 */
public interface ProductDao  extends JpaRepository<Product,Long> , JpaSpecificationExecutor<Product> {





}
