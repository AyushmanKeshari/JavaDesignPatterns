package StructuralDesignPatterns.BridgePattern.Solution_ButtonExample;

public class Small implements ButtonSize {
    @Override
    public void setSize() {
        System.out.println("Setting size to Small...");
    }
}
