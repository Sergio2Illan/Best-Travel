package com.initSeven.best_travel.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "reservation")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ReservationEntity implements Serializable {

    @Id
    private UUID id;

    @Column(name = "date_reservation")
    private LocalDateTime dateTimeReservation;

    private LocalDate dateStart;
    private LocalDate dateEnd;
    private Integer totalDays;
    private BigDecimal price;
    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private HotelEntity hotel;
    @ManyToOne
    @JoinColumn(name = "tour_id", nullable = true) //puede tener una reserva o un ticket pero no los dos a la vez por unidad
    private TourEntity tour;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;


}
