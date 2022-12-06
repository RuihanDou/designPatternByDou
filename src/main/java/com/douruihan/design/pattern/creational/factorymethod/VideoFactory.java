package main.java.com.douruihan.design.pattern.creational.factorymethod;

public abstract class VideoFactory {

    // 实际业务场景中，VideoFactory类对于默写属性是已知的，所以interface没有 abstract 类更有效
    public abstract Video getVideo();

}
