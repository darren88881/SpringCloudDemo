package cn.itcast.product.service;

import cn.itcast.product.entity.Product;

/**
 * @author darren
 * @create 2020-12-25 23:31
 */

public interface ProductService {
    /**
     * 根据Id查询
     */

    Product findById(Long id);
    /**
     * 保存
     */
    void save(Product product);

    /**
     * 更新
     */
    void update(Product product);

    /**
     * 删除
     */
    void delete(Long id);

}
