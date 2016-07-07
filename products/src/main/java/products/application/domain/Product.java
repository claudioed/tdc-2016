package products.application.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author Claudio E. de Oliveira on on 06/07/16.
 */
@Data
public class Product {

    @Id
    private String id;

    private String name;

    private String description;

}
