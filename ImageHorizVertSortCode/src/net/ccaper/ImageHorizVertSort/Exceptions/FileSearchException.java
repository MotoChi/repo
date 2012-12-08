package net.ccaper.ImageHorizVertSort.Exceptions;

public class FileSearchException extends Exception {
	private static final long serialVersionUID = 1L;
	private String error;

	public FileSearchException() {
		super();
		error = "unknown";
	}

	public FileSearchException(String error)  {
		super(error);
		this.error = error;
	}
	  
	public String getError() {
		return error;
	}
}
