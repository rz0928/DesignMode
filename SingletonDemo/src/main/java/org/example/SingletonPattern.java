package org.example;

public class SingletonPattern {
    //volatile 用于禁止JVM指令重排
    public static volatile SingletonPattern INSTANCE;
    public static SingletonPattern getINSTANCE(){
        if(INSTANCE == null){
            synchronized (SingletonPattern.class){
                //以下为INSTANCE实例化的代码，此处省略
                if(INSTANCE == null){
                    try{
                        Thread.sleep(1);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    INSTANCE = new SingletonPattern();
                }
            }
        }
        return INSTANCE;
    }
}
