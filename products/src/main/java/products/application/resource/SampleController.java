package products.application.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import products.application.service.SampleService;

/**
 * @author Claudio E. de Oliveira on on 06/07/16.
 */
@RestController
public class SampleController {

  private SampleService sampleService;

  @Autowired
  public SampleController(SampleService sampleService) {
    this.sampleService = sampleService;
  }

  @RequestMapping(value = "/service-information", method = RequestMethod.GET)
  private ResponseEntity<String> info() {
    return new ResponseEntity<String>(this.sampleService.info(), HttpStatus.OK);
  }

}
