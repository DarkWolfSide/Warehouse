public class Material {
    private String name;
    private String description;
    private String icon;
    private int quantity = 0;
    public Material(String name, String description, String icon) {
        this.name = name;
        this.description = description;
        this.icon = icon;
    }
    public String getName() {
        return name;
    }
    public String getdescription() {
        return description;
    }
    public String geticon() {
        return icon;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public  int getQuantity(){
        return quantity;
    }
}
