package BehavioralDesignPatterns.ChainOfResponsibilityPattern.SuccessorChainWithChainRequest;

public class SpreadSheetHandler extends  DocumentHandler{

    public SpreadSheetHandler(DocumentHandler handler) {
        super(handler);
    }

    public void openDocument(String fileExtension) {
        if(fileExtension.equals("xlsx")) {
            System.out.println("Opening spread sheet document..");
        } else {
            super.openDocument(fileExtension);
        }
    }
}
