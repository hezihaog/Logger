package com.hzh.logger;

import android.app.Application;

import com.hzh.logger.utils.SystemUtil;


/**
 * Created by pengwei08 on 2015/7/16.
 * 日志管理器
 */
public final class L {
    private static Logger logger;

    static {
        logger = new Logger();
    }

    // 允许输出日志
    private static boolean configAllowLog = true;

    // 配置日志Tag前缀
    private static String configTagPrefix = "";

    private L() {
    }

    /**
     * 是否允许输出日志，建议debug是为true
     *
     * @param isAllow 是否允许 true为允许，false为不允许
     */
    public static void configAllowLog(boolean isAllow) {
        configAllowLog = isAllow;
    }

    /**
     * 获取是否允许输出日志
     *
     * @return true为允许，false为不允许
     */
    public static boolean isAllowLog() {
        return configAllowLog;
    }

    /**
     * 设置输出的tag前缀
     *
     * @param tagPrefix 前缀
     */
    public static void configTagPrefix(String tagPrefix) {
        configTagPrefix = tagPrefix;
    }

    /**
     * 获取配置的Tag前缀
     *
     * @return Tag前缀
     */
    public static String getTagPrefix() {
        return configTagPrefix;
    }

    /**
     * verbose输出
     *
     * @param msg
     * @param args
     */
    public static void v(String msg, Object... args) {
        logger.v(SystemUtil.getStackTrace(), msg, args);
    }

    public static void v(Object object) {
        logger.v(SystemUtil.getStackTrace(), object);
    }

    /**
     * debug输出
     *
     * @param msg
     * @param args
     */
    public static void d(String msg, Object... args) {
        logger.d(SystemUtil.getStackTrace(), msg, args);
    }

    public static void d(Object object) {
        logger.d(SystemUtil.getStackTrace(), object);
    }

    /**
     * info输出
     *
     * @param msg
     * @param args
     */
    public static void i(String msg, Object... args) {
        logger.i(SystemUtil.getStackTrace(), msg, args);
    }

    public static void i(Object object) {
        logger.i(SystemUtil.getStackTrace(), object);
    }

    /**
     * warn输出
     *
     * @param msg
     * @param args
     */
    public static void w(String msg, Object... args) {
        logger.w(SystemUtil.getStackTrace(), msg, args);
    }

    public static void w(Object object) {
        logger.w(SystemUtil.getStackTrace(), object);
    }

    /**
     * error输出
     *
     * @param msg
     * @param args
     */
    public static void e(String msg, Object... args) {
        logger.e(SystemUtil.getStackTrace(), msg, args);
    }

    public static void e(Object object) {
        logger.e(SystemUtil.getStackTrace(), object);
    }

    /**
     * assert输出
     *
     * @param msg
     * @param args
     */
    public static void wtf(String msg, Object... args) {
        logger.wtf(SystemUtil.getStackTrace(), msg, args);
    }

    public static void wtf(Object object) {
        logger.wtf(SystemUtil.getStackTrace(), object);
    }

    /**
     * 打印json
     *
     * @param json
     */
    public static void json(String json) {
        logger.json(SystemUtil.getStackTrace(), json);
    }

    /**
     * 监听全局异常
     *
     * @param app
     */
    public static void listenCrash(Application app) {

    }
}
