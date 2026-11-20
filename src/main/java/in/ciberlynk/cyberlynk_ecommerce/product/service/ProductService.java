package in.ciberlynk.cyberlynk_ecommerce.product.service;

import in.ciberlynk.cyberlynk_ecommerce.product.dto.ProductRequestDto;
import in.ciberlynk.cyberlynk_ecommerce.product.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    void addProduct(ProductRequestDto productRequestDto);

    Product getProductById(Long id);

    void updateProductById(Long id, ProductRequestDto productRequestDto);

    void deleteProductById(Long id);
}
