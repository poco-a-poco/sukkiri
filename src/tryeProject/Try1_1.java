package tryeProject;

public class Try1_1 {
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		for (int i = 0;i <= 100;i++){
			sb.append(i).append(",");
		}
		System.out.println(sb.toString());
		String[] a = sb.toString().split(",");
		System.out.println(a[0]);
	}
}