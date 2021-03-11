package life.majiang.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommunityApplication {

    public static void main(String[] args) {
        //Spring boot 封装了tomcat服务器
        SpringApplication.run(CommunityApplication.class, args);
    }

}
