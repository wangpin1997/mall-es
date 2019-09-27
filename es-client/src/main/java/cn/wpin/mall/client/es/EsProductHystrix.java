package cn.wpin.mall.client.es;

import cn.wpin.mall.common.entity.CommonPage;
import cn.wpin.mall.common.entity.CommonResult;
import cn.wpin.mall.es.entity.EsProduct;
import cn.wpin.mall.es.entity.EsProductRelatedInfo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wangpin
 */
@Component
public class EsProductHystrix implements EsProductClient {


    @Override
    public CommonResult<Integer> importAllList() {
        return null;
    }

    @Override
    public CommonResult<Object> delete(Long id) {
        return null;
    }

    @Override
    public CommonResult<Object> delete(List<Long> ids) {
        return null;
    }

    @Override
    public CommonResult<EsProduct> create(Long id) {
        return null;
    }

    @Override
    public CommonResult<CommonPage<EsProduct>> search(String keyword, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public CommonResult<CommonPage<EsProduct>> search(String keyword, Long brandId, Long productCategoryId, Integer pageNum, Integer pageSize, Integer sort) {
        return null;
    }

    @Override
    public CommonResult<CommonPage<EsProduct>> recommend(Long id, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public CommonResult<EsProductRelatedInfo> searchRelatedInfo(String keyword) {
        return null;
    }
}
