package com.jw.Utils;

import java.util.UUID;

public class UUIDUtils {

    /**
     * 返回去除“-”的32位UUID
     * @return
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
