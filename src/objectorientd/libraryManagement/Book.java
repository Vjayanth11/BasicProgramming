package objectorientd.libraryManagement;

class Book implements LibraryOperations {
    private String title;
    private String author;
    private boolean issued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    public void issue() {
        if (!issued) issued = true;
    }

    public void returnBook() {
        if (issued) issued = false;
    }

    public void showDetails() {
        if (!issued) {
            System.out.println("Title: " + title + ", Author: " + author);
        }
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return issued;
    }
}