package offers.application.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author Claudio E. de Oliveira on on 06/07/16.
 */
@Data
public class Offer {

    @Id
    private String id;

    private String productId;

    private Double price;

}
