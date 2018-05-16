package com.xxl.sso.core.store;

import com.xxl.sso.core.conf.Conf;
import com.xxl.sso.core.user.XxlUser;
import com.xxl.sso.core.util.JedisUtil;

/**
 * local login store
 *
 * @author xuxueli 2018-04-02 20:03:11
 */
public class SsoLoginStore {

    /**
     * get
     *
     * @param sessionId
     * @return
     */
    public static XxlUser get(String sessionId) {

        String redisKey = redisKey(sessionId);
        Object objectValue = JedisUtil.getObjectValue(redisKey);
        if (objectValue != null) {
            XxlUser xxlUser = (XxlUser) objectValue;
            return xxlUser;
        }
        return null;
    }

    /**
     * remove
     *
     * @param sessionId
     */
    public static void remove(String sessionId) {
        String redisKey = redisKey(sessionId);
        JedisUtil.del(redisKey);
    }

    /**
     * put
     *
     * @param userName
     * @param xxlUser
     */
    public static void put(String userName, XxlUser xxlUser) {
        String redisKey = redisKey(userName);
        JedisUtil.setObjectValue(redisKey, xxlUser);
    }

    private static String redisKey(String userName){
        return Conf.SSO_USER_NAME.concat("#").concat(userName);
    }

}
