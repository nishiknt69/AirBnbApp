package com.nishikant.airBnbApp.service.serviceinterface;

import com.nishikant.airBnbApp.dto.HotelDto;
import com.nishikant.airBnbApp.dto.HotelPriceDto;
import com.nishikant.airBnbApp.dto.HotelSearchRequest;
import com.nishikant.airBnbApp.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
