import java.util.*;

public class Deck {
    public static void main(String[] args){
        Card[][] Cards = new Card[4][13];
        String [] clubs = {"Clubs", "Diamonds", "Hearts", "Spades"};
        for(int j = 0; j < 4; j++){
            for(int i = 0; i < 13; i++){
                if(i < 10){
                    Cards[j][i] = new Card(clubs[j], String.valueOf(i+1));
                }
                else{
                    switch(i){
                        case 10:
                            Cards[j][i] = new Card(clubs[j], "Jack");
                            break;
                        case 11:
                            Cards[j][i] = new Card(clubs[j], "Queen");
                            break;
                        case 12:
                            Cards[j][i] = new Card(clubs[j], "King");
                            break;                
                    }
                }      
            }
        }
        print(Cards);
        System.out.println("/n/n/n");
        print(shuffle());

        



    }

    public static void print(Card[][] cards){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){

                for(int k = 0; k < cards[i][j].getSuit().length(); k++){
                    System.out.print('-');
                }
                System.out.print(' ');
            }
            System.out.println(' ');

            for(int j = 0; j < 13; j++){
                System.out.print(" " + cards[i][j].getSuit() + " ");
            }

            System.out.println(' ');

            for(int j = 0; j < 13; j++){
                System.out.print(' ');
                for(int k = 0; k < cards[i][j].getSuit().length(); k++){
                    System.out.print('-');
                }
                System.out.print(' ');
            }
            System.out.println(' ');

            for(int j = 0; j < 13; j++){
                int WordLenght = cards[i][j].getType().length();
                int SuitLenght = cards[i][j].getSuit().length();

                int repeats = (SuitLenght-WordLenght)/2;

                for(int k = 0; k < repeats+1; k++){
                    System.out.print(' ');
                }
                System.out.print(cards[i][j].getType());

                for(int k = 0; k < repeats+2; k++){
                    System.out.print(' ');
                }


            }

            System.out.println("\n\n");


        }
    }

    public static Card[][] shuffle(){
        String[] optionCards = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Queen", "King", "Jack"};
        String[] optionClubs = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] used = new String[52];
        Card[][] Cards = new Card[4][13];
        for(int j = 0; j<52; j++){
            used[j] = "x";
        }


        int j = 0;
        int i = 0;
        int rounds = 0;
        boolean add = true;

        Random random = new Random();

        while(rounds < 52){
            int randomCard = random.nextInt(optionCards.length);
            int randomClubs = random.nextInt(optionClubs.length);

            for(String c: used){
                if(c.equals(optionClubs[randomClubs]+optionCards[randomCard])){
                    add = false;
                }

                //System.out.println(c+ ' '+ add);
            }

            if(add){
                Cards[j][i] = new Card(optionClubs[randomClubs], optionCards[randomCard]);
                used[rounds] = optionClubs[randomClubs]+optionCards[randomCard];
                

                i++;
                if(i == 13){
                    i = 0;
                    j++;
                }
                rounds++;
            }

            add = true;
            
        }

        return Cards;

        
    }
        
}
