class BoxWeight extends Box {
	public double weight; // weight of box

	BoxWeight(double w, double h, double d, double m) {
		width = w;
		height = h;
		depth = d;
		weight = m;
	}
	
	public BoxWeight(BoxWeight ob,double li) {
		super(ob);
		super.mat=li;
		weight=ob.weight;
		
	}
}
