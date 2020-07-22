package com.supraja.epamtask5_Supraja;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class interest {
	
	private static final Logger LOGGER = LogManager.getLogger(interest.class);
		public static void InterestCalculation() {
			Scanner sc = new Scanner(System.in);
			LOGGER.info("Enter the principle ");
			try {
				double amount = sc.nextDouble();
				LOGGER.info("Enter the time period : ");
				double time = sc.nextDouble();
				LOGGER.info("Enter the rate: ");
				double rate = sc.nextDouble();
				LOGGER.info("The simple interest = " +((amount * time * rate) / 100));
				LOGGER.info("The compound interest = " +((amount * Math.pow(1 + (rate / 100), time)) - amount));

			} catch (Exception e) {
			LOGGER.info("Please enter a valid input!");
		
			}
		}
	}