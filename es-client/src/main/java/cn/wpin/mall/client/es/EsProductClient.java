package cn.wpin.mall.client.es;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * es对外提供接口
 */
@FeignClient("es")
public interface EsProductClient {
}
