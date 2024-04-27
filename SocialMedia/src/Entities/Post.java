package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");

    private Date moment;
    private String tittle;
    private String content;
    private Integer likes;

    private List<Comments> comments = new ArrayList<>();

    public Post() {
    }

    public Post(Date moment, String tittle, String content, Integer likes) {
        this.moment = moment;
        this.tittle = tittle;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public String getTittle() {
        return tittle;
    }

    public String getContent() {
        return content;
    }

    public Integer getLikes() {
        return likes;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void  addComment(Comments comment) {
        comments.add(comment);
    }

    public void removeComment(Comments comment) {
        comments.remove(comment);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(tittle + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");
        for (Comments c : comments) {
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
    }
}
