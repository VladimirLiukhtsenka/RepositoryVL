package by.epamtc.Strings.AsArrayOfCharacters;

/*
1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */
public class AAOF1 {
    public static void main(String[] args) {
        String[] camelCase = new String[4];
        camelCase[0] = "houstonWeHaveAProblem";
        camelCase[1] = "bondJamesBond";
        camelCase[2] = "youShallNotPass";
        camelCase[3] = "londonIsTheCapitalOfgreatBritain";
        for (int i = 0; i < camelCase.length; i++) {
            camelCase[i] = To_snake_case(camelCase[i]);
            System.out.println(camelCase[i]);
        }
    }

    private static String To_snake_case(String s) {
        String[] parts = s.split("(?=[A-Z])");
        String to_snake_case = "";
        for (int i = 0; i < parts.length; i++) {
            if (i < parts.length - 1) {
                parts[i] = parts[i].toLowerCase() + "_";
                to_snake_case += parts[i];
            } else {
                parts[i] = parts[i].toLowerCase();
                to_snake_case += parts[i];
            }
        }
        return to_snake_case;
    }
}
