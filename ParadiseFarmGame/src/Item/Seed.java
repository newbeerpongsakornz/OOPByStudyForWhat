package Item;

public class Seed extends Item{

    private int dayToGrow;
    private int levelMax;
    private String nameProduct;

    public Seed(String name) {
        this(name, 0);
    }

    public Seed(String name, int num) {
        super(name + "Seed", num);
        this.nameProduct = name;

        if (name.equals("radish")) {
            this.priceSell = 100;
            this.dayToGrow = 3;
            this.levelMax = 3;
        } else if (name.equals("carrot")) {
            this.priceSell = 200;
            this.dayToGrow = 6;
            this.levelMax = 3;
        } else if (name.equals("tomato")) {
            this.priceSell = 300;
            this.dayToGrow = 9;
            this.levelMax = 3;
        }
    }

    public void useSeed() {
        if (numItem < 1) {
            numItem = 0;
        } else {
            numItem--;
        }
    }

    public Item getProduct() {
        return new Item(nameProduct, 1);
    }

    public int getDayToGrow() {
        return dayToGrow;
    }

    public void setDayToGrow(int dayToGrow) {
        this.dayToGrow = dayToGrow;
    }

    public int getLevelMax() {
        return levelMax;
    }

    public void setLevelMax(int levelMax) {
        this.levelMax = levelMax;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

}
