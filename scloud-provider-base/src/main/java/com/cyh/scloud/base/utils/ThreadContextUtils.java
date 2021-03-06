package com.cyh.scloud.base.utils;

import com.cyh.scloud.base.common.BaseConstants;
import org.apache.logging.log4j.ThreadContext;

/**
 * Author: Huaaaaaa
 * DateTime: 2021/1/21  18:45
 * Description: 线程上下文工具，设置一些线程私有数据
 */
public class ThreadContextUtils {

    public static void setRequestId(String requestId) {
        ThreadContext.put(BaseConstants.HEADER_REQUEST_ID, requestId);
    }

    public static String getRequestId() {
        return ThreadContext.get(BaseConstants.HEADER_REQUEST_ID);
    }

    public static void removeCache(String key) {
        ThreadContext.remove(key);
    }
}
