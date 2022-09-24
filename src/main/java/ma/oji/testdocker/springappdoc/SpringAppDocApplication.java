package ma.oji.testdocker.springappdoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class SpringAppDocApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAppDocApplication.class, args);
    }

    @GetMapping(path = "/")
    public Map<String,Object> firstTest(){
        Map<String,Object> map=new HashMap<>();
        map.put("name","Salah Eddine");
        map.put("message","Spring Test from oji sama");
        map.put("age",23);
        return map;
    }
}
