import java.util.*;

public class Unit7Lab2{
    public static void main(String[] args){
        System.out.println(binaryToDecimal("100101001100011001") == 152345);
        System.out.println(binaryToHex("100101001100011001")); //152345
        System.out.println(Decimaltobinary(152345));  //100111000100000
        System.out.println(hexToBinary(2000)); //7D0
    }


    public static int binaryToDecimal(String binary){
        final int Base = 2;
        int decimalVal = 0;
        StringBuilder new_binary = new StringBuilder(binary);
        new_binary.reverse();
        for(int i = 0; i < new_binary.length(); i++){
            int val = Integer.parseInt(String.valueOf(new_binary.charAt(i)));
            decimalVal += (Math.pow(Base, i)*val);
        }
        return decimalVal;
    }

    public static String binaryToHex(String binary){
        StringBuilder hex_string = new StringBuilder();
        StringBuilder new_binary = new StringBuilder(binary);
        new_binary.reverse();
        int times = new_binary.length()%4;
        if(times != 0){
            for(int i = 0; i < 5-times; i++){
                new_binary.append('0');
            }
        }
        for(int i = 4; i < new_binary.length(); i += 4){
            StringBuilder b = new StringBuilder(new_binary.substring(i-4, i));
            b.reverse();
            String x = new String(b);
            char letter = 'a';
            switch (x){
                case "0000":
                    letter = '0';
                    break;
                case "0001":
                    letter = '1';
                    break;
                case "0010":
                    letter = '2';
                    break;
                case "0011":
                    letter = '3';
                    break;
                case "0100":
                    letter = '4';
                    break;
                case "0101":
                    letter = '5';
                    break;
                case "0110":
                    letter = '6';
                    break;
                case "0111":
                    letter = '7';
                    break;
                case "1000":
                    letter = '8';
                    break;
                case "1001":
                    letter = '9';
                    break;
                case "1010":
                    letter = 'A';
                    break;
                case "1011":
                    letter = 'B';
                    break;
                case "1100":
                    letter = 'C';
                    break;
                case "1101":
                    letter = 'D';
                    break;
                case "1110":
                    letter = 'E';
                    break;
                case "1111":
                    letter = 'F';
                    break;
            }
            hex_string.append(letter);
        }
        hex_string.reverse();
        String finalString = new String(hex_string);

        return finalString;
            
        
    }


    public static String Decimaltobinary(int Decimal){
        final int Base = 2;
        double val = 2;
        int start_base = 0;
        StringBuilder decimal = new StringBuilder();
        while (val > 1){
            val = Decimal/Math.pow(Base, start_base);
            start_base ++;
        }
        start_base--;
        double remander = Decimal;

        for(int i = start_base; i >= 0; i--){
            if(remander/(Math.pow(Base, i)) < 1){
                decimal.append(0);
            }
            else{
                remander = remander%(Math.pow(Base, i));
                decimal.append(1);
                
            }
        }
        String answer = new String(decimal);
        return answer;


    }

    public static String hexToBinary(int Decimal){
        final int Base = 16;
        double val = 2;
        int start_base = 0;
        StringBuilder decimal = new StringBuilder();
        while (val > 1){
            val = Decimal/Math.pow(Base, start_base);
            start_base ++;
        }

        start_base--;
        double remander = Decimal;
        for(int i = start_base; i >= 0; i--){
            for(int j = 15; j >= 0; j--){
                if(remander-(j*Math.pow(Base, i)) >= 0){
                    remander = remander-(j*Math.pow(Base, i));
                    if (j == 10){
                        decimal.append('a');
                    }
                    else if (j == 11){
                        decimal.append('b');
                    }
                    else if (j == 12){
                        decimal.append('c');
                    }
                    else if (j == 13){
                        decimal.append('d');
                    }
                    else if (j == 14){
                        decimal.append('e');
                    }
                    else if (j == 15){
                        decimal.append('f');
                    }
                    else{
                        decimal.append(j);
                    }
                
                    break;
                }
                if(j == 0){
                    decimal.append(0);
                }
            }

        }
        String answer = new String(decimal);
        return answer;
    }
} 
