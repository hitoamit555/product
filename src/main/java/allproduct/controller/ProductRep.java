package allproduct.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import allproduct.controller.product.Product;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRep  extends JpaRepository <Product, Integer>{
   // TODO:

   List<Product> findBySuk(int suk);
   List<Product> findByID(int suk);
   List<Product> findByProd(String product );
   @Query("select suk count(size) from product group by product having count(size) ")
   int findByProdCnt(String product );



}
