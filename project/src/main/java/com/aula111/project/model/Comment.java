package com.aula111.project.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "tb_comment")
public class Comment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "c_content", length = 255, nullable = false)
    private String content;

    //relacionamento de muitos comentarios para um tutorial
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="t_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Tutorial tutorial;

    public Comment(){}

    public long getId() {
        return id;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }

    public Tutorial getTutorial() {
        return tutorial;
    }
    public void setTutorial(Tutorial tutorial) {
        this.tutorial = tutorial;
    }
}
