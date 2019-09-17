package com.qc.contract.goods.req;

import com.qc.common.PageInfo;
import lombok.Data;

import java.io.Serializable;

/**
 * @author cys
 * @date 2019/8/26
 */
@Data
public class GetTemplateRequest implements Serializable {

    /**
     * page : {"currentPage":1,"pageSize":10,"orderBy":"id desc"}
     * search : {"name":"华为","letter":"h"}
     */

    private PageInfo page;
    private SearchMap searchMap;





    @Data
    public static class SearchMap implements Serializable {
        private String name;
    }
}
