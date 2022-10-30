package main.java.com.douruihan.design.principle.compositionaggregation;

public class Test {

    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new MySQLConnection());
        productDao.addProduct();
    }

//    public static void main(String[] args) {
//        ProductDao productDao = new ProductDao();
//        productDao.setDbConnection(new PostgreSQLConnection());
//        productDao.addProduct();
//    }

}
