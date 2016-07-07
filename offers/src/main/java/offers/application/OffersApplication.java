package offers.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author Claudio E. de Oliveira on on 06/07/16.
 */
@EnableHystrix
@SpringCloudApplication
public class OffersApplication implements HealthIndicator {

    @Override
    public Health health() {
        return Health.up().build();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(OffersApplication.class, args);
    }

}
