package StructuralDesignPatterns.BridgePattern.Solution_ButtonExample;

public class Medium implements ButtonSize {
    @Override
    public void setSize() {
        System.out.println("Setting size to medium...");
    }
}
