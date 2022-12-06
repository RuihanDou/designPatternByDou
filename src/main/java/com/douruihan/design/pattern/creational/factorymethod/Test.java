package main.java.com.douruihan.design.pattern.creational.factorymethod;

public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory1 = new PythonVideoFactory();
        VideoFactory videoFactory2 = new JavaVideoFactory();
        VideoFactory videoFactory3 = new FEVideoFactory();

        Video video = videoFactory1.getVideo();
        Video video1 = videoFactory2.getVideo();
        Video video2 = videoFactory3.getVideo();

        video.produce();
        video1.produce();
        video2.produce();

    }

}
