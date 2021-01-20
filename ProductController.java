ge com.example.Product;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;


    @RequestMapping(value = "/products", method = RequestMethod.GET)
    @ResponseBody
    Iterable<Product> getAllProducts(){

    //String productName, String city, int modelNumber, int productPrice

       /* Product details = new Product("5 Star","Ahmedabad",3456, 100);
        List<Product> productList = new ArrayList<>();
        productList.add(details);
        return productList;*/

         return productRepository.findAll();

    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    @ResponseBody

    Product createProduct(@RequestBody Product product){
        return  productRepository.save(product);
    }



    @RequestMapping(value = "/products", method = RequestMethod.DELETE)
    @ResponseBody
    String deleteProduct(@RequestBody Product product) {
        productRepository.delete(product);
        return "product " + product.getProductName() + " Deleted";
    }







}
