public class Main {
    public static void main(String[] args) {
        // PDF document
        DocumentFactory pdfFactory = new PDFDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.create();
        pdfDoc.setTitle("Annual Report");
        pdfDoc.setContent("This is the annual report for 2024.");
        pdfDoc.displayInfo();

        System.out.println("----");

        // Word document
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.create();
        wordDoc.setTitle("Meeting Minutes");
        wordDoc.setContent("These are the minutes of the quarterly meeting.");
        wordDoc.displayInfo();
    }
}