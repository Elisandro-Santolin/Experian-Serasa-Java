package checker;

import java.util.regex.Pattern;

import enumerators.StatesEnum;

public class CheckerCpf {
    
    public static boolean checkNumberOfCharacters(String cpf){
        return Pattern.matches("[0-9]{11}", cpf);
    }
    public static boolean checkTaxRegion(String cpf, StatesEnum state){
        if(state.getTaxRegion() == cpf.charAt(8)){
            return true;
        }else {
            return false;
        }
    }
}