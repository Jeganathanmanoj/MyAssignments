package week1.day2;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Library {
	
	String addBook(String bookTitle){
		System.out.println("Book added successfully");
		return bookTitle;
		
	}
	
	String issueBook(){
		System.out.println("Book issued successfully");
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library BD = new Library();
		BD.addBook(null);
		BD.issueBook();
	}

}
