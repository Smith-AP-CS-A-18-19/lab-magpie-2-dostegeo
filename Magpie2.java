/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2 {
	/**
	 * Get a default greeting
	 * @return a greeting
	 */
	public String getGreeting() {
		return "What's boppin  jimbo?";
	}

	/**
	 * Gives a response to a user statement
	 *
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("Smith") >= 0
				   || statement.indexOf("Olson") >= 0
				   || statement.indexOf("Marshall") >= 0
				   || statement.indexOf("McLaughlin") >= 0
					 || statement.indexOf("Vandenberg") >= 0
					 || statement.indexOf("VanTreese") >= 0)
		{
			response = "Did you mean the Wolf Pack?";
		} else if (statement.indexOf("Oh") >= 0
					 || statement.indexOf("called") >= 0
					 || statement.indexOf("really") >= 0
					 || statement.indexOf("groupchat") >= 0
					 || statement.indexOf("hm") >= 0
					 || statement.indexOf("wow") >= 0)
		{
			response = "Yes, they're the intellectuals of Berkeley";
		} else if (statement.indexOf("What") >= 0
					 || statement.indexOf("do") >= 0
					 || statement.indexOf("you") >= 0
					 || statement.indexOf("mean") >= 0
					 || statement.indexOf("ok") >= 0
					 || statement.indexOf("what") >= 0)
		{
			response = "Each one has his own specialization. With their combined knowledge, they are experts on the workings of the world.";
		} else {
			response = getRandomResponse();
		}
		return response;
	}



	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if (whichResponse == 4) {
			response = "Lorenzo talks a ton";
		} else if (whichResponse == 5) {
			response = "Mr. Smith = Goat";
}
		return response;
	}
}
