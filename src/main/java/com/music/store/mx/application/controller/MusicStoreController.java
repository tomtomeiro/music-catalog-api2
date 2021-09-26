package com.music.store.mx.application.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.music.store.mx.application.dto.AlbumDto;
import com.music.store.mx.application.dto.SongDto;
import com.music.store.mx.application.service.MusicStoreService;

@RestController
public class MusicStoreController {
  private MusicStoreService musicStoreService;
  
  public MusicStoreController(MusicStoreService musicStoreService) {
    this.musicStoreService =musicStoreService;
  }
  
  @GetMapping(value = "/api/v1/albums",produces ="application")
  public ResponseEntity<List<AlbumDto>> getAlbums(){
    return new ResponseEntity<>(musicStoreService.retrieveAlbum(),HttpStatus.OK);
  }
  
  @GetMapping(value = "/api/v1/songs",produces ="application")
  public ResponseEntity<List<SongDto>> getSong(){
    return new ResponseEntity<>(musicStoreService.retrieveSong(),HttpStatus.OK);
  }
  

}
