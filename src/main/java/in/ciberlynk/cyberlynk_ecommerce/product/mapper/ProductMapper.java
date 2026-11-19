package in.ciberlynk.cyberlynk_ecommerce.product.mapper;

import in.ciberlynk.cyberlynk_ecommerce.product.dto.ProductRequestDto;
import in.ciberlynk.cyberlynk_ecommerce.product.model.Product;

public class ProductMapper {

    public static Product mapToProduct(ProductRequestDto productRequestDto,Product product) {

        product.setName(productRequestDto.name());
        product.setDescription(productRequestDto.description());
        product.setPrice(productRequestDto.price());
        product.setQuantity(productRequestDto.quantity());
        product.setCategory(productRequestDto.category());
        return product;
    }
}
