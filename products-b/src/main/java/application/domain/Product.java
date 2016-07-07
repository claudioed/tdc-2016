package application.domain;

import org.springframework.data.annotation.Id;

import lombok.Data;

/**
 * @author Claudio E. de Oliveira on on 06/07/16.
 */
@Data
public class Product {

    @Id
    private String id;

    private String name;

    private String description;

    private Category category;

}
