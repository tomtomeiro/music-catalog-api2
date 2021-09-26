package com.music.store.mx.application.mapper;

import java.util.List;
import com.music.store.mx.application.dto.SongDto;
import com.music.store.mx.model.Song;

public class SongMapper {
  
  private SongMapper() {
    super();
  }
  public static SongDto toDto(Song song) {
    return SongDto.builder()
        .songId(song.getSongId())
         .title(song.getTitle())
          .albumId(song.getAlbumId())
           .length(song.getLength())
            .author(song.getAuthor()) 
             .build();
  }
  
  public static Song toSong(SongDto songDto) {
    return null;  
  }
  public List<SongDto> toSongDto(Song song){
    return null;
  }
  

  

}
