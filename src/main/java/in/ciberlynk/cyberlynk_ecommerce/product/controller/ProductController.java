package in.ciberlynk.cyberlynk_ecommerce.product.controller;

import in.ciberlynk.cyberlynk_ecommerce.product.dto.ProductRequestDto;
import in.ciberlynk.cyberlynk_ecommerce.product.model.Product;
import in.ciberlynk.cyberlynk_ecommerce.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;


    @GetMapping(path = "/api/product")
    public ResponseEntity<List<Product>>  getAllProducts() {

        return ResponseEntity.ok(productService.getAllProducts());
    }

    @PostMapping(path = "/api/product")
    public ResponseEntity<String> addProduct(@RequestBody ProductRequestDto productRequestDto) {
        productService.addProduct(productRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body("Product added successfully");
    }

    @GetMapping(path = "/api/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {

       return ResponseEntity.ok(productService.getProductById(id));
    }

    @PutMapping(path = "/api/product/{id}")
    public ResponseEntity<String> updateProductById(@PathVariable Long id, @RequestBody ProductRequestDto productRequestDto) {
        productService.updateProductById(id,productRequestDto);
        return ResponseEntity.ok("Product updated successfully");
    }

    @DeleteMapping(path = "/api/product")
    public ResponseEntity<String> deleteProductById(@PathVariable Long id) {
        productService.deleteProductById(id);
        return ResponseEntity.ok("Product deleted successfully");
    }

}
