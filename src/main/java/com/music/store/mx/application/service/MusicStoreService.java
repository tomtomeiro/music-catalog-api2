package com.music.store.mx.application.service;

import java.util.List;
import com.music.store.mx.application.dto.AlbumDto;
import com.music.store.mx.application.dto.SongDto;

public interface MusicStoreService {
  List<AlbumDto> retrieveAlbum();
  
  List<SongDto> retrieveSong();
  
  List<SongDto> retrieveSong(Long albumId);
  
  
  
  

}
