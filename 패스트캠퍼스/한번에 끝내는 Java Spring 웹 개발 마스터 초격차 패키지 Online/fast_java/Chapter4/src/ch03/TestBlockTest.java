package ch03;

public class TestBlockTest {

	public static void main(String[] args) {
		
		String textBlock = """
				Hello,
				hi,
				how r u""";
		System.out.println(textBlock);
		System.out.println(getBlockOfHtml());
	
	}
	
	public static String getBlockOfHtml() {
		return """
				<html>
				
					<body>
						<span><example text></span>
					</body>
				</html>""";
	}

}
