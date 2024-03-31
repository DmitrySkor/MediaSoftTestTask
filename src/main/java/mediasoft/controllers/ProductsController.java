package mediasoft.controllers;

import mediasoft.forms.ProductsForm;
import mediasoft.models.Product;
import mediasoft.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductsController {

    private final ProductsService productsService;

    @Autowired
    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    // ==============================GET handlers here======================\\

    @GetMapping("/products")
    public String getProductsPage(Model model) {
        List<Product> products = productsService.getAllProducts();
        model.addAttribute("products", products);

        return "products";
    }

    @GetMapping("products/add")
    public String getAddProductPage() {

        return "add_product";
    }

    @GetMapping("/products/{product-id}")
    public String getProductPage(@PathVariable("product-id") Integer id, Model model) {
        Product product = productsService.getProduct(id);
        model.addAttribute("product", product);

        return "product";
    }

    // =============================POST handlers here======================\\

    @PostMapping("/products")
    public String addProduct(Product product) {
        productsService.addProduct(product);

        return "redirect:/products";
    }

    @PostMapping("/products/{product-id}/delete")
    public String deleteProduct(@PathVariable("product-id") Integer id) {
        productsService.deleteProduct(id);

        return "redirect:/products";
    }

    @PostMapping("/products/{product-id}/update")
    public String updateProduct(ProductsForm productsForm, @PathVariable("product-id") Integer productId) {
        productsService.updateProduct(productsForm, productId);

        return "redirect:/products/{product-id}";
    }
}
