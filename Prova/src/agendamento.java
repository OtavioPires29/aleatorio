import java.time.LocalDate;

public class agendamento {
    public static void main(String[] args) {
        LocalDate base = LocalDate.of(2025, 6, 9);
        int dias = 7;
        LocalDate novaData = base.plusDays(10);
        System.out.println(novaData.getDayOfMonth());

        
        
        
        int nota = 7;
        int peso = 2;
        double media = (nota * peso + 6 * 3) / 5;
        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Revisar ");
        }





        int notificacoes = 0;

        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                notificacoes += 2;
            } else {
                notificacoes++;
            }
        }

    }
}
