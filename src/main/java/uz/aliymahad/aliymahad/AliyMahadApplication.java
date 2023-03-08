package uz.aliymahad.aliymahad;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@OpenAPIDefinition
@SpringBootApplication
@EnableConfigurationProperties({
//        AppProperties.class,
//        OpenApiProperties.class
})
public class AliyMahadApplication {

    public static void main(String[] args) {
        SpringApplication.run(AliyMahadApplication.class, args);
    }

}
