public class PDFDocumentFactory extends DocumentFactory {
    private String title;
    private String content;

    @Override
    public Document createDocument() {
        return new Document() {
            @Override
            public void create() {
                System.out.println("PDF Document created.");
            }

            @Override
            public void setTitle(String title) {
                PDFDocumentFactory.this.title = title;
                System.out.println("PDF Document Title: " + title);
            }

            @Override
            public void setContent(String content) {
                PDFDocumentFactory.this.content = content;
                System.out.println("PDF Document Content: " + content);
            }

            @Override
            public void displayInfo() {
                System.out.println("Displaying PDF Document Info:");
                System.out.println("Title: " + title);
                System.out.println("Content: " + content);
            }
        };
    }
}