package сlerk;

import сlerk.phonebook.PhoneBook;
import сlerk.phonebook.record.Record;

import java.util.List;

public class Clerk {
    private PhoneBook phoneBook = new PhoneBook();

    private Record recordFirst = new Record("John", "123-456-789");
    private Record recordSecond = new Record("Alice", "987-654-321");
    private Record recordThird = new Record("John", "555-555-555");

    public void getClerkResults() {
        addToPhoneBook();
        findRecords();
    }

    private void addToPhoneBook() {
        phoneBook.add(recordFirst);
        phoneBook.add(recordSecond);
        phoneBook.add(recordThird);
    }

    private void findRecords() {
        Record foundRecord = phoneBook.find("John");
        if (foundRecord != null) {
            System.out.println("Found record: " + foundRecord.getName() + " - " + foundRecord.getPhoneNumber());
        } else {
            System.out.println("Record not found.");
        }

        List<Record> foundRecords = phoneBook.findAll("John");
        if (foundRecords != null) {
            System.out.println("Found records for 'John':");
            for (Record record : foundRecords) {
                System.out.println(record.getName() + " - " + record.getPhoneNumber());
            }
        } else {
            System.out.println("Records not found.");
        }
    }

}
