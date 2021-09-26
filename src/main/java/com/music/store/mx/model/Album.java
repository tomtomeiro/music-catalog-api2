package com.music.store.mx.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name= "Album")
public class Album {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="idCancion", nullable = false, length = 11 )
  private Long idAlbum;
  
  @Column(name= "titulo", nullable = false, length=45)
  private String title;
  
  @Column(name= "lanzamiento", nullable = false)
  private String release;
  
  @Column(name= "disquera", nullable = false, length=45)
  private String recordCompany;
  
  @Column(name= "cantante", nullable = false, length=45)
  private String singer;
  
  @Column(name= "genero", nullable = false, length=45)
  private String gender;
  
  @Column(name= "cobertura", nullable = false, length=250)
  private String coverage;

}
