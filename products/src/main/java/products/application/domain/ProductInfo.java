package products.application.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * @author Claudio E. de Oliveira on on 06/07/16.
 */
@Data
public class ProductInfo {

    private String name;

    private String description;

    private List<Offer> offers = new ArrayList<>();

}
