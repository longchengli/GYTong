package ltd.newbee.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/******
@MapperScan
在mapper接口上添加@Mapper注解，将mapper注入到Spring,但是如果每一给mapper都添加@mapper注解会很麻烦，
这时可以使用@MapperScan注解来扫描包。经测试，@MapperScan注解只会扫描包中的接口，不会扫描类。
 ******/
@MapperScan("ltd.newbee.mall.dao")
@SpringBootApplication
public class NewBeeMallApplication {
    public static void main(String[] args) {
        SpringApplication.run(NewBeeMallApplication.class, args);
    }
}
