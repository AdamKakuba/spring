package com.kakuba.videoapp;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class VideoCasetteSorterTest {

    @Spy
    VideoCasetteSorter videoCasetteSorter;

    @Before
    public void getDataFromApi() {
        given(videoCasetteSorter.getDataFromApi()).willReturn(prepareMockData());
    }

    private String[] prepareMockData() {
        String[] films =  {"Star Trek","Hobbit","Deadpool","Batman"};
        return films;
    }

    @Test
    public void sortDataFromApi() {
        String[] sorted =  {"Batman","Deadpool","Hobbit","Star Trek"};
        assertArrayEquals(sorted,videoCasetteSorter.sortDataFromApi());

    }

}
