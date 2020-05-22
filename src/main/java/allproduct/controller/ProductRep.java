package allproduct.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import allproduct.controller.product.Product;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRep extends JpaRepository<Product, Integer> {
    // TODO:

    List<Product> findBySuk(int suk);

    List<Product> findByProductName(String productName);

    List<Product> findByBrand(String brand);
    List<Product> findByColor(String color);
    @Query(value ="select productName, sum(size) as quantity from Product p group by p.suk = :suk",nativeQuery = true)
    List<Product> findTest1(int suk);

   // @Query("select count(size) from Product p group by p.suk = :suk")
   // int findBySize(int suk);

    @Query("select sum(size) from Product p where p.suk = :suk")
    int findBySize(int suk);


}
