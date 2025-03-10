package fr.ensai.library;

import java.util.Calendar;
import java.util.Date;

public class Loan {

    // Attributes
    private Item item;
    private Student borrower;
    private Date startDate;
    private Date returnDate;

    public Loan(Item item, Student borrower, Date startDate, Date returnDate) {
        this.item = item;
        this.borrower = borrower;
        this.startDate = startDate;
        this.returnDate = returnDate;
    }

    public Loan(Item item, Student borrower, Date startDate) {
        this.item = item;
        this.borrower = borrower;
        this.startDate = startDate;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        calendar.add(Calendar.MONTH, 1);
        this.returnDate = calendar.getTime();
    }

    public Date setReturnDate() {
        return returnDate;
    }

    public String toString() {
        return "Item " + item.toString() + " borrowed by " + borrower.toString();
    }

    public Item getItem() {
        return item;
    }
}
