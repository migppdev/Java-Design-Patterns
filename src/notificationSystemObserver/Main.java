package notificationSystemObserver;

public class Main {
	public static void main(String[] args) {
		
		Observer ob1 = new EmailClient();
		Observer ob2 = new MobileApp();
		Observer ob3 = new User();
		
		NewsAgency newsAgency = new NewsAgency();
		newsAgency.subscribe(ob1);
		newsAgency.subscribe(ob2);
		newsAgency.subscribe(ob3);

		newsAgency.setNews("Testing...");

		newsAgency.unsubscribe(ob2);
		System.out.println();
		
		newsAgency.setNews("Testing  again...");
		
		}
}
