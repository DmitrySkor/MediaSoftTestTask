package mediasoft.repositories;

import mediasoft.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductsRepository extends JpaRepository<Product, UUID> {
}
