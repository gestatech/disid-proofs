package com.disid.restful.model;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;

@RooJavaBean
@RooToString
@RooJpaEntity
public class Product {

    /**
     */
    private String name;

    /**
     */
    private String description;

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Category> categories = new HashSet<Category>();
}