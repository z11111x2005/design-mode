package com.noob.study.design.mode.principle.liskosubstitution;

/**
 * @Auther: liuym
 * @Date: 2019/8/29 10:38
 * @Description：
 */
public class Main {

//    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        rectangle.setWidth(10);
//        rectangle.setLength(20);
//        resize(rectangle);
//    }

    public static void main(String[] args) {
        Square square = new Square();
        square.setSideLength(10);
        resize(square);
    }

    private static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() < rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("长方形的宽:" + rectangle.getWidth() + ",长方形的长:" + rectangle.getLength());
        }
        System.out.println("最终结果 长方形的宽:" + rectangle.getWidth() + ",长方形的长:" + rectangle.getLength());
    }
}
