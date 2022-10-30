package main.java.com.douruihan.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class Boss {

    public void commandCheckNumbers(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourse();
    }

}
