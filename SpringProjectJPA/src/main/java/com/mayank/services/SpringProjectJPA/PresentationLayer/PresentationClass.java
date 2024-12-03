package com.mayank.services.SpringProjectJPA.PresentationLayer;

import com.mayank.services.SpringProjectJPA.Vaccine;
import com.mayank.services.SpringProjectJPA.service.IVaccineInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.Optional;
import java.util.Scanner;

//@Component
//public class PresentationClass {
//
//    @Autowired
//    IVaccineInfo vaccineInfo;
//
//    public void addVaccine()
//    {
//
//        System.out.println("Please enter Name and Cost ........");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        Double cost = scanner.nextDouble();
//
//        Vaccine vaccine = new Vaccine(name, cost);
//
//        System.out.println("Vaccine added successfully : " + vaccineInfo.addVaccine(vaccine));
//
//    }
//    public void searchVaccineByID()
//    {
//        System.out.println("Please enter VaccineID ........");
//        Scanner scanner = new Scanner(System.in);
//        Optional<Vaccine> vaccine= vaccineInfo.getVaccineById(scanner.nextInt());
//        if(vaccine.isPresent())
//                System.out.println("Vaccine is present : "+vaccine.get());
//        else
//                System.out.println("Vaccine is not present");
//    }
//    public void start()
//    {
//        System.out.println("---- Welcome to Vaccine Portal ----");
//        Integer response;
//        while(true)
//        {
//           System.out.println("Please select option - ");
//           System.out.println();
//           System.out.println("1. Add Vaccine");
//           System.out.println("2. Search Vaccine by ID");
//           System.out.println("3. Exit");
//           Scanner scanner = new Scanner(System.in);
//           response = scanner.nextInt();
//
//           if(response == 1)
//           {
//                addVaccine();
//           }
//           else if (response ==2)
//           {
//                searchVaccineByID();
//           }
//           else
//               break;
//
//
//        }
//    }
//}

//below is the refactored code for the above
@Component
public class PresentationClass {

    private final IVaccineInfo vaccineInfo;
    private final Scanner scanner;

    @Autowired
    public PresentationClass(IVaccineInfo vaccineInfo) {
        this.vaccineInfo = vaccineInfo;
        this.scanner = new Scanner(System.in); // Single scanner instance
    }

    public void addVaccine() {
        try {
            System.out.println("Please enter Name and Cost ........");
            String name = scanner.nextLine();
            Double cost = scanner.nextDouble();
            scanner.nextLine(); // Consume newline left-over

            Vaccine vaccine = new Vaccine(name, cost);
            System.out.println("Vaccine added successfully: " + vaccineInfo.addVaccine(vaccine));
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
            scanner.nextLine(); // Clear scanner buffer
        }
    }

    public void searchVaccineByID() {
        try {
            System.out.println("Please enter VaccineID ........");
            int vaccineId = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            Optional<Vaccine> vaccine = vaccineInfo.getVaccineById(vaccineId);
            if (vaccine.isPresent()) {
                System.out.println("Vaccine is present: " + vaccine.get());
            } else {
                System.out.println("Vaccine is not present.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
            scanner.nextLine(); // Clear scanner buffer
        }
    }

    private void displayMenu() {
        System.out.println("---- Welcome to Vaccine Portal ----");
        System.out.println("1. Add Vaccine");
        System.out.println("2. Search Vaccine by ID");
        System.out.println("3. Exit");
    }

    public void start() {
        while (true) {
            displayMenu();
            System.out.print("Please select an option: ");
            try {
                int response = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over

                switch (response) {
                    case 1 -> addVaccine();
                    case 2 -> searchVaccineByID();
                    case 3 -> {
                        System.out.println("Exiting... Thank you!");
                        scanner.close(); // Close scanner
                        return;
                    }
                    default -> System.out.println("Invalid option. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear scanner buffer
            }
        }
    }
}
