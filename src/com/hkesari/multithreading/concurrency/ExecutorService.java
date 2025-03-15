package com.hkesari.multithreading.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

class HotelFetcher implements Callable<String> {   //Callable is functional interface.
    private final String hotelProvider;

    public HotelFetcher(String hotelProvider) {
        this.hotelProvider = hotelProvider;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "Available rooms from " + hotelProvider;
    }
}

public class ExecutorService {
    public static void main(String[] args) throws Exception {
        java.util.concurrent.ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> hotelFetchers = Arrays.asList(
                new HotelFetcher("Booking.com"),
                new HotelFetcher("Expedia"),
                new HotelFetcher("Airbnb")
        );

        List<Future<String>> results = executor.invokeAll(hotelFetchers);

        for (Future<String> result : results) {
            System.out.println(result.get());
        }

        executor.shutdown();
    }
}

