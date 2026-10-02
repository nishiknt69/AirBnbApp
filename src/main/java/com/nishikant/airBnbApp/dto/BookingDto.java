package com.nishikant.airBnbApp.dto;

import com.nishikant.airBnbApp.entity.Guest;
import com.nishikant.airBnbApp.entity.Hotel;
import com.nishikant.airBnbApp.entity.Room;
import com.nishikant.airBnbApp.entity.User;
import com.nishikant.airBnbApp.entity.enums.BookingStatus;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Data
public class BookingDto {
    private Long id;

    private Integer roomsCount;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private BookingStatus bookingStatus;

    private Set<GuestDto> guests;
}
