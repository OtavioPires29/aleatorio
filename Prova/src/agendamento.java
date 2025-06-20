import java.time.LocalDate;

public class agendamento {
    public static void main(String[] args) {
        //agendamento
        LocalDate base = LocalDate.of(2025, 6, 1);
        int dias = 7;
        LocalDate novaData = base.plusDays(dias * 2 - 3);
        System.out.println(novaData.getDayOfMonth());
        
        //resultado 12
        
        
        //Plataforma de estudos
        int nota = 7;
        int peso = 2;
        double media = (nota * peso + 6 * 3) / 5;
        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Revisar ");
        }
        //resultado: revisar conteudo



        //notificacoes
        int notificacoes = 0;

        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                notificacoes += 2;
            } else {
                notificacoes++;
            }
        //resultado: 7




            o restante eu fiz de cabeça.
        
        }

    }
}
