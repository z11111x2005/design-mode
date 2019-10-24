package com.noob.study.design.mode.pattern.behavioral.memento;

/**
 * @Auther: noob
 * @Date: 2019/10/24 16:00
 * @Description：
 */
public class Article {

    private String title;
    private String content;
    private String imgs;

    public Article(String title, String content, String imgs) {
        this.title = title;
        this.content = content;
        this.imgs = imgs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public ArticleMemento saveToMemento(){
        ArticleMemento articleMemento = new ArticleMemento(this.title, this.content, this.imgs);
        return articleMemento;
    }

    public void undoFromMemento(ArticleMemento articleMemento){
        this.title = articleMemento.getTitle();
        this.content = articleMemento.getContent();
        this.imgs = articleMemento.getImgs();
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", imgs='" + imgs + '\'' +
                '}';
    }
}
