//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Main m = new Main();
        System.out.println("cccCCC : " + m.solution("cccCCC"));
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
    public String solution(String my_string) {
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            if(Character.isUpperCase(my_string.charAt(i))){
                answer+=Character.toLowerCase(my_string.charAt(i));}
            else if(Character.isLowerCase(my_string.charAt(i))){
                answer+=Character.toUpperCase(my_string.charAt(i));}
        }
        return answer;
    }
}