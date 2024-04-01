// 1. Count Alphabets, digits, special symbols from  string

// Digits (0-9): ASCII values 48 to 57

// Uppercase letters (A-Z): ASCII values 65 to 90
// Lowercase letters (a-z): ASCII values 97 to 122

// *   Space: ASCII value 32
// *   Exclamation mark (!): ASCII value 33
// *   Double quotes ("), hash (#), dollar ($), percent (%), ampersand (&), single quote ('), parentheses (()), asterisk (\*), plus (+), comma (,), hyphen (-), period (.), forward slash (/): ASCII values 34 to 47
// *   Colon (:), semicolon (;), less than (<), equals (=), greater than (>), question mark (?), at symbol (@): ASCII values 58 to 64
// *   Square brackets (\[\]), backslash (), caret (^), underscore (\_), backtick (\`): ASCII values 91 to 96
// *   Curly braces ({}), vertical bar (|), tilde (~): ASCII values 123 to 126


import java.util.Scanner;

class CountStringValue
{

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        
        String inpuData;
        System.out.print("Enter the string:");
        inpuData=sc.nextLine();



        int alphabets=0, digits=0, specialSymbols=0;

        for (int i = 0; i < inpuData.length(); i++) 
        {
            int ch=(int) inpuData.charAt(i);

                if (ch >=48 && ch<= 57) {
                    digits++;
                }
                else if ((ch >=65 && ch<= 90) || (ch >=97 && ch<= 122) ) 
                {   
                    alphabets++;
                }
                else if ((ch >=32 && ch<=47 ) || (ch >=58 && ch<=64 ) || (ch >=91 && ch<= 96) || (ch >=123 && ch<=126 ) ) 
                {
                    specialSymbols++;
                }

        }

        System.out.println("Alphabets :"+alphabets);
        System.out.println("Digits :"+digits);
        System.out.println("Sepcial Symbols: "+specialSymbols);
        sc.close();
    }
}


