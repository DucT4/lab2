/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

/**
 *
 * @author Admin
 */
import controllers.RamManagement;
import models.Ram;
import java.util.List;
import java.util.Scanner;

public class Ramviewer {
    private RamManagement ramManagement;
    private Scanner scanner;
    private menu menuHelper;

    public Ramviewer() {
        ramManagement = new RamManagement();
        // ramManagement.load();
        scanner = new Scanner(System.in);
        menuHelper = new menu();

    }

    public void run() {
        ramManagement = new RamManagement();

        boolean running = true;
        while (running) {
            System.out.println("\nRAM Management System");
            System.out.println("1. Add RAM");
            System.out.println("2. Search RAM");
            System.out.println("3. Update RAM");
            System.out.println("4. Delete RAM");
            System.out.println("5. Display All RAMs");
            System.out.println("6. Save Data");
            System.out.println("7. Load Data");
            System.out.println("8. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:

                    Ram ram = menuHelper.addRam();
                    System.out.println(ramManagement.add(ram)  ?"Added successfully!!" : "Failed to add!!!");
                    break;
                case 2:
                    searchRam();
                    break;
                case 3:
                    updateRam();
                    break;
                case 4:
                    deleteRam();
                    break;
                case 5:
                    displayAllRams();
                    break;
                case 6:
                    saveData();
                    break;
                case 7:
                    loadData();
                    break;
                case 8:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void searchRam() {
        System.out.println("Search RAM by:");
        System.out.println("1. Type");
        System.out.println("2. Bus");
        System.out.println("3. Brand");
        System.out.print("Enter your choice: ");
        int searchChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter search term: ");
        String searchTerm = scanner.nextLine();

        List<String> results;
        switch (searchChoice) {
            case 1:
                results = ramManagement.searchType(searchTerm);
                break;
            case 2:
                results = ramManagement.searchBus(searchTerm);
                break;
            case 3:
                results = ramManagement.searchBrand(searchTerm);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        if (results.isEmpty()) {
            System.out.println("No results found.");
        } else {
            for (String result : results) {
                System.out.println(result);
            }
        }
    }

    private void updateRam() {
        System.out.print("Enter RAM code to update: ");
        String code = scanner.nextLine();
        Ram updatedRam = ramManagement.update(code, null);
        if (updatedRam != null) {
            System.out.println("RAM updated successfully.");
        } else {
            System.out.println("RAM not found or update failed.");
        }
    }

    private void deleteRam() {
        System.out.print("Enter RAM code to delete: ");
        String code = scanner.nextLine();
        Ram deletedRam = ramManagement.delete(code);
        if (deletedRam != null) {
            System.out.println("RAM deleted successfully.");
        } else {
            System.out.println("RAM not found or deletion failed.");
        }
    }

    private void displayAllRams() {
        ramManagement.displayAll();

    }

    private void saveData() {
        boolean saved = ramManagement.save();
        if (saved) {
            System.out.println("Data saved successfully.");
        } else {
            System.out.println("Failed to save data.");
        }
    }

    private void loadData() {
        boolean loaded = ramManagement.load();
        if (loaded) {
            System.out.println("Data loaded successfully.");
        } else {
            System.out.println("Failed to load data.");
        }
    }
}
