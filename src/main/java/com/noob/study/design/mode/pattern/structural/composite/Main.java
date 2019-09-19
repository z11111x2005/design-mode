package com.noob.study.design.mode.pattern.structural.composite;

/**
 * created by noob
 * 2019/9/19 23:59
 * 组合模式
 */
public class Main {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程", 11);
        CatalogComponent windowsCourse = new Course("Widows课程", 12);

        CatalogComponent javaCourseCatalog = new CourseCatalog("java课程目录", 2);
        CatalogComponent springCourseCatalog = new Course("spring课程", 55);
        CatalogComponent springBootCourseCatalog = new Course("springBoot课程", 66);
        CatalogComponent springCloudCourseCatalog = new Course("springCloud课程", 77);
        javaCourseCatalog.add(springCourseCatalog);
        javaCourseCatalog.add(springBootCourseCatalog);
        javaCourseCatalog.add(springCloudCourseCatalog);

        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("慕课网主目录", 1);
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        imoocMainCourseCatalog.print();

    }
}
