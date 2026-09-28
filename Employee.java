import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String position;
    private String phone;
    private String startDate;
    private String employmentStatus;
    private String[] roles;
    private int farmId;

    public Employee(int id, String fullName, String position,
                    String phone, String startDate,
                    String employmentStatus, String[] roles,
                    int farmId) {
        this.id = id;
        this.fullName = fullName;
        this.position = position;
        this.phone = phone;
        this.startDate = startDate;
        this.employmentStatus = employmentStatus;
        this.roles = roles;
        this.farmId = farmId;
    }

    public void assignWork(int workId) {
    }

    public void showWorkHistory() {
    }

    public void changeRole(String role) {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + "'" +
                ", position='" + position + "'" +
                ", phone='" + phone + "'" +
                ", startDate='" + startDate + "'" +
                ", employmentStatus='" + employmentStatus + "'" +
                ", roles=" + Arrays.toString(roles) +
                ", farmId=" + farmId +
                "}";
    }
}