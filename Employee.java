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
        setId(id);
        setFullName(fullName);
        setPosition(position);
        setPhone(phone);
        setStartDate(startDate);
        setEmploymentStatus(employmentStatus);
        setRoles(roles);
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "fullName не може бути порожнім"
            );
        }
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String[] getRoles() {
        return Arrays.copyOf(roles, roles.length);
    }

    public void setRoles(String[] roles) {
        if (roles == null) {
            throw new IllegalArgumentException(
                    "roles: масив не може бути null"
            );
        }
        this.roles = Arrays.copyOf(roles, roles.length);
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