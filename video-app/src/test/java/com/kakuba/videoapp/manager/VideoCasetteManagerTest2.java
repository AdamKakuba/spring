package com.kakuba.videoapp.manager;


import com.kakuba.videoapp.dao.VideoCasetteRepo;
import com.kakuba.videoapp.dao.entity.VideoCasette;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class VideoCasetteManagerTest2 {

    @Mock
    VideoCasetteRepo videoCasetteRepo;

    @InjectMocks
    VideoCasetteManager videoCasetteManager;


    @Before
    public void init() {
        given(videoCasetteRepo.findAll()).willReturn(prepareMockData());
    }



    @Test
    public void getAll_Video_Casettes() {
        List<VideoCasette> videoCasettes = videoCasetteManager.findAll();

        //then
        Assert.assertThat(videoCasettes, Matchers.hasSize(4));

    }

/*
    @Test
    public void save_Video_Casette() {
        //given
        VideoCasetteManager videoCasetteManager = mock(VideoCasetteManager.class);
        Mockito.when(videoCasetteManager.save(Mockito.any(VideoCasette.class))).thenReturn(new VideoCasette(5L,"Lord of the Rings", LocalDate.of(2005,7,23)));
        //when
        VideoCasette videoCasette = videoCasetteManager.save(new VideoCasette());
        //then
        Assert.assertEquals(videoCasette.getTitle(),"Lord of the Rings");


    }
*/
    private List<VideoCasette> prepareMockData(){
        List<VideoCasette> videoCasettes= new ArrayList<>();
        videoCasettes.add(new VideoCasette(1L,"Lsnienie", LocalDate.of(1996,9,28)));
        videoCasettes.add(new VideoCasette(2L,"Titanic", LocalDate.of(1989,2,14)));
        videoCasettes.add(new VideoCasette(3L,"Star Wars", LocalDate.of(1999,1,4)));
        videoCasettes.add(new VideoCasette(4L,"Szklana Pulapka", LocalDate.of(2000,1,19)));

        return videoCasettes;
    }

}
