package com.xxl.sso.core.conf;

import com.xxl.sso.core.entity.ReturnT;

/**
 * conf
 *
 * @author xuxueli 2018-04-02 19:18:04
 */
public class Conf {

    /**
     * redirect url, for client
     */
    public static final String REDIRECT_URL = "redirect_url";

    /**
     * sso sessionid, between browser and sso-server
     */
    public static final String SSO_SESSIONID = "oa_sso_sessionid";
    public static final String SSO_TOKEN = "oa_sso_token";
    public static final String SSO_USER = "oa_sso_user";
    public static final String SSO_USER_NAME = "oa_sso_user_name";


    /**
     * sso server address
     */
    public static final String SSO_SERVER = "sso_server";

    /**
     * login url
     */
    public static final String SSO_LOGIN = "/login";
    /**
     * logout url
     */
    public static final String SSO_LOGOUT = "/logout";



    /**
     * filter logout path
     */
    public static final String SSO_LOGOUT_PATH = "logoutPath";

    public static final ReturnT<String> SSO_LOGIN_FAIL_RESULT = new ReturnT(501, "sso not login.");


}
