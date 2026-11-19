package in.ciberlynk.cyberlynk_ecommerce.product.repository;

import in.ciberlynk.cyberlynk_ecommerce.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
