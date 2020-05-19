package allproduct.controller.AllProduct;

import allproduct.controller.product.Product;

public class Standardproduct implements AllProduct {
    @Override
    public void getStdProduct() {

    }

    @Override
    public Product SpacificProd() {
        return new Product();
    }
}
