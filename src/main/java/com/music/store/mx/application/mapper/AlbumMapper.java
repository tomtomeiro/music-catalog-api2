package com.music.store.mx.application.mapper;

import java.util.List;
import com.music.store.mx.application.dto.AlbumDto;
import com.music.store.mx.application.dto.SongDto;
import com.music.store.mx.model.Album;
import com.music.store.mx.model.Song;

public class AlbumMapper {
  
  private AlbumMapper() {
    super();
  }
  
  public static AlbumDto toDto(Album album) {
    return AlbumDto.builder()
        .idAlbum(album.getIdAlbum())
         .title(album.getTitle())
          .release(album.getRelease())
           .recordCompany(album.getRecordCompany())
            .singer(album.getSinger())
             .gender(album.getGender())
              .coverage(album.getCoverage())
               .build();
  }
  
  public static Song toSong(SongDto songDto) {
    return null;
  }
  
  public List<AlbumDto> toAlbumDto(Album album){
    return null;
  }
  
  
}
