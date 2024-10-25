package org.example.ejbserver.entities;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CD {

    @Id
    private Long id;
    private String title;
    private String author;
    private boolean isBorrowed;

}

