package offers.application.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import offers.application.domain.Offer;

/**
 * @author Claudio E. de Oliveira on on 06/07/16.
 */
@RepositoryRestResource(collectionResourceRel = "offers", path = "offers")
public interface OfferRepository extends MongoRepository<Offer, String> {
}
