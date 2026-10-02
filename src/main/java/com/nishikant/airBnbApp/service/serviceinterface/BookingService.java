package com.nishikant.airBnbApp.service.serviceinterface;

import com.nishikant.airBnbApp.dto.BookingDto;
import com.nishikant.airBnbApp.dto.BookingRequest;
import com.nishikant.airBnbApp.dto.GuestDto;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface BookingService {
    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
