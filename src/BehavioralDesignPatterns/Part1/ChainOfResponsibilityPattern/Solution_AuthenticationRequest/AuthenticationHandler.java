package BehavioralDesignPatterns.Part1.ChainOfResponsibilityPattern.Solution_AuthenticationRequest;

public abstract class AuthenticationHandler {

  private AuthenticationHandler next;

  public AuthenticationHandler(AuthenticationHandler next) {
    this.next = next;
  }

  public void handleRequest(String requestType) {
    if(next != null) {
      next.handleRequest(requestType);
    }
  }

}
