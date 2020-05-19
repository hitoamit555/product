package allproduct.controller;

import allproduct.controller.product.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
/*This product used in memory data that as we want
        we can clear date evry 2 hours by restart app*/



//@RestController
//@Controller
//@ResposeBody

@RestController
@Self4j
class ProductController {
    //Rep to
    @Autowired
    ProductRep productRep;

    //Service to count product
    @Autowired
    productService productService;



    @PostMapping("/addProduct")
    public String insertProduct(Product p)
    {
        productRep.save(p);
        log.info("added into H2 DB")
        return "product has been added into H2 DB";
    }


    @GetMapping("/getProdict")
    public List<Product> getAllProduct()
    {
        return productRep.findAll();
    }


    @GetMapping("/getByProdict/{suk)")
    public int getAllProduct(@PathVarable String suk  )
    {
        return productRep.findBySuk(productname);
    }
    /*
    Count from sql query
     */
    @GetMapping("/getProductCnt/{productname)")
    public List<Product> getAllProduct(@PathVarable String productname  )
    {


        return productRep.findByProdCnt(productname)

    }
 /*
    Count from java  service
     */

    @GetMapping("/getProductCntService/{productname)")
    public List<Product> getAllProduct(@PathVarable String productname  )
    {

        // List<Product> productRep.findByProd(productname);


        return productRep.findByProd(productname);


    }
    @GetMapping("/getByProdict/{id)")
    public List<Product> getAllProduct(@PathVarable String id  )
    {
        return productRep.findById(id);
    }







}
