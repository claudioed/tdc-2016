package products.application.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author Claudio E. de Oliveira on on 06/07/16.
 */
@Component
@RefreshScope
public class SampleService {

    @Value("${information}")
    private String info;

    public String info(){
        return this.info;
    }

}
