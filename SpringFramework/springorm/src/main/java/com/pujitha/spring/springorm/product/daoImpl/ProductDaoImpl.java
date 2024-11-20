package com.pujitha.spring.springorm.product.daoImpl;

import com.pujitha.spring.springorm.entities.Product;
import com.pujitha.spring.springorm.product.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ProductDaoImpl implements ProductDao {

    @Autowired
    HibernateTemplate hibernateTemplate;

    @Override
    @Transactional
    public int create(Product product) {
        Integer result = (Integer) hibernateTemplate.save(product);
        return result;
    }

    @Override
    @Transactional
    public void update(Product product) {
        hibernateTemplate.update(product);

    }

    @Override
    @Transactional
    public void delete(Product product) {
        hibernateTemplate.delete(product);
    }

    @Override
    @Transactional
    public Product find(int id) {
        Product product = hibernateTemplate.get(Product.class, id);
        return product;
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = hibernateTemplate.loadAll(Product.class);
        return products;

    }
}
