package com.qc.contract.goods.req;

import com.qc.common.PageInfo;
import lombok.Data;

import java.io.Serializable;

/**
 * @author cys
 * @date 2019/8/26
 */
@Data
public class GetBrandRequest implements Serializable {

    /**
     * page : {"currentPage":1,"pageSize":10,"orderBy":"id desc"}
     * search : {"name":"华为","letter":"h"}
     */

    private PageInfo page;
    private SearchBean search;





    @Data
    public static class SearchBean implements Serializable {
        /**
         * name : 华为
         * letter : h
         */

        private String name;
        private String letter;

    }
}
