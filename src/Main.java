
public class Main {

	public static void main(String[] args) {
		// �������� ��������, ����� �������� �� ������ ������� �� 30 �� 1 �
		// ������� ���,
		// ��������� � 5 ���� � 6 ������

		int[][] massive = { { 30, 29, 28, 27, 26, 25 }, { 24, 23, 22, 21, 20, 19 }, { 18, 17, 16, 15, 14, 13 },
				{ 12, 11, 10, 9, 8, 7 }, { 6, 5, 4, 3, 2, 1 } };
		for (int i = 0; i < massive.length; i++) {
			for (int j = 0; j < massive[i].length; j++) {
				System.out.print(massive[i][j]);
			}
		System.out.println();
		}
		

	}
}