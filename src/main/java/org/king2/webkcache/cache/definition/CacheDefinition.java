package org.king2.webkcache.cache.definition;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * =======================================================
 * 说明:  缓存的数据定义
 * <p>
 * 作者		时间					            注释
 *
 * @author 俞烨        19-10-15                         创建
 * =======================================================
 */
public class CacheDefinition {

    // ----------------------------------------------------------------------------------------------------------------
    // 这是一个缓存的定义类
    // 面会存在一些缓存的数据 比如这个缓存是否永久存在  这个缓存是否支持自动消失 是否交给监听器
    // 这个缓存类的类型属于什么 ....
    // ----------------------------------------------------------------------------------------------------------------


    /**
     * 这个代表缓存的数据是否永久存在  如果永久存在则为true 反之false
     * 如果为true 缓存数据将一直存在于缓存中 直到服务器关闭或者使用者自己调用remove()或close方法
     * 如果为false 那么这个缓存数据就会交给监视器去管理 根据使用者配置的时间 动态的回收那些无用的对象
     * <p>
     * TODO 提供close() 和 remove()方法
     */
    public AtomicBoolean isPereExist = new AtomicBoolean();


    /**
     * 缓存原本的数据信息
     */
    public Object object;

    /**
     * 该对象是否交给监视器监听 true 代表交给 false不交
     * 交给监视器监听的话 根据用户配置的多久未使用就自动清理的时间 来动态的回收和存储缓存数据
     */
    public AtomicBoolean isHandTimer = new AtomicBoolean();
}