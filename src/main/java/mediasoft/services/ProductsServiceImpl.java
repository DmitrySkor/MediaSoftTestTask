package mediasoft.services;

import mediasoft.forms.ProductsForm;
import mediasoft.models.Product;
import mediasoft.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Component
public class ProductsServiceImpl implements ProductsService {

    private final ProductsRepository productsRepository;

    @Autowired
    public ProductsServiceImpl(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    public List<Product> getAllProducts() {

        return productsRepository.findAll();
    }

    @Override
    public void addProduct(Product product) {
        product.setDateOfCreation(LocalDate.now());
        product.setDateOfLastQuantityChange(LocalDateTime.now());
        productsRepository.save(product);
    }

    @Override
    public void deleteProduct(UUID id) {
        productsRepository.deleteById(id);
    }

    @Override
    public Product getProduct(UUID id) {

        Product alterProduct = Product.builder()
                .id(UUID.randomUUID())
                .category("Товар не существует")
                .name("Товар не существует")
                .description("Товар не существует")
                .price(0.0)
                .quantity(0)
                .dateOfCreation(LocalDate.now())
                .dateOfLastQuantityChange(LocalDateTime.now())
                .build();

        return productsRepository.findById(id).orElse(alterProduct);
    }

    @Override
    public void updateProduct(ProductsForm productsForm, UUID productId) {
        Product beforeUpdateProduct = getProduct(productId);
        Product afterUpdateProduct = Product.builder()
                .id(productId)
                .category(productsForm.getCategory())
                .name(productsForm.getName())
                .description(productsForm.getDescription())
                .price(productsForm.getPrice())
                .quantity(productsForm.getQuantity())
                .dateOfCreation(beforeUpdateProduct.getDateOfCreation())
                .build();

        if (afterUpdateProduct.getQuantity().equals(beforeUpdateProduct.getQuantity())) {
            afterUpdateProduct.setDateOfLastQuantityChange(beforeUpdateProduct.getDateOfLastQuantityChange());
        } else {
            afterUpdateProduct.setDateOfLastQuantityChange(LocalDateTime.now());
        }
            productsRepository.save(afterUpdateProduct);
    }
}
