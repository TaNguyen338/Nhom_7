import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        try (java.util.Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap so tien gui (VND): ");
            double soTienGui = scanner.nextDouble();
            System.out.print("Nhap lai suat hang nam (%): ");
            double laiSuatNam = scanner.nextDouble();
            System.out.print("Nhap so thang gui ");
            int soThangGui = scanner.nextInt();
            double laiSuatThang = laiSuatNam / 12 / 100;
            double tienLai = soTienGui * laiSuatThang * soThangGui;
            double tongTienCuoiKy = soTienGui + tienLai;
            System.out.println("\n--- KẾT QUẢ ---");
            System.out.printf("Tiền lãi: %.2f VND\n", tienLai);
            System.out.printf("Tổng số tiền cuối kỳ: %.2f \n", tongTienCuoiKy);
        }
    }
}
