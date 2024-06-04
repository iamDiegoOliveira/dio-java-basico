public class App {
    public static void main(String[] args) {

        String nome = "José";
        String sobrenome = "Diego";
        String nomeCompleto = nomeCompleto(nome, sobrenome);

        System.out.println(nomeCompleto);
       
       }


       public static String nomeCompleto (String nome, String sobrenome){

        return nome.concat(" ").concat(sobrenome);
   

       }

    }
