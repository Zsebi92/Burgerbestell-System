package Model;

import java.util.Objects;

public  class Menu {

        protected int menuNumber;
        protected float prize;
        protected String name;
        protected String mainDish;
        protected String sideDish;
        protected String beverage;


    public Menu(int menuNumber, float prize, String name, String mainDish, String sideDish, String beverage) {
        this.menuNumber = menuNumber;
        this.prize = prize;
        this.name = name;
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.beverage = beverage;
    }

    public int getMenuNumber() {
        return menuNumber;
    }

    public void setMenuNumber(int menuNumber) {
        this.menuNumber = menuNumber;
    }

    public float getPrize() {
        return prize;
    }

    public void setPrize(float prize) {
        this.prize = prize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainDish() {
        return mainDish;
    }

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public String getSideDish() {
        return sideDish;
    }

    public void setSideDish(String sideDish) {
        this.sideDish = sideDish;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Menu menu = (Menu) o;

        if (menuNumber != menu.menuNumber) return false;
        if (Float.compare(menu.prize, prize) != 0) return false;
        if (!Objects.equals(name, menu.name)) return false;
        if (!Objects.equals(mainDish, menu.mainDish)) return false;
        if (!Objects.equals(sideDish, menu.sideDish)) return false;
        return Objects.equals(beverage, menu.beverage);
    }

    @Override
    public int hashCode() {
        int result = menuNumber;
        result = 31 * result + (prize != +0.0f ? Float.floatToIntBits(prize) : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (mainDish != null ? mainDish.hashCode() : 0);
        result = 31 * result + (sideDish != null ? sideDish.hashCode() : 0);
        result = 31 * result + (beverage != null ? beverage.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return
                "menuNumber=" + menuNumber +
                ", prize=" + prize +
                ", name='" + name + '\'' +
                ", mainDish='" + mainDish + '\'' +
                ", sideDish='" + sideDish + '\'' +
                ", beverage='" + beverage + '\'' +
                '}';
    }
}
