package products.application.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import products.application.domain.Product;

/**
 * @author Claudio E. de Oliveira on on 06/07/16.
 */
@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepository extends MongoRepository<Product, String> {
}
