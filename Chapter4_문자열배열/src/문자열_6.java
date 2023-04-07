
public class 문자열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu ="원조김밥"
				+ "2,500원"
				+ "/쌀떡볶이"
				+ "3,500원"
				+ "/찹쌀순대"
				+ "3,500원"
				+ "/라면"
				+ "3,500원"
				+ "/쫄면"
				+ "5,500원";
		System.out.println(menu);
		System.out.println(menu.replace("/", "|"));
		String[] menus = menu.split("/");
	    for(String m:menus)
	    {
	    	System.out.println(m);
	    }

	}

}
