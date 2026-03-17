package notificationSystemObserver;

import java.util.List;
import java.util.ArrayList;

public class NewsAgency {
	
	private List<Observer> subscribers = new ArrayList<>();
	
	public void subscribe(Observer observer) {
		this.subscribers.add(observer);
	}
	
	public void unsubscribe(Observer observer) {
		this.subscribers.remove(observer);
	}
	
	
	
	public void notifyObservers(String message) {
		for (Observer subscriber : this.subscribers) {
			subscriber.update(message);
		}
	}
	
	public void setNews(String news) {
		this.notifyObservers(news);
	}
	
}
