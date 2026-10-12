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
        setId(id);
        setName(name);
        setArea(area);
        setLocation(location);
        setSoilType(soilType);
        setUsageStatus(usageStatus);
        setFarmId(farmId);
        setCadastralNumber(cadastralNumber);
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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if (!Double.isFinite(area) || area <= 0) {
            throw new IllegalArgumentException(
                    "Некоректне значення area"
            );
        }
        this.area = area;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSoilType() {
        return soilType;
    }

    public void setSoilType(String soilType) {
        this.soilType = soilType;
    }

    public String getUsageStatus() {
        return usageStatus;
    }

    public void setUsageStatus(String usageStatus) {
        this.usageStatus = usageStatus;
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

    public String getCadastralNumber() {
        return cadastralNumber;
    }

    public void setCadastralNumber(String cadastralNumber) {
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