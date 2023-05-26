package ra.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "Song")
public class songList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nameSong;
    private String artistSong;
    private String kindOfMusic;
    private String urlSong;

    public songList() {
    }

    public songList(long id, String nameSong, String artistSong, String kindOfMusic, String urlSong) {
        this.id = id;
        this.nameSong = nameSong;
        this.artistSong = artistSong;
        this.kindOfMusic = kindOfMusic;
        this.urlSong = urlSong;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getArtistSong() {
        return artistSong;
    }

    public void setArtistSong(String artistSong) {
        this.artistSong = artistSong;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }

    public String getUrlSong() {
        return urlSong;
    }

    public void setUrlSong(String urlSong) {
        this.urlSong = urlSong;
    }

    @Override
    public songList clone() {
        songList songList = new songList();
        songList.setId(id);
        songList.setNameSong(nameSong);
        songList.setArtistSong(artistSong);
        songList.setUrlSong(urlSong);
        return songList;
    }

    @Override
    public String toString() {
        return "songList{" +
                "id=" + id +
                ", nameSong='" + nameSong + '\'' +
                ", artistSong='" + artistSong + '\'' +
                ", kindOfMusic='" + kindOfMusic + '\'' +
                ", urlSong='" + urlSong + '\'' +
                '}';
    }
}
