package com.noob.study.design.mode.pattern.behavioral.memento;

/**
 * @Auther: liuym
 * @Date: 2019/10/24 16:01
 * @Description：备忘录模式
 */
public class Main {
    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();
        Article article = new Article("标题1", "内容1", "图片1");
        ArticleMemento articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);
        System.out.println("标题：" + article.getTitle() + "，内容：" + article.getContent() + "，图片：" + article.getImgs());
        System.out.println("手记完整信息：" + article);

        System.out.println("修改手记start");
        article.setTitle("标题2");
        article.setContent("内容2");
        article.setImgs("图片2");

        System.out.println("修改手记end");
        System.out.println("手记完整信息："+article);

        articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);

        article.setTitle("标题3");
        article.setContent("内容3");
        article.setImgs("图片3");
        System.out.println("暂存回退start");

        System.out.println("回退出栈1次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("回退出栈2次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("暂存回退end");
        System.out.println("手记完整信息："+article);
    }
}
