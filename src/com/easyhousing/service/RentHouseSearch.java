package com.easyhousing.service;

import java.util.List;

import com.easyhousing.model.RentHouse;

public interface RentHouseSearch {
	public List<RentHouse> searchRentHouse(String Address, int lowPrice, int highPrice, int lowRoomNum, int highRoomNum);
	public RentHouse searchRentHouseById(int id);
}