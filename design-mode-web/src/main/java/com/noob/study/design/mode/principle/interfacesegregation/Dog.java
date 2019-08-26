package com.noob.study.design.mode.principle.interfacesegregation;

/**
 * created by noob
 * 2019/8/26 22:53
 */
// v1
//public class Dog implements IAnimalAction{
public class Dog implements IEatAnimalAction,ISwimAnimalAction{
    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
    // v1
//    @Override
//    public void eat() {
//
//    }
//
//    @Override
//    public void fly() {
//
//    }
//
//    @Override
//    public void swim() {
//
//    }

    // v2

}
