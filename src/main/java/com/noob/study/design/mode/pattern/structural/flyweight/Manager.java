package com.noob.study.design.mode.pattern.structural.flyweight;

/**
 * @Auther: liuym
 * @Date: 2019/9/16 16:38
 * @Description：
 */
public class Manager implements Employee {
    @Override
    public void report() {
        System.out.println(reportContent);
    }

    private String title="部门经理"; // 内部状态
    private String department; // 外部状态
    private String reportContent; // 外部状态

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
