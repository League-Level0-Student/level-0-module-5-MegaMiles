package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
static int happinessLevel = 0;
static String petName;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		 petName = JOptionPane.showInputDialog(null,"What Pet do you want");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 20; i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your " + petName + " Happy?", "Your pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Or feed it", "Take it on a walk", "Cuddle it", "Pet it" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			System.out.println(task);
			if(task==3) {
petIt();
}			
			if(task==2) {
cuddleIt();
}
			if(task==1) {
takeonWalk();
}
			if(task==0) {
feedIt();
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if (happinessLevel > 10) {
	JOptionPane.showMessageDialog(null, "You definitly love your " + petName + " a lot");
	break;
}}
	

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.

}
	static void petIt() {	
		JOptionPane.showMessageDialog(null, "The " + petName + " likes you peting it");
		happinessLevel+= 2;
	}
	static void cuddleIt() {	
		JOptionPane.showMessageDialog(null, "Your " + petName + " loves your cuddle and wants you to do it more");				
		happinessLevel+= 3;;
	}
	static void takeonWalk() {	
		JOptionPane.showMessageDialog(null, "Your " + petName + " liked the walk but it was tired afterward");			
		happinessLevel+= 2;
	}
	static void feedIt() {	
		JOptionPane.showMessageDialog(null, "Your " + petName + " loved you feeding it, it wants you to do it again");			
		happinessLevel+= 4;
	}
}
