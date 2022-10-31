package main.java.com.douruihan.design.pattern.creational.singlefactory;

public class VideoFactory {

    /**
     * 简单 工厂初版
     * @param type
     * @return
     */
    public Video getVideo(String type){

        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }

        else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }

        return null;
    }

    /**
     * 使用 反射 生产Video
     * @param c
     * @return
     */
    public Video getVideo(Class c){
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

}
