package com.kakuba.videoapp.api;

import com.kakuba.videoapp.dao.entity.VideoCasette;
import com.kakuba.videoapp.manager.VideoCasetteManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/Casettes")
public class VideoCasetteApi {

    private VideoCasetteManager videoCasettes;

    @Autowired
    public VideoCasetteApi(VideoCasetteManager videoCasettes) {
        this.videoCasettes = videoCasettes;
    }

    @GetMapping("/All")
    public Iterable<VideoCasette> getAll(){
        return videoCasettes.findAll();
    }

    @GetMapping
    public Optional<VideoCasette> getById(@RequestParam Long index){
        return videoCasettes.findById(index);
    }

    @PostMapping
    public VideoCasette addCasette(@RequestBody VideoCasette videoCasette){
        return videoCasettes.save(videoCasette);
    }

    @PutMapping
    public VideoCasette updateCasette(@RequestBody VideoCasette videoCasette){
        return videoCasettes.save(videoCasette);
    }

    @DeleteMapping
    public void deleteCasette(@RequestParam Long index){
        videoCasettes.deleteById(index);
    }

    public boolean getTrue(){
        return true;
    }
}
