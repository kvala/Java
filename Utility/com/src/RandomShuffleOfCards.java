package src;
import java.util.Random;


public class RandomShuffleOfCards {

	public static void main(String[] args) {
		
		int[] cards = new int[52];
		for(int i = 0; i < 52; i++)
		{
			cards[i] = i+1;
			System.out.print(cards[i] + " ");
		}
		Random rand = new Random();
		for(int i = cards.length-1; i > 0; i--) {
			
			int n = rand.nextInt(i+1);
			int temp = cards[i];
			cards[i] = cards[n];
			cards[n] = temp;
		}
		System.out.println();
		for(int i = 1; i < cards.length; i++) {
			System.out.print(cards[i] + " ");
		}
	}
}
