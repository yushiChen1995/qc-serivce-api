package com.qc.service;

import com.qc.common.BaseQueryResult;
import com.qc.contract.goods.req.GetParaRequest;
import com.qc.contract.goods.req.GetSpecRequest;
import com.qc.pojo.goods.Para;
import com.qc.pojo.goods.Spec;

/**
 * @author cys
 * @date 2019/9/9
 */
public interface IParaService {

    /**
     * 分页查询参数
     * @param request
     * @return
     */
    BaseQueryResult<Para> getParaByPage(GetParaRequest request);


    /**
     * 新增参数
     * @param para
     */
    void savePara(Para para);

    /**
     * 更新参数
     * @param para
     */
    void updatePara(Para para);

    /**
     * 删除参数
     * @param paraId
     */
    void deleteParaById(Integer paraId);

    /**
     * 根据id获取参数
     * @param paraId
     * @return
     */
    Para getParaById(Integer paraId);
}
