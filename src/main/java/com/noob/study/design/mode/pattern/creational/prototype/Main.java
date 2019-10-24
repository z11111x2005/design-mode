package com.noob.study.design.mode.pattern.creational.prototype;

/**
 * @Auther: noob
 * @Date: 2019/9/11 15:08
 * @Description：
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");

        for(int i=0; i<10; i++){
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名："+i);
            mailTemp.setEmailAddress("姓名"+i+"@qq.com");
            mailTemp.setContent("恭喜您,此次慕课网活动中奖了");
            MailUtil.sendMail(mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
