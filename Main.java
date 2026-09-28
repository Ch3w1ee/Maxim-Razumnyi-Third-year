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

        System.out.println(farm.toString());
        System.out.println(employee.toString());
        System.out.println(field.toString());
        System.out.println(crop.toString());
        System.out.println(sowing.toString());
        System.out.println(machinery.toString());
    }
}