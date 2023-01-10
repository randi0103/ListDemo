package goods.Kind;

public class commidity {
    protected String name;
    protected int quality;
    protected String datemanfacture;
    protected String place;
    protected String price;
    protected String dateexist;
    protected String catergory;

    public String toString() {
        return "name:"+name+"\n"+
                "quantity:"+quality+"\n"+
                "datemanfacture:"+datemanfacture+"\n"+
                "place:"+place+"\n"+
                "price:"+price+"\n"+
                "dateexist"+dateexist+"\n"+
                "catergory"+catergory+"\n"
                ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setQuality(int quantity) {
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }

    public String getDatemanfacture() {
        return datemanfacture;
    }

    public void setDatemanfacture(String datemanfacture) {
        this.datemanfacture = datemanfacture;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDateexist() {
        return dateexist;
    }

    public void setDateexist(String dateexist) {
        this.dateexist = dateexist;
    }

    public void setCatergory(String catergory) {
        this.catergory = catergory;
    }

    public String getCatergory() {
        return catergory;
    }
}

