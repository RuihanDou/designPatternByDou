package main.java.com.douruihan.design.principle.dependenceinversion;

public class Geely {

    private ICourse iCourse;
    public Geely(){
    }

    public void setICourse(ICourse iCourse){
        this.iCourse = iCourse;
    }

    public void studyImoocCourse(){
       iCourse.studyCourse();
    }

}
