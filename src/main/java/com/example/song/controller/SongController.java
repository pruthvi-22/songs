package com.example.song.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.song.model.Song;
import com.example.song.service.SongH2Service;

@RestController
public class SongController {
    @Autowired
    public SongH2Service songService;

    @GetMapping("/songs")
    public List<Song> getAllSongs() {
        return songService.getAllSongs();
    }

    @GetMapping("/songs/{songId}")
    public Song getSongById(@PathVariable int songId) {
        return songService.getSongById(songId);
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song) {
        return songService.addSong(song);
    }

    @PutMapping("/songs/{songId}")
    public Song updateSong(@PathVariable int songId, @RequestBody Song song) {
        return songService.updateSong(songId, song);
    }

    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable int songId) {
        songService.deleteSong(songId);
    }
}
