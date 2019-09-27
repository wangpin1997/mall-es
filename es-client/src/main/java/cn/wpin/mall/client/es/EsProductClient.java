package cn.wpin.mall.client.es;

import cn.wpin.mall.common.entity.CommonPage;
import cn.wpin.mall.common.entity.CommonResult;
import cn.wpin.mall.es.entity.EsProduct;
import cn.wpin.mall.es.entity.EsProductRelatedInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * es对外提供接口
 * @author wangpin
 */
@FeignClient(value = "es",fallback =EsProductHystrix.class )
public interface EsProductClient {

    /**
     * 导入所有数据库中商品到ES
     */
    @RequestMapping(value = "esProduct/importAll", method = RequestMethod.POST)
    CommonResult<Integer> importAllList();

    /**
     * 根据id删除商品
     */
    @RequestMapping(value = "esProduct/delete/{id}", method = RequestMethod.GET)
    CommonResult<Object> delete(@PathVariable Long id);


    /**
     * 根据id批量删除商品
     */
    @RequestMapping(value = "esProduct/delete/batch", method = RequestMethod.POST)
    CommonResult<Object> delete(@RequestParam("ids") List<Long> ids);

    /**
     * 根据id创建商品
     */
    @RequestMapping(value = "esProduct/create/{id}", method = RequestMethod.POST)
    CommonResult<EsProduct> create(@PathVariable Long id);

    /**
     * 简单搜索
     */
    @RequestMapping(value = "esProduct/search/simple", method = RequestMethod.GET)
    CommonResult<CommonPage<EsProduct>> search(@RequestParam String keyword,
                                               @RequestParam Integer pageNum,
                                               @RequestParam Integer pageSize);


    /**
     * 综合搜索、筛选、排序
     * sort:排序字段:0->按相关度；1->按新品；2->按销量；3->价格从低到高；4->价格从高到低"
     */
    @RequestMapping(value = "esProduct/search", method = RequestMethod.GET)
    CommonResult<CommonPage<EsProduct>> search(@RequestParam String keyword,
                                               @RequestParam Long brandId,
                                               @RequestParam Long productCategoryId,
                                               @RequestParam Integer pageNum,
                                               @RequestParam Integer pageSize,
                                               @RequestParam Integer sort);

    /**
     * 根据商品id推荐商品
     */
    @RequestMapping(value = "esProduct/recommend/{id}", method = RequestMethod.GET)
    CommonResult<CommonPage<EsProduct>> recommend(@PathVariable Long id,
                                                  @RequestParam Integer pageNum,
                                                  @RequestParam Integer pageSize);

    /**
     * 获取搜索的相关品牌、分类及筛选属性
     */
    @RequestMapping(value = "esProduct/search/relate", method = RequestMethod.GET)
    CommonResult<EsProductRelatedInfo> searchRelatedInfo(@RequestParam String keyword);
}
