package cn.wpin.mall.es;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * es服务启动类
 *
 * @author wangpin
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "cn.wpin.mall.es")
public class EsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsApplication.class, args);
    }
}
