public class Machinery {
    private int id;
    private String inventoryNumber;
    private String name;
    private String type;
    private String brand;
    private String model;
    private int manufactureYear;
    private String technicalCondition;
    private double operatingHours;
    private int responsibleEmployeeId;
    private int farmId;

    public Machinery(int id, String inventoryNumber, String name,
                     String type, String brand, String model,
                     int manufactureYear, String technicalCondition,
                     double operatingHours, int responsibleEmployeeId,
                     int farmId) {
        this.id = id;
        this.inventoryNumber = inventoryNumber;
        this.name = name;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.technicalCondition = technicalCondition;
        this.operatingHours = operatingHours;
        this.responsibleEmployeeId = responsibleEmployeeId;
        this.farmId = farmId;
    }

    public void assignWork(int workId) {
    }

    public void checkAvailability() {
    }

    public void recordOperatingHours(double hours) {
    }

    @Override
    public String toString() {
        return "Machinery{" +
                "id=" + id +
                ", inventoryNumber='" + inventoryNumber + "'" +
                ", name='" + name + "'" +
                ", type='" + type + "'" +
                ", brand='" + brand + "'" +
                ", model='" + model + "'" +
                ", manufactureYear=" + manufactureYear +
                ", technicalCondition='" + technicalCondition + "'" +
                ", operatingHours=" + operatingHours +
                ", responsibleEmployeeId=" + responsibleEmployeeId +
                ", farmId=" + farmId +
                "}";
    }
}