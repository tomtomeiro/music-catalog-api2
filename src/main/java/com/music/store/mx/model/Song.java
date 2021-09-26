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
@Table(name= "Cancion")
public class Song {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="idCancion", nullable = false, length = 11 )
  private Long songId;
  
  @Column(name= "titulo", nullable = false, length=45)
  private String title;
  
  @Column(name= "idAlbum", nullable = false, length=11)
  private Long albumId;
  
  @Column(name= "autor", nullable = true, length=45)
  private String author;
  
  @Column(name= "duracion", nullable = false)
  private Float length;
}
