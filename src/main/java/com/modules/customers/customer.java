package com.modules.customers;

import com.modules.scheduling.Scheduler;

public class customer {

    public static void main(String[] args) {

        Scheduler scheduler = new Scheduler();
        scheduler.bookHaircut("Harry","Monday");
        scheduler.bookHaircut("Jill", "Friday");
    }
}
