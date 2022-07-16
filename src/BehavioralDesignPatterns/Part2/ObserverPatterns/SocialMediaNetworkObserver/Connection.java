package BehavioralDesignPatterns.Part2.ObserverPatterns.SocialMediaNetworkObserver;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

//Observable
public class Connection {

    private String status = "";
    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void setStatus(String status) {
        //Notify when old and new value is different.
        support.firePropertyChange("status", this.status, status);
        this.status = status;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

}
