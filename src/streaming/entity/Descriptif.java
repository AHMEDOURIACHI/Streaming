package streaming.entity;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author formation
 */

@Embeddable
public class Descriptif {
    
    
    @Column(length = 32,nullable = false)
    private String titre;
    @Column(length = 1024)
    private String description ;
    @Column(nullable = false)
    private int anne;
    @Column(nullable = false)
    private int dure;
    
    
}
