package discovery.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Claudio E. de Oliveira on on 06/07/16.
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServer implements HealthIndicator {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServer.class, args);
    }

    @Override
    public Health health() {
        return Health.up().build();
    }

}