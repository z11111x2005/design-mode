package com.noob.study.design.mode.pattern.behavioral.iterator;

/**
 * created by noob
 * 2019/10/23 23:55
 * 迭代器模式
 */
public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("java电商一期");
        Course course2 = new Course("java电商二期");
        Course course3 = new Course("java设计模式");
        Course course4 = new Course("python课程");
        Course course5 = new Course("算法课程");
        Course course6 = new Course("前端课程");

        CourseAggregate courseAggregate = new CourseAggregateImpl();

        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);
        courseAggregate.addCourse(course6);

        System.out.println("课程列表");
        printCourses(courseAggregate);

        courseAggregate.removeCourse(course4);
        courseAggregate.removeCourse(course5);

        System.out.println("删除操作之后的课程列表");
        printCourses(courseAggregate);
    }

    private static void printCourses(CourseAggregate courseAggregate){
        CourseIterator courseIterator = courseAggregate.getCourseIterator();
        while (!courseIterator.isLastCourse()){
            Course course = courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }
}
