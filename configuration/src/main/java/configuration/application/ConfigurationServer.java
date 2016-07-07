package configuration.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Claudio E. de Oliveira on on 06/07/16.
 */

@EnableConfigServer
@SpringCloudApplication
public class ConfigurationServer {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationServer.class, args);
    }

}
