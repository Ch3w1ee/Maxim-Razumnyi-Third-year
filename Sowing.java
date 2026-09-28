public class Sowing {
    private int id;
    private int fieldId;
    private int cropId;
    private int season;
    private String sowingDate;
    private double sowingArea;
    private double harvestedArea;
    private double plannedHarvest;
    private String status;
    private String endDate;

    public Sowing(int id, int fieldId, int cropId, int season,
                  String sowingDate, double sowingArea,
                  double harvestedArea, double plannedHarvest,
                  String status, String endDate) {
        this.id = id;
        this.fieldId = fieldId;
        this.cropId = cropId;
        this.season = season;
        this.sowingDate = sowingDate;
        this.sowingArea = sowingArea;
        this.harvestedArea = harvestedArea;
        this.plannedHarvest = plannedHarvest;
        this.status = status;
        this.endDate = endDate;
    }

    public void showGrowingHistory() {
    }

    public void compareResults() {
    }

    public void calculateYield() {
    }

    @Override
    public String toString() {
        return "Sowing{" +
                "id=" + id +
                ", fieldId=" + fieldId +
                ", cropId=" + cropId +
                ", season=" + season +
                ", sowingDate='" + sowingDate + "'" +
                ", sowingArea=" + sowingArea +
                ", harvestedArea=" + harvestedArea +
                ", plannedHarvest=" + plannedHarvest +
                ", status='" + status + "'" +
                ", endDate=" + endDate +
                "}";
    }
}