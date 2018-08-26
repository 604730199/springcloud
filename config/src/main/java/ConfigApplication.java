import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by wangzhou on 15/07/2018.
 */

@SpringBootApplication
//开启配置服务器的支持
@EnableConfigServer
//开启作为Eureka Server的客户端支持
@EnableEurekaClient
public class ConfigApplication {

    public static void main(String[] orgs){
        SpringApplication.run(ConfigApplication.class,orgs);
    }
}
