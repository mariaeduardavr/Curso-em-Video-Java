package comparacaostring;

public class ComparacaoString {

    public static void main(String[] args) {
        String nome1 = "William";
        String nome2 = "William";
        String nome3 = new String("William");
        String res;
        res = (nome1.equals(nome3)) ? "igual" : "diferente";
        System.out.println(res);
    }
    
}
