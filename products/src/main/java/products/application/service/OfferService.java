package products.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import products.application.domain.Offer;

/**
 * Created by claudio on 07/07/16.
 */
@Service
public class OfferService {

  @Autowired
  private String offerServiceUrl;

  @Autowired
  private RestTemplate restTemplate;

  public List<Offer> productOffers(String productId) {

    return null;
  }

}
