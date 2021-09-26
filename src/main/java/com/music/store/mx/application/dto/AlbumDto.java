package com.music.store.mx.application.dto;

import java.sql.Date;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Builder
public class AlbumDto {
  
  private Long idAlbum;
  private String title;
  private String release;
  private String recordCompany;
  private String singer;
  private String gender;
  private String coverage;
}
