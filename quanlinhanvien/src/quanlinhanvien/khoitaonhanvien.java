package quanlinhanvien;

public class khoitaonhanvien {
	public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee(1, "Quynh", 21, "content", "001",20.0);
        employees[1] = new Employee(2, "Hung", 21, "it", "002", 18.5);
        employees[2] = new Employee(3, "Thang", 22, "it", "003", 19.5);
        employees[3] = new Employee(4, "long", 12, "marketing", "004", 21.0);
        employees[4] = new Employee(5, "jack", 30, "5m", "005", 22.5);
        employees[5] = new Employee(6, "sontung", 33, "top", "006", 18.0);
        employees[6] = new Employee(7, "thai", 31, "police", "007", 20.5);
        employees[7] = new Employee(8, "tuananh", 34, "it", "008", 19.0);
        employees[8] = new Employee(9, "ngoc", 27, "it", "009", 21.5);
        employees[9] = new Employee(10, "canteamabc", 36, "streamer", "010", 17.5);

        System.out.println("Danh sách nhân viên:");
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId());
            System.out.println("Tên: " + employee.getName());
            System.out.println("Tuổi: " + employee.getAge());
            System.out.println("Phòng ban: " + employee.getDepartment());
            System.out.println("Mã nhân viên: " + employee.getCode());
            System.out.println("Tỷ lệ lương: " + employee.getSalaryRate());
            System.out.println("--------------------");
        }
    }
}
