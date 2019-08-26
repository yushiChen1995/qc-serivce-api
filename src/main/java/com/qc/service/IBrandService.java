package com.qc.service;

import com.qc.common.BaseQueryResult;
import com.qc.common.PageInfo;
import com.qc.contract.goods.req.GetBrandRequest;
import com.qc.pojo.goods.Brand;

import java.util.List;
import java.util.Map;

/**
 * @author cys
 * @date 2019/8/21
 */
public interface IBrandService {
    /**
     * 查询所有品牌
     * @return
     */
    List<Brand> getAllBrand();

    /**
     * 分页查询所有品牌
     * @param pageInfo
     * @return
     */
    BaseQueryResult<Brand> getAllBrandByPage(PageInfo pageInfo);

    /**
     * 条件查询品牌
     *
     * @param
     * @return
     */
    BaseQueryResult<Brand> getBrandByCondition(GetBrandRequest request);
}
