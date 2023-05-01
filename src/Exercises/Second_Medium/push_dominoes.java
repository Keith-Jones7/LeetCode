package Exercises.Second_Medium;
//838 推多米诺
public class push_dominoes {
    public String pushDominoes(String dominoes){
        String temp = "";
        while (!dominoes.equals(temp)){
            temp = dominoes;
            dominoes = dominoes.replace("R.L", "T");
            dominoes = dominoes.replace(".L", "LL");
            dominoes = dominoes.replace("R.", "RR");
            dominoes = dominoes.replace("T", "R.L");
        }
        return dominoes;
    }
    public String pushDominoes2(String dominoes){
        return dominoes;
    }
}
