package com.hmdp.utils;

public interface ILock {

    /*
     * 尝试获取锁，，单单次获取，不采用堵塞策略
     *
     * */
    boolean tryLock(long timeoutSec);

    //   释放锁
    void unLock();
}
