package main.java.com.douruihan.design.principle.compositionaggregation;

public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
