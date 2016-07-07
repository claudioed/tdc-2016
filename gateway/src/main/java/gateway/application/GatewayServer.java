package gateway.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Controller;

/**
 * Created by claudio on 07/07/16.
 */
@SpringCloudApplication
@Controller
@EnableZuulProxy
public class GatewayServer implements HealthIndicator {

  public static void main(String[] args) {
    SpringApplication.run(GatewayServer.class, args);
  }

  @Override
  public Health health() {
    return Health.up().build();
  }

}
