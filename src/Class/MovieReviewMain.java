package Class;

public class MovieReviewMain {

	public static void main(String[] args) {
		
		MovieReview[] reviews = new MovieReview[2];

		MovieReview incep = new MovieReview();
		incep.title = "�μ���";
		incep.review = "���ƿ�";
		reviews[0] = incep;
		
		MovieReview about = new MovieReview();
		about.title = "��ٿ�";
		about.review = "�÷���";
		reviews[1] = about;
		
		for (MovieReview r : reviews) {
			System.out.println("��ȭ ���� : " + r.title + " ��ȭ ���� : " + r.review);
		}
			
	}

}
