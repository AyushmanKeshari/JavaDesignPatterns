package StructuralDesignPatterns.BridgePattern.Solution_ButtonExample;

public class Large implements ButtonSize {
    @Override
    public void setSize() {
        System.out.println("Setting size to large...");
    }
}
