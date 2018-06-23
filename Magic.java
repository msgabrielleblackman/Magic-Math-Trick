public class Magic {
	public static void main(String[] args) {

  // We will refer to myNumber as the original number 
  int myNumber = 33;
  int stepOne = myNumber * myNumber;
  int stepTwo = stepOne + myNumber;
  int stepThree = stepTwo / myNumber;
  int stepFour = stepThree + 17;
  int stepFive = stepFour - myNumber;
  int stepSix = stepFive / 6;
    
    System.out.println(stepSix);
		

	}
}