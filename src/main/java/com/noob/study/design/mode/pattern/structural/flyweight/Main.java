package com.noob.study.design.mode.pattern.structural.flyweight;

/**
 * @Auther: liuym
 * @Date: 2019/9/16 16:43
 * @Description：
 */
public class Main {
    private static final String departments[] = {"开发部", "人事部", "财务部", "销售部"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
