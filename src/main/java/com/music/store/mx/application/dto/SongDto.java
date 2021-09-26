package com.music.store.mx.application.dto;

import com.music.store.mx.model.Album;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class SongDto {

  private Long songId;
  private String title;
  private Long albumId;
  private String author;
  private Float length;
}
