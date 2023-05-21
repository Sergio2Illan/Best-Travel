package com.initSeven.best_travel;

import com.initSeven.best_travel.domain.repositories.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
@Slf4j

public class BestTravelApplication implements CommandLineRunner {

	private final FlyRepository flyRepository;
	private final HotelRepository hotelRepository;
	private final TicketRepository ticketRepository;
	private final TourRepository tourRepository;
	private final ReservationRepository reservationRepository;
	private final CustomerRepository customerRepository;

	public BestTravelApplication(FlyRepository flyRepository, HotelRepository hotelRepository, TicketRepository ticketRepository, TourRepository tourRepository, ReservationRepository reservationRepository, CustomerRepository customerRepository) {
		this.flyRepository = flyRepository;
		this.hotelRepository = hotelRepository;
		this.ticketRepository = ticketRepository;
		this.tourRepository = tourRepository;
		this.reservationRepository = reservationRepository;
		this.customerRepository = customerRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BestTravelApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var fly = flyRepository.findById(15L).get();
		var hotel = hotelRepository.findById(7L).get();
		var ticket = ticketRepository.findById(UUID.fromString("12345678-1234-5678-2236-567812345678")).get();

		log.info(String.valueOf(hotel));
		log.info(String.valueOf(fly));
		log.info(String.valueOf(ticket));
	}
}
