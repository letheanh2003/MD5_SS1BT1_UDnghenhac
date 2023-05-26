package ra.model.service;

import ra.model.entity.songList;

import java.util.List;

public interface ISongService {
    List<songList> findAll();

    songList findById(Long id);

    void deleteById(Long id);

    void save(songList song);
}
