package com.nishikant.airBnbApp.dto;

import com.nishikant.airBnbApp.entity.Booking;
import com.nishikant.airBnbApp.entity.User;
import com.nishikant.airBnbApp.entity.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuestDto {
    private Long id;

    private User user;

    private String name;

    private Gender gender;

    private Integer age;

    private Set<Booking> booking;
}
