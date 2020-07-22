package com.supraja.epamtask5_Supraja;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class construction {
	private static final Logger LOGGER = LogManager.getLogger(interest.class);
	public static void Cost() {
		int ch;
		float area;
		float cost;
		Scanner sc = new Scanner(System.in);
		PrintStream p = new PrintStream(new FileOutputStream(FileDescriptor.out));
			LOGGER.info("Construction cost Quotation ");
			LOGGER.info("The materials available are ");
			LOGGER.info("1.Standard materials");
			LOGGER.info("2.Above standard material");
			LOGGER.info("3.High Standard materials");
			LOGGER.info("4.High standard material and fully automated");
			LOGGER.info("enter an option");
			ch = sc.nextInt();
			try{
				LOGGER.info("What is the area of the house? ");
				area = sc.nextInt();
			switch(ch){
			case 1:
				LOGGER.info("You have selected Standard materials!!");
				LOGGER.info("The cost estimation is " + (area * 1200) + "INR");
				break;
			case 2:
				LOGGER.info("Above standard material");
				LOGGER.info("The cost estimation is " + (area * 1500) + "INR");
				break;
			case 3:
				LOGGER.info("High Standard materials");
				LOGGER.info("The cost estimation is " + (area * 1800) + "INR");
				break;
			case 4:
				LOGGER.info("High standard material and fully automated");
				LOGGER.info("The cost estimation is " + (area * 2500) + "INR");
				break;
			default:
				LOGGER.info("Please enter a valid option ");
			}
			}catch(Exception e){
				LOGGER.info("enter valid area");
			}
		}
	}