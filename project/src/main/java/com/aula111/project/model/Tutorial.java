package com.aula111.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tutorial")
public class Tutorial {
    
    @Id
    @Column(name = "t_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "t_name", length = 255, nullable = false)
    private String title;

    @Column(name = "t_description", length = 255, nullable = false)
    private String description;

    @Column(name = "t_published", nullable = false)
    private boolean published;

    public Tutorial(){}

    public Tutorial(String title, String description, boolean published){
        this.title = title;
        this.description = description;
        this.published = published;
    }

    @Override
    public String toString(){
        return "Tutorial\nId: " + id + "\nTitulo: " + title + "\nDescription: " + description + "\nPublicado: " + published + "]";
    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getPublished() {
        return published;
    }
    public void setPublished(boolean published) {
        this.published = published;
    }
}
