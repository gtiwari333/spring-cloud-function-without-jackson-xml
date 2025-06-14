package gt.cloudfunctionjson;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.json.GsonMapper;
import org.springframework.cloud.function.json.JsonMapper;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CloudFunctionJsonApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudFunctionJsonApplication.class, args);
    }


//    @Bean
//    JsonMapper gsonMapper(Gson gson) {
//        return new GsonMapper(gson);
//    }
}
