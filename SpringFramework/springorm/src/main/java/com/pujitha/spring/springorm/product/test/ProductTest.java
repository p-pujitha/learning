package com.pujitha.spring.springorm.product.test;

import com.pujitha.spring.springorm.entities.Product;
import com.pujitha.spring.springorm.product.dao.ProductDao;
import com.pujitha.spring.springorm.product.daoImpl.ProductDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ProductTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("producttemplate/productdaoconfig.xml");
        ProductDao productDao = (ProductDao) context.getBean("productDaoImpl");

//        Product product = new Product();
//        product.setName("Choclate");
//        product.setDesc("kinder joy");
//        product.setPrice(50.5);
//        productDao.create(product);

//        Product product = new Product();
//        product.setId(1);
//        product.setName("Choclate");
//        product.setDesc("kinder joy");
//        product.setPrice(100.5);
//        productDao.update(product);

//        productDao.delete(product);

//        Product p = productDao.find(1);
//        System.out.println(p);

        List<Product> products = productDao.findAll();
        for (Product product : products) {
            System.out.println(product);
        }


    }
}
