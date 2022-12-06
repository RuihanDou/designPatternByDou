package main.java.com.douruihan.design.pattern.creational.factorymethod;

public class PythonVideoFactory extends VideoFactory{


    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
