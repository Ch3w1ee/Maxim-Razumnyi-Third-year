import java.util.Arrays;

public class Farm {
    private int id;
    private String name;
    private String address;
    private String contacts;
    private String[] activityAreas;
    private int managerId;
    private int[] fieldIds;
    private int[] employeeIds;
    private int[] warehouseIds;
    private int[] machineryIds;

    public Farm(int id, String name, String address, String contacts,
                String[] activityAreas, int managerId,
                int[] fieldIds, int[] employeeIds,
                int[] warehouseIds, int[] machineryIds) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contacts = contacts;
        this.activityAreas = activityAreas;
        this.managerId = managerId;
        this.fieldIds = fieldIds;
        this.employeeIds = employeeIds;
        this.warehouseIds = warehouseIds;
        this.machineryIds = machineryIds;
    }

    public void showResources() {
    }

    public void showSummary() {
    }

    @Override
    public String toString() {
        return "Farm{" +
                "id=" + id +
                ", name='" + name + "'" +
                ", address='" + address + "'" +
                ", contacts='" + contacts + "'" +
                ", activityAreas=" + Arrays.toString(activityAreas) +
                ", managerId=" + managerId +
                ", fieldIds=" + Arrays.toString(fieldIds) +
                ", employeeIds=" + Arrays.toString(employeeIds) +
                ", warehouseIds=" + Arrays.toString(warehouseIds) +
                ", machineryIds=" + Arrays.toString(machineryIds) +
                "}";
    }
}