package com.oa.util;

import java.util.UUID;

/**
 * Created by LHD on 2017/5/31.
 */
public class IdUtils {

    public static String getUUID(){
        return UUID.randomUUID().toString();
    }
}
