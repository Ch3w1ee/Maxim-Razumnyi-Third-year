public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm(
                1,
                "Злагода",
                "Одеська область",
                "farm@example.com",
                new String[]{"Рослинництво", "Тваринництво"},
                1,
                new int[]{1},
                new int[]{1},
                new int[]{1},
                new int[]{1}
        );

        Employee employee = new Employee(
                1,
                "Петренко Іван",
                "Керівник господарства",
                "Не вказано",
                "2024-03-01",
                "Працює",
                new String[]{"Керівник", "Обліковець"},
                1
        );

        Field field = new Field(
                1,
                "Північне",
                25.0,
                "Одеська область",
                "Чорнозем",
                "Використовується",
                1,
                "Не вказано"
        );

        Crop crop = new Crop(
                1,
                "Пшениця",
                "Подолянка",
                "Зернові",
                1,
                "Озима пшениця"
        );

        Sowing sowing = new Sowing(
                1,
                1,
                1,
                2026,
                "2025-09-25",
                25.0,
                0.0,
                100.0,
                "Зростає",
                null
        );

        Machinery machinery = new Machinery(
                1,
                "TR-001",
                "Трактор",
                "Сільськогосподарська техніка",
                "John Deere",
                "6155M",
                2020,
                "Справний",
                1250.0,
                1,
                1
        );

        System.out.println("=== 1. Початкові об'єкти ===");
        System.out.println(farm);
        System.out.println(employee);
        System.out.println(field);
        System.out.println(crop);
        System.out.println(sowing);
        System.out.println(machinery);

        System.out.println("=== 2. Зміна через сеттери ===");

        farm.setName("Злагода Плюс");
        employee.setPhone("0501234567");
        field.setArea(30.0);
        crop.setDescription("Оновлений опис культури");
        sowing.setPlannedHarvest(120.0);
        machinery.setOperatingHours(1300.0);

        System.out.println("Назва: " + farm.getName());
        System.out.println("Телефон: " + employee.getPhone());
        System.out.println("Площа: " + field.getArea());
        System.out.println("Культура: " + crop.getDescription());
        System.out.println(
                "Плановий урожай: " + sowing.getPlannedHarvest()
        );
        System.out.println(
                "Напрацювання: " + machinery.getOperatingHours()
        );

        System.out.println("=== 3. Захист масивів ===");

        String[] roles = {"Керівник", "Обліковець"};
        employee.setRoles(roles);
        roles[0] = "Змінено зовні";

        String[] copy = employee.getRoles();
        copy[0] = "Змінено копію";

        System.out.println(
                "Збережена роль: " + employee.getRoles()[0]
        );

        System.out.println("=== 4. Перевірка помилкових значень ===");

        try {
            field.setArea(-5.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        System.out.println(
                "Площа після відхилення: " + field.getArea()
        );

        try {
            sowing.setHarvestedArea(26.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        System.out.println(
                "Зібрана площа: " + sowing.getHarvestedArea()
        );

        try {
            machinery.setOperatingHours(-1.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        System.out.println(
                "Напрацювання після відхилення: "
                        + machinery.getOperatingHours()
        );
    }
}