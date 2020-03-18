package com.kyo.questionweb.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Question {
    private int id;
    private String title;
    private String context;
    private String professor;
    private String type;
    private String tag;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Timestamp deleteTime;
    private String due;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "context")
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Basic
    @Column(name = "professor")
    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "tag")
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "delete_time")
    public Timestamp getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Timestamp deleteTime) {
        this.deleteTime = deleteTime;
    }

    @Basic
    @Column(name = "due")
    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return id == question.id &&
                Objects.equals(title, question.title) &&
                Objects.equals(context, question.context) &&
                Objects.equals(professor, question.professor) &&
                Objects.equals(type, question.type) &&
                Objects.equals(tag, question.tag) &&
                Objects.equals(createTime, question.createTime) &&
                Objects.equals(updateTime, question.updateTime) &&
                Objects.equals(deleteTime, question.deleteTime) &&
                Objects.equals(due, question.due);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, context, professor, type, tag, createTime, updateTime, deleteTime, due);
    }
}
