package com.music.store.mx.application.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.music.store.mx.model.Song;

public interface SongRepository extends JpaRepository<Song,Long>{
  List<Song> findAll();
  List<Song> findByAuthor(String author);
}
