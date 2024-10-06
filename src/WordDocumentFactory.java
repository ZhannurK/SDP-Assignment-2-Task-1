public class WordDocumentFactory extends DocumentFactory {
    private String title;
    private String content;

    @Override
    public Document createDocument() {
        return new Document() {
            @Override
            public void create() {
                System.out.println("Word Document created.");
            }

            @Override
            public void setTitle(String title) {
                WordDocumentFactory.this.title = title;
                System.out.println("Word Document Title: " + title);
            }

            @Override
            public void setContent(String content) {
                WordDocumentFactory.this.content = content;
                System.out.println("Word Document Content: " + content);
            }

            @Override
            public void displayInfo() {
                System.out.println("Displaying Word Document Info:");
                System.out.println("Title: " + title);
                System.out.println("Content: " + content);
            }
        };
    }
}