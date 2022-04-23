package main.java.com.douruihan.design.principle.dependenceinversion;

public class FECourse implements ICourse{

    @Override
    public void studyCourse() {
        System.out.println("Geely在学习FE课程");
    }
}
