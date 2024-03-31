package mediasoft.forms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ProductsForm {

    private String category;
    private String name;
    private String description;

    private Double price;
    private Integer quantity;
}
