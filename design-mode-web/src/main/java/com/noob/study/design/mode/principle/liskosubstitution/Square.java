package com.noob.study.design.mode.principle.liskosubstitution;

/**
 * @Auther: liuym
 * @Date: 2019/8/29 10:35
 * @Description：正方形
 */
public class Square extends Rectangle{

    private long sideLength;

    @Override
    public long getLength() {
        return this.getSideLength();
    }

    @Override
    public void setLength(long length) {
        this.setSideLength(length);
    }

    @Override
    public long getWidth() {
        return this.getSideLength();
    }

    @Override
    public void setWidth(long width) {
        this.setSideLength(width);
    }

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }
}
