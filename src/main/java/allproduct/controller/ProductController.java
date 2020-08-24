package allproduct.controller;

import allproduct.controller.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*This product used in memory data that as we want
        we can clear date evry 2 hours by restart app*/


@RestController
////@Self4j
class ProductController {
    //Rep to
    @Autowired
    ProductRep productRep;

    //Service to count product
    @Autowired
    productService productService;



    @PostMapping("/addProduct")
    public String insertProduct(@RequestBody Product p)
    {
        productRep.save(p);
        //log.info("added into H2 DB")
        return "product has been added into H2 DB";
    }


    @GetMapping("/getAllProduct")
    public List<Product> getAllProduct()
    {
        return productRep.findAll();
    }

    @GetMapping("/getProductBySUK/{suk}")
    public List<Product> getAllProduct1(@PathVariable int suk  )
    {
        System.out.println("all product print:");
        return productRep.findBySuk(suk);
        // return productRep.findByProdCnt(productname);

    }

    @GetMapping("/getProductCnt/{suk}")
    public int getAllProductCnt(@PathVariable int suk  )
    {
        System.out.println("suk:"+suk);
        return productRep.findBySize(suk);
        // return productRep.findByProdCnt(productname);

    }
    @GetMapping("/getProductByColor/{color}")
    public List<Product> getAllProduct1(@PathVariable String color  )
    {
        return productRep.findByColor(color);
        // return productRep.findByProdCnt(productname);

    }

    @GetMapping("/getProductGroupBy/{suk}")
    public List<Product> getGroupBy(@PathVariable int suk  )
    {
        return productRep.findTest1(suk);
        // return productRep.findByProdCnt(productname);

    }




    @GetMapping("/getByProduct/{productname}")
    public List<Product> getAllProduct(@PathVariable String productname  )
    {
        return productRep.findByProductName(productname);
        //return productRep.findBySuk(suk);
    }
    /*
    Count from sql query
     *//*
    @GetMapping("/getProductCnt/{suk})")
    public List<Product> getAllProduct1(@PathVariable int suk  )
    {

        return productRep.findBySuk(suk);
       // return productRep.findByProdCnt(productname);

    }*/

 /*
    Count from java  service
     */

   /* @GetMapping("/getProductCntService/{productname)")
    public List<Product> getAllProduct(@PathVarable String productname  )
    {

        // List<Product> productRep.findByProd(productname);


        return productRep.findByProd(productname);


    }*/
    /*@GetMapping("/getByProdict/{id)")
    public List<Product> getAllProduct(@PathVariable String id  )
    {
        return productRep.findById(id);
    }*/







}
