package hystrix.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Claudio E. de Oliveira on on 06/07/16.
 */
@Controller
@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class HystrixServer extends SpringBootServletInitializer {

    @RequestMapping("/")
    public String home() {
        return "forward:/hystrix";
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HystrixServer.class).web(true);
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(HystrixServer.class).web(true).run(args);
    }

}
