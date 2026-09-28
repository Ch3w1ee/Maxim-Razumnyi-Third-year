public class Crop {
    private int id;
    private String name;
    private String variety;
    private String cropGroup;
    private int productItemId;
    private String description;

    public Crop(int id, String name, String variety,
                String cropGroup, int productItemId,
                String description) {
        this.id = id;
        this.name = name;
        this.variety = variety;
        this.cropGroup = cropGroup;
        this.productItemId = productItemId;
        this.description = description;
    }

    public void selectForSowing() {
    }

    public void showProductItem() {
    }

    @Override
    public String toString() {
        return "Crop{" +
                "id=" + id +
                ", name='" + name + "'" +
                ", variety='" + variety + "'" +
                ", cropGroup='" + cropGroup + "'" +
                ", productItemId=" + productItemId +
                ", description='" + description + "'" +
                "}";
    }
}