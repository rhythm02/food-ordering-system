package com.assignment.foodOrderingSystem.service;

import com.assignment.foodOrderingSystem.model.Hotel;

import java.util.ArrayList;
import java.util.List;

public class ManageHotels implements Manage {
    List<Hotel> hotelList;

    ManageHotels() {
        this.hotelList = new ArrayList<Hotel>();
    }

    @Override
    public void addHotel(Hotel hotel) {
        hotelList.add(hotel);
    }

    @Override
    public void removeHotel(Hotel hotel) {
        hotelList.remove(hotel);
    }
}
