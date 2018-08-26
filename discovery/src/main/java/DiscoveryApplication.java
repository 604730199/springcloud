import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by wangzhou on 15/07/2018.
 */

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {

    public static void main(String[] orgs){
        SpringApplication.run(DiscoveryApplication.class,orgs);
    }
}
