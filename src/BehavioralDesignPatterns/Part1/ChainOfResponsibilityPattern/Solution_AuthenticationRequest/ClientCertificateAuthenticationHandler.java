package BehavioralDesignPatterns.Part1.ChainOfResponsibilityPattern.Solution_AuthenticationRequest;

public class ClientCertificateAuthenticationHandler extends AuthenticationHandler {

  public ClientCertificateAuthenticationHandler(AuthenticationHandler next) {
    super(next);
  }

  public void handleRequest(String requestType) {
    if(requestType.equals("client certificate")) {
      System.out.println("Handling Client Certificate Authentication Request");
    } else {
      super.handleRequest(requestType);
    }
  }

}
