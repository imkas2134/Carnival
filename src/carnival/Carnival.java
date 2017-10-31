/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carnival;
 /**
 * A carnival of games is simulated.
 */
 public class Carnival {

	public static void main(String[] args) {
		GameBooth balloonDartToss = new GameBooth("Balloon Dart Toss",2,"tiger plush", "sticker");
		GameBooth ringToss = new GameBooth("Ring Toss", 2,"bear keychain", "pencil");
		GameBooth breakAPlate = new GameBooth("Break A Plate",1.5, "pig plush", "plastic dinosaur");
		Player shonda = new Player(5);
		Player luis = new Player(3);
				
		System.out.print("Shonda goes to Balloon Dart Toss. ");
		System.out.println(shonda.play(balloonDartToss));
		
		System.out.print("Luis goes to Ring Toss. ");
		System.out.println(luis.play(ringToss));
		
		System.out.print("Shonda goes to Ring Toss. ");
		System.out.println(shonda.play(ringToss));
		
		System.out.print("Luis goes to Break A Plate. ");
		System.out.println(luis.play(breakAPlate));
		
		System.out.println("Shonda won: " + shonda.toString());
		System.out.println("Luis won: " + luis.toString());
                
                balloonDartToss.prizesAwarded();
                ringToss.prizesAwarded();
                breakAPlate.prizesAwarded();
	}
}