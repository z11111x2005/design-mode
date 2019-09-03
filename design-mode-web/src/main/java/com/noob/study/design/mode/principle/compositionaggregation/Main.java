package com.noob.study.design.mode.principle.compositionaggregation;

/**
 * created by noob
 * 2019/9/4 0:53
 */
public class Main {
    //    public static void main(String[] args) {
//        ProductDAO productDAO = new ProductDAO();
//        productDAO.addProduct();
//    }
    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();
        productDAO.setDbConnection(new MySQLConnection());
        productDAO.addProduct();

        productDAO.setDbConnection(new PostgreSQLConnection());
        productDAO.addProduct();
    }
}
