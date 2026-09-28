public class Field {
    private int id;
    private String name;
    private double area;
    private String location;
    private String soilType;
    private String usageStatus;
    private int farmId;
    private String cadastralNumber;

    public Field(int id, String name, double area,
                 String location, String soilType,
                 String usageStatus, int farmId,
                 String cadastralNumber) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.location = location;
        this.soilType = soilType;
        this.usageStatus = usageStatus;
        this.farmId = farmId;
        this.cadastralNumber = cadastralNumber;
    }

    public void showSowingHistory() {
    }

    public void checkSowingArea(double sowingArea) {
    }

    @Override
    public String toString() {
        return "Field{" +
                "id=" + id +
                ", name='" + name + "'" +
                ", area=" + area +
                ", location='" + location + "'" +
                ", soilType='" + soilType + "'" +
                ", usageStatus='" + usageStatus + "'" +
                ", farmId=" + farmId +
                ", cadastralNumber='" + cadastralNumber + "'" +
                "}";
    }
}