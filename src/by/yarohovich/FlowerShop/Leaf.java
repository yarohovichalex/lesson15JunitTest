package by.yarohovich.FlowerShop;

public class Leaf {
	private String color;
	private String shape;
        private String value;
        private int id;
	
	
	
	public Leaf(String color, String shape) {
		//super();
		this.color = color;
		this.shape = shape;
	}
        public Leaf(String color, String shape, String value, int id){
            this.color = color;
            this.shape = shape;
            this.value = value;
            this.id = id;
        }
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}