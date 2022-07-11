package BehavioralDesignPatterns.ChainOfResponsibilityPattern.SuccessorChainWithChainRequest;

public class Chain {
    public static void main(String[] args) {
        //SuccessorChain
        DocumentHandler chain = new SpreadSheetHandler(new SlideShowHandler(new TextDocumentHandler(null)));

        //Pass a Request.
        chain.openDocument("ppt");
        chain.openDocument("txt");
    }
}
