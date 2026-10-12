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
        setId(id);
        setInventoryNumber(inventoryNumber);
        setName(name);
        setType(type);
        setBrand(brand);
        setModel(model);
        setManufactureYear(manufactureYear);
        setTechnicalCondition(technicalCondition);
        setOperatingHours(operatingHours);
        setResponsibleEmployeeId(responsibleEmployeeId);
        setFarmId(farmId);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("id має бути більше нуля");
        }
        this.id = id;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "name не може бути порожнім"
            );
        }
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        if (manufactureYear <= 0) {
            throw new IllegalArgumentException(
                    "manufactureYear має бути більше нуля"
            );
        }
        this.manufactureYear = manufactureYear;
    }

    public String getTechnicalCondition() {
        return technicalCondition;
    }

    public void setTechnicalCondition(String technicalCondition) {
        this.technicalCondition = technicalCondition;
    }

    public double getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(double operatingHours) {
        if (!Double.isFinite(operatingHours) || operatingHours < 0) {
            throw new IllegalArgumentException(
                    "Некоректне значення operatingHours"
            );
        }
        this.operatingHours = operatingHours;
    }

    public int getResponsibleEmployeeId() {
        return responsibleEmployeeId;
    }

    public void setResponsibleEmployeeId(int responsibleEmployeeId) {
        if (responsibleEmployeeId <= 0) {
            throw new IllegalArgumentException(
                    "responsibleEmployeeId має бути більше нуля"
            );
        }
        this.responsibleEmployeeId = responsibleEmployeeId;
    }

    public int getFarmId() {
        return farmId;
    }

    public void setFarmId(int farmId) {
        if (farmId <= 0) {
            throw new IllegalArgumentException(
                    "farmId має бути більше нуля"
            );
        }
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