package main.java.com.douruihan.design.principle.singleresponsibility;

public class Method {
    private void updateUserInfo(String userName, String address){
        userName = "geely";
        address = "beijing";
    }

    private void updateUserInfo(String userName, String... properties){
        userName = "geely";
//        address = "beijing";
    }

    // 单一职责
    private void updateUserName(String userName){
        userName = "geely";
    }

    // 单一职责
    private void updateUserAddress(String address){
        address = "beijing";
    }

    // 不符合单一职责
    private void updateUserInfo(String userName, String address, boolean bool){
        if(bool){
            // todo something1
        }
        else {
            // todo something2
        }
        userName = "geely";
        address = "beijing";
    }

}
