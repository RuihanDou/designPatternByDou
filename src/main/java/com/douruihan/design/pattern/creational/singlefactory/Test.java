package main.java.com.douruihan.design.pattern.creational.singlefactory;

public class Test {
    public static void main(String[] args) {
//        // 没有使用简单工厂
//        Video video = new JavaVideo();
//        video.produce();
//        Video video1 = new PythonVideo();
//        video1.produce();

//        // 使用简单工厂
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if(video == null){
//            return;
//        }
//        video.produce();

        // 使用反射，简单工厂
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(video == null){
            return;
        }
        video.produce();

    }
}
