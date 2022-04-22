package expressionsRegulieres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {
    public DemoRegex() {
        System.out.println("ExempleRegex1() :");
        ExempleRegex1();
        System.out.println("ExempleRegex2() :");
        ExempleRegex2();
        System.out.println("ExempleRegex3() :");
        ExempleRegex3();
        System.out.println("ExempleRegex4() :");
        ExempleRegex4();
        System.out.println("ExempleRegex5() :");
        ExempleRegex5();
    }

    private void ExempleRegex1() {
        String regex = "es";
        String str = "Les carottes sont cuites";
        Pattern pattern;
        Matcher matcher;

        //compilation de la regex avec le motif (patron ou pattern) : regex
        pattern = Pattern.compile(regex);
        //créer et associer le moteur à la regex sur la chaîne str
        matcher = pattern.matcher(str);

        //si le motif est trouvé
        if (matcher.find()) {
            System.out.print("Le patron \"" + regex + "\" a été trouvé dans ");
            System.out.println("\"" + str + "\".");
        }

        if (str.contains(regex)) {
            System.out.print("Le patron \"" + regex + "\" a été trouvé dans ");
            System.out.println("\"" + str + "\".");
        }
    }

    private void ExempleRegex2() {
        patternMatches(".c", "abc");
        patternMatches("..c", "abc");//true (3ème caractère est c)
        patternMatches("...c", "abbc");//true (4ème caractère est c)

        patternMatches("\\d", "2");//true (seulement un chiffre)
        patternMatches("\\d", "332");//false (plusieurs chiffres)
        patternMatches("\\d", "123abc");//false (chiffres et caractères)

        patternMatches("\\D*", "geek");//true (Non-chiffre et apparait au moins une fois)
    }

    private void patternMatches(String regex, String input) {
        System.out.print("Le motif \"" + regex + "\" se retrouve dans \"" + input + "\" : ");
        System.out.println(Pattern.matches(regex, input));
    }
//ExempleRegex2() :
//Le motif ".c" se retrouve dans "abc" : false
//Le motif "..c" se retrouve dans "abc" : true
//Le motif "...c" se retrouve dans "abbc" : true
//Le motif "\d" se retrouve dans "2" : true
//Le motif "\d" se retrouve dans "332" : false
//Le motif "\d" se retrouve dans "123abc" : false
//Le motif "\D*" se retrouve dans "geek" : true

    private void ExempleRegex3() {
        // \d: un chiffre
        // {2,}: 2 ou plusieurs chiffres
        String regex = "\\d{4}";
        String str = "Les 3 bonnes années sont 1967, 2001 et 2020, mais surtout 1967.";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        for (int no = 1; matcher.find(); no++) {
            System.out.println("Correspondance numéro " + no + ": " + matcher.group());
        }
    }

//ExempleRegex3() :
//Correspondance numéro 1: 1967
//Correspondance numéro 2: 2001
//Correspondance numéro 3: 2020
//Correspondance numéro 4: 1967



   private void ExempleRegex4() {
        // \b: un espace
        // 20
        String regex = "\\b20";
        String str = "Les 3 bonnes années sont 1967, 2001 et 2020, mais surtout 1967.";

        System.out.println(str);
        str = str.replaceAll(regex, "19");
        System.out.println(str);
    }
//ExempleRegex4() :
//Les 3 bonnes années sont 1967, 2001 et 2020, mais surtout 1967.
//Les 3 bonnes années sont 1967, 1901 et 1920, mais surtout 1967.

    private void ExempleRegex5() {
        String regex = "\\d{2,}";
        String str = "Les 3 bonnes années sont 1967, 2001 et 2020, mais surtout 1967.";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        System.out.println(str);
        for (int no = 1; matcher.find(); no++) {
            String correspondance = matcher.group();
            System.out.println("Correspondance numéro " + no + ": " + correspondance);
            str = str.replaceAll(correspondance, ("" + '(' + no + ')'));
            System.out.println(str);
        }
    }
//ExempleRegex5() :
//Les 3 bonnes années sont 1967, 2001 et 2020, mais surtout 1967.
//Correspondance numéro 1: 1967
//Les 3 bonnes années sont (1), 2001 et 2020, mais surtout (1).
//Correspondance numéro 2: 2001
//Les 3 bonnes années sont (1), (2) et 2020, mais surtout (1).
//Correspondance numéro 3: 2020
//Les 3 bonnes années sont (1), (2) et (3), mais surtout (1).
//Correspondance numéro 4: 1967
//Les 3 bonnes années sont (1), (2) et (3), mais surtout (1).

    public static void main(String[] args) {
        new DemoRegex();
    }
}
