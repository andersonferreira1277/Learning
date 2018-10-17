package classPath;

public class ClassPathTest {

	public static void main(String[] args) {

		ClassLoader loader = ClassPathTest.class.getClassLoader();
        System.out.println(loader.getResource("classPath/classPathTest.class"));
	}

}
