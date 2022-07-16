package BehavioralDesignPatterns.Part1.ChainOfResponsibilityPattern.Solution_AuthenticationRequest;

public class DigestAuthenticationHandler extends AuthenticationHandler {

  public DigestAuthenticationHandler(AuthenticationHandler next) {
    super(next);
  }

  public void handleRequest(String requestType) {
    if(requestType.equals("digest")) {
      System.out.println("Handling Digest Authentication Request");
    } else {
      super.handleRequest(requestType);
    }
  }

}
