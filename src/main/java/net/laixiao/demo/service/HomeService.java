package net.laixiao.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.laixiao.demo.dao.CityDao;
import net.laixiao.demo.entity.City;

@Service
public class HomeService {

	@Autowired
	private CityDao cityDao;

	public List<City> getAllCityList() {
		return cityDao.selectAll();
	}
}
