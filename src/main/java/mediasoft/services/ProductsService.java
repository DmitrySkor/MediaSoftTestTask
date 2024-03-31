package mediasoft.services;

import mediasoft.forms.ProductsForm;
import mediasoft.models.Product;

import java.util.List;

public interface ProductsService {

    List<Product> getAllProducts();

    void addProduct(Product product);

    void deleteProduct(Integer id);

    Product getProduct(Integer id);

    void updateProduct(ProductsForm productsForm, Integer productId);
}
