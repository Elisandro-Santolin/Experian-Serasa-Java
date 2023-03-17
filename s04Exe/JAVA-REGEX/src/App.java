import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    // ## https://www.devmedia.com.br/introducao-a-regex/15597 ## //
    public static void main(String[] args) throws Exception {
            // ## O REGEX A SEQUENCIA A SER PROCURADA ## //
            // ## [a-zA-Z0-9 \\- \\. \\_ ] QUALQUER CARACTER DENTRO DOS COLCHETES NO MINIMO 1 VEZ ## //
            // @
            // ## [a-z]{2,4} caracter de "a" ate "z" no minimo 2 vezes ate 4 vezes ## //
            //Pattern myPattern = Pattern.compile("[a-z 0-9 \\- \\. \\_ ]+ @ ([a-z 0-9 \\- \\_]+ \\.)+ [a-z]{2,4}", Pattern.COMMENTS); 
            Pattern myPattern = Pattern.compile("[a-zA-Z0-9 \\- \\. \\_ ] +@ ([a-zA-Z0-9 \\- \\_]+ \\. )+ [a-z]{2,4}",Pattern.COMMENTS); 
                        // ## A STRING A SER PESQUISADA ## //
            Matcher myMatcher = myPattern.matcher("teste.email@dominio.com.br"); 
                        // ## RETORNA TRUE OU FALSE SE FOR ENCONTRADO NA SEQUENCIA REGEX ## //   // METODOS FIND / MATCHES / 
            System.out.println(myMatcher.matches());         
    }
}
