package web.dao.entity;

public class Itinerary {
	private int id;
	private String route;
	private int price;
	private boolean recomended;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public boolean isRecomended() {
		return recomended;
	}
	public void setRecomended(boolean recomended) {
		this.recomended = recomended;
	}
}
