package com.qc.contract.goods.req;

import com.qc.common.PageInfo;
import lombok.Data;

import java.io.Serializable;

/**
 * @author cys
 * @date 2019/9/9
 */
@Data
public class GetSpecRequest implements Serializable {


    private PageInfo page;
    private SearchMap searchMap;





    @Data
    public static class SearchMap implements Serializable {
        /**
         * 规格名称
         */
        private String name;
        /**
         * 规格选型
         */
        private String options;

        /**
         * 模板id
         */
        private Integer templateId;
    }
}
