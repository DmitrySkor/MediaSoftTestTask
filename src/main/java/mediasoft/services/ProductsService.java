package mediasoft.services;

import mediasoft.forms.ProductsForm;
import mediasoft.models.Product;

import java.util.List;
import java.util.UUID;

public interface ProductsService {

    List<Product> getAllProducts();

    void addProduct(Product product);

    void deleteProduct(UUID id);

    Product getProduct(UUID id);

    void updateProduct(ProductsForm productsForm, UUID productId);
}
