package cricket;

public interface Player {
	public void subscribe(Subscriber s);
	public void unsubscribe(Subscriber s);
	public void notifySubscriber();
}
