import java.util.Scanner;

/**
 * Kelas {@code Bank} merupakan subkelas dari {@code Pembayaran} yang mengimplementasikan
 * metode abstrak {@code prosesPembayaran()} untuk menangani pembayaran melalui bank.
 * @author Alvia
 */
public class Bank extends Pembayaran {
     /**
     * Metode ini diimplementasikan untuk menangani proses pembayaran melalui bank.
     * Menampilkan informasi rekening untuk transfer dan memberi konfirmasi setelah transfer diterima.
     */
    @Override
    protected void prosesPembayaran() {
        Scanner scanner = new Scanner(System.in);
        String nomorRekeningPembayaran = "1200495522";

        System.out.println("=== Panduan Pembayaran Melalui Bank ===");
        System.out.println("1. Nomor rekening pembayaran: " + nomorRekeningPembayaran);
        System.out.println("2. Masuk ke menu transfer");
        System.out.println("3. Masukkan nomor rekening tujuan");
        System.out.println("4. Masukkan jumlah pembayaran");
        System.out.println("5. Masukkan PIN Anda");
        System.out.println("6. Konfirmasi dan kirim pembayaran");
        System.out.println("7. Tunggu hingga muncul konfirmasi pembayaran berhasil");
        System.out.println("Klik 1 jika sudah melakukan pembayaran");
        int input = scanner.nextInt();
        System.out.println("\n Pembayaran dengan QRIS sedang diproses");
        System.out.println("      Menunggu konfirmasi admin\n");
    }
}
