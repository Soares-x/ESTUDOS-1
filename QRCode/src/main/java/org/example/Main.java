import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
        System.out.println("=== GERADOR DE QR CODE ===");

        System.out.print("Digite o texto ou URL: ");
        String texto = scanner.nextLine();

        System.out.print("Digite o nome do arquivo (ex: qrcode.png): ");
        String caminho = scanner.nextLine();

        Map<EncodeHintType, Object> hints = new HashMap<>();
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");

        BitMatrix matrix = new MultiFormatWriter().encode(
                texto,
                BarcodeFormat.QR_CODE,
                300,
                300,
                hints
        );

        MatrixToImageWriter.writeToPath(
                matrix,
                "PNG",
                new File(caminho).toPath()
        );

        System.out.println("QR Code gerado com sucesso!");

    } catch (Exception e) {
        e.printStackTrace();
    }

    scanner.close();
}