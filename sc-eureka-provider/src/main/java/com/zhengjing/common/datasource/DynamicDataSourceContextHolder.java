package com.zhengjing.common.datasource;

import java.util.ArrayList;
import java.util.List;

public class DynamicDataSourceContextHolder {

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    public static List<String> dataSourceIds = new ArrayList<>();

    public static void setDataSourceType(String dataSourceType) {
        contextHolder.set(dataSourceType);
    }

    public static String getDataSourceType() {
        return contextHolder.get();
    }

    public static void clearDataSourceType() {
        contextHolder.remove();
    }

    /** 
     * @Description 判断指定DataSrouce当前是否存在
     * @author 郑静
     * @param dataSourceId
     * @return  
     */
    @SuppressWarnings("unlikely-arg-type")
    public static boolean containsDataSource(String dataSourceId) {
        if(contextHolder.equals(dataSourceId))
            return true;
        return dataSourceIds.contains(dataSourceId);
    }
}
