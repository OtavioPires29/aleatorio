import java.time.LocalDate;
import java.time.LocalTime;

public class localtime {
    public static void main(String[] args) {
        LocalTime envio = LocalTime.of(23, 0);
        LocalTime limite = LocalTime.of(22, 59);

        if (!envio.isBefore(limite)) {
            System.out.println("entrega fora de horario");
        }else {
            System.out.println("entrega no horario");
        }


    }
}