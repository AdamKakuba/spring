package com.kakuba.videoapp.manager;


import com.kakuba.videoapp.dao.VideoCasetteRepo;
import com.kakuba.videoapp.dao.entity.VideoCasette;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VideoCasetteManager {

    private VideoCasetteRepo videoCasetteRepo;

    public VideoCasetteManager(VideoCasetteRepo videoCasetteRepo) {
        this.videoCasetteRepo = videoCasetteRepo;
    }

    public  Optional<VideoCasette> findById(Long id){
        return videoCasetteRepo.findById(id);
    }
//zmienione na potrzeby nauki mock'ow
    public List<VideoCasette> findAll() {
        List<VideoCasette> videoCasettes = new ArrayList<>();
        videoCasetteRepo.findAll().iterator().forEachRemaining(videoCasettes::add);

        return videoCasettes;
    }

    public  VideoCasette save(VideoCasette videoCasette) {
        return videoCasetteRepo.save(videoCasette);
    }

    public void deleteById(Long id){
        videoCasetteRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        save(new VideoCasette(1L,"Lsnienie", LocalDate.of(1996,9,28)));
        save(new VideoCasette(2L,"Titanic", LocalDate.of(1989,2,14)));
        save(new VideoCasette(3L,"Star Wars", LocalDate.of(1999,1,4)));
        save(new VideoCasette(4L,"Szklana Pulapka", LocalDate.of(2000,1,19)));
    }

}
