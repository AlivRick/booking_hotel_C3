package com.example.hotel_booking_be_v1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RevenueForHotel {
    private Long hotelId;
    private String hotelName;
    private List<MonthlyRevenue> monthlyRevenues;
}
