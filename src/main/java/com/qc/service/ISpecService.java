package com.qc.service;

import com.qc.common.BaseQueryResult;
import com.qc.contract.goods.req.GetSpecRequest;
import com.qc.pojo.goods.Spec;

/**
 * @author cys
 * @date 2019/9/9
 */
public interface ISpecService {

    /**
     * 分页查询规格参数
     * @param request
     * @return
     */
    BaseQueryResult<Spec> getSpecByPage(GetSpecRequest request);


    /**
     * 新增规格参数
     * @param spec
     */
    void saveSpec(Spec spec);

    /**
     * 更新
     * @param spec
     */
    void updateSpec(Spec spec);

    /**
     * 删除规格参数
     * @param specId
     */
    void deleteSpecById(Integer specId);

    /**
     * 根据id获取规格参数
     * @param specId
     * @return
     */
    Spec getSpecById(Integer specId);
}
