package com.kakuba.videoapp.dao;

import com.kakuba.videoapp.dao.entity.VideoCasette;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VideoCasetteRepo extends CrudRepository<VideoCasette,Long> {

}
