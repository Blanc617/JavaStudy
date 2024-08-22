package Class;

public class MovieReviewMain {

	public static void main(String[] args) {
		
		MovieReview[] reviews = new MovieReview[2];

		MovieReview incep = new MovieReview();
		incep.title = "인셉션";
		incep.review = "좋아요";
		reviews[0] = incep;
		
		MovieReview about = new MovieReview();
		about.title = "어바웃";
		about.review = "시러요";
		reviews[1] = about;
		
		for (MovieReview r : reviews) {
			System.out.println("영화 제목 : " + r.title + " 영화 리뷰 : " + r.review);
		}
			
	}

}
