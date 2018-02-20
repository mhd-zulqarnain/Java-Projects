package cricket;

import java.util.*;

public class Kholi implements Player {

	ArrayList<Subscriber> fans;
	private String news;

	public Kholi() {
		fans = new ArrayList<Subscriber>();
	}

	public void subscribe(Subscriber s) {
		fans.add(s);
	}

	public void unsubscribe(Subscriber s) {
		int id = fans.indexOf(s);
		fans.remove(id);

	}

	public void notifySubscriber() {
		for (Subscriber s : fans) {
			s.update(news);
		}

	}
	public void setNews(String n){
		news=n;
		notifySubscriber();
	}

}
