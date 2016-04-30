
public class runTest {

	public static void runTest(String jiraUserStory) {
		String test=jiraUserStory.substring(jiraUserStory.indexOf("#")+1, jiraUserStory.lastIndexOf("#"));
		
		System.out.println("Test to run :: "+test);
		if(test.equalsIgnoreCase("ZAP")){
			System.out.println("ZAP");;
		}
	} 
}
