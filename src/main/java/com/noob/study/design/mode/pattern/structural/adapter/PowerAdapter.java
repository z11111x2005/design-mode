package com.noob.study.design.mode.pattern.structural.adapter;

/**
 * @Auther: noob
 * @Date: 2019/9/16 15:07
 * @Description：
 */
public class PowerAdapter implements DC5 {
    private AC220 ac220 = new AC220();

    @Override
    public Integer outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        // 变压器
        int adapterOutput = adapterInput / 44;

        System.out.println("使用PowerAdapter输入AC：" + adapterInput + "V" + "，输出DC：" + adapterOutput);
        return adapterOutput;
    }
}
