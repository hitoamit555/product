package allproduct.controller;

import allproduct.controller.product.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productService {


    int getProductCounnt(List<Product> product)
    {

        int cnt;
      return   cnt=(int)product.stream().count();
      //TODO by size

    }
    int getProductGroupBy(List<Product> product)
    {

        int cnt;
        return   cnt=(int)product.stream().count();
        //TODO by size

    }
}
