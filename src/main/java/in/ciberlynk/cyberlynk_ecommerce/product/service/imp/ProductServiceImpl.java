package in.ciberlynk.cyberlynk_ecommerce.product.service.imp;

import in.ciberlynk.cyberlynk_ecommerce.product.dto.ProductRequestDto;
import in.ciberlynk.cyberlynk_ecommerce.product.mapper.ProductMapper;
import in.ciberlynk.cyberlynk_ecommerce.product.model.Product;
import in.ciberlynk.cyberlynk_ecommerce.product.repository.ProductRepository;
import in.ciberlynk.cyberlynk_ecommerce.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;


    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void addProduct(ProductRequestDto productRequestDto) {

        productRepository.save(ProductMapper.mapToProduct(productRequestDto,new Product()));

    }
}
