package com.qc.service;

import com.qc.common.BaseQueryResult;
import com.qc.contract.goods.req.GetTemplateRequest;
import com.qc.pojo.goods.Brand;
import com.qc.pojo.goods.Template;

import java.util.List;

/**
 * @author cys
 * @date 2019/9/5
 */
public interface ITemplateService {
    /**
     * 分页获取所有模板信息
     * @param request
     * @return
     */
    BaseQueryResult<Template> getTemplateByPage(GetTemplateRequest request);

    /**
     * 根据id获取Template
     * @param id
     * @return
     */
    Template getTemplateById(Integer id);

    /**
     * 新增模板
     * @param template
     */
    void saveTemplate(Template template);

    /**
     * 更新模板
     * @param template
     */
    void updateTemplate(Template template);

    /**
     * 根据id删除模板
     * @param templateId
     */
    void deleteTemplateById(Integer templateId);

    /**
     * 查询所有模板页
     * @return
     */
    List<Template> findAll();

}
