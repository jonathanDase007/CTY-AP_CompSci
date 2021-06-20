public class test {
    public static void main(String[] args){

        String personName = "Jonathan Dase";
        String Name = "Dase";
        int j = personName.indexOf( " " );

        System.out.println(getString(personName, Name));
        System.out.println(getString(personName, "nathan"));
        System.out.println(getString(personName, "Zed"));





    }

    public static String getString( String a, String b )
{
     int idx = a.indexOf( b );
     return a.substring( idx, idx + b.length() );
}

public static String myFunc( String s )
{
     String blank = " ";          // a single blank space
     String myString = "";   // an empty string
     String temp;
     for( int j = 0; j < s.length(); j++ )
     {
          temp = s.substring( j, j + 1 );
          if( temp.equals( blank )  )
               myString += temp;
     }
     return myString;
}
}
