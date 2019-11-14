package cn.wpin.mall.es;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * es服务启动类
 *
 * @author wangpin
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "cn.wpin.mall.es")
@EnableElasticsearchRepositories
public class EsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsApplication.class, args);
    }
}
