package in.ciberlynk.cyberlynk_ecommerce.product.dto;


public record ProductRequestDto (
         String name,
         String description,
         Double price,
         int quantity,
         String category
){
}
