package fr.ensai.library;

public class Magazine extends Item {

    // Attributes
    private String issn;
    private String issueNumber;

    public Magazine(String title, int year, int pageCount, String issn, String issueNumber) {
        super(title, year, pageCount);
        this.issn = issn;
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return "Magazine " + getTitle() + " n° " + getIssueNumber();
    }

    public String getIssn() {
        return this.issn;
    }

    public String getIssueNumber() {
        return this.issueNumber;
    }
}
