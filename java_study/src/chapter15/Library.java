package chapter15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Library {
	private Map<String, Book> books; // 도서관의 모든 책을 관리하는 Map
	
	// 생성자
	public Library() {
		this.books = new HashMap<String, Book>();
	}
	
	// 책 추가 메서드
	public void addBook(Book book) {
		books.put(book.getIsbn(), book);
		System.out.println(book.getTitle() + "이(가) 도서관에 추가되었습니다.");
	}
	
	// 제목으로 책 검색
	// 람다 표현식 & 스트림 API
	public List<Book> searchBooksByTitle(String title) {
		return books.values().stream()
				.filter(book -> book.getTitle().equalsIgnoreCase(title)) // equalsIgnoreCase 대소문자 구분 안함
				.collect(Collectors.toList());
	}
	
	// 저자로 책 검색
	public List<Book> searchBooksByAuthor(String author) {
		return books.values().stream()
				.filter(book -> book.getAuthor().equalsIgnoreCase(author))
				.collect(Collectors.toList());
	}
	
	// 도서관 데이터를 저장하는 메서드
	
	// 도서관 데이터를 로드(불러오는)하는 메서드
}
