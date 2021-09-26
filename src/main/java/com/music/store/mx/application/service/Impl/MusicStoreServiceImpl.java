package com.music.store.mx.application.service.Impl;

import java.util.List;
import java.util.stream.Collectors;
import com.music.store.mx.application.dto.AlbumDto;
import com.music.store.mx.application.dto.SongDto;
import com.music.store.mx.application.repository.AlbumRepository;
import com.music.store.mx.application.repository.SongRepository;
import com.music.store.mx.application.service.MusicStoreService;
import com.music.store.mx.application.mapper.AlbumMapper;
import com.music.store.mx.application.mapper.SongMapper;

public class MusicStoreServiceImpl implements MusicStoreService  {
  
  public AlbumRepository albumRepository;
  public SongRepository songRepository;
  
  public MusicStoreServiceImpl(AlbumRepository albumRepository, SongRepository songRepository) {
    this.albumRepository=albumRepository;
    this.songRepository=songRepository;
  }
  @Override
  public List<AlbumDto> retrieveAlbum() {
    return this.albumRepository.findAll()
        .stream()
         .map(AlbumMapper::toDto)
          .collect(Collectors.toList());
  }

  @Override
  public List<SongDto> retrieveSong() {
    return this.songRepository.findAll()
        .stream()
         .map(SongMapper::toDto)
          .collect(Collectors.toList());
  }

  @Override
  public List<SongDto> retrieveSong(Long albumId) {
    return null;
  }

}
