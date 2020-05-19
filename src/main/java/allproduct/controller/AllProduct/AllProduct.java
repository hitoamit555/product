package allproduct.controller.AllProduct;

import allproduct.controller.product.Product;

public interface AllProduct {

     void getStdProduct();
     default Product SpacificProd()
    {
        return new Product();

    }



}
