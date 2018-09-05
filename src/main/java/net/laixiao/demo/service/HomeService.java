package net.laixiao.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.laixiao.demo.entity.City;
import net.laixiao.demo.entity.Hotel;
import net.laixiao.demo.mapper.CityMapper;
import net.laixiao.demo.mapper.HotelMapper;

@Service
public class HomeService {

    @Autowired
    private CityMapper cityMapper;

    @Autowired
    private HotelMapper hotelMapper;

    public List<City> getAllCityList() {
        return cityMapper.selectAll();
    }

    public List<Hotel> getAllHotelList() {
        return hotelMapper.selectAll();
    }
}
