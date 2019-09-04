package com.noob.study.design.mode.principle.compositionaggregation;

/**
 * created by noob
 * 2019/9/4 0:52
 */
public class ProductDAO {
    //public class ProductDAO extends DBConnection {
//    public void addProduct() {
//        String connection = super.getConnection();
//        System.out.println("使用" + connection + "增加产品");
//    }
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String connection = dbConnection.getConnection();
        System.out.println("使用" + connection + "增加产品");
    }

}
