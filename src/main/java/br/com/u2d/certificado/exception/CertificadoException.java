package br.com.u2d.certificado.exception;

/**
 * Exceção a ser lançada na ocorrência de falhas provenientes do Certificado.
 *
 * @author David Jeremias - u2dtecnologia@gmail.com
 */
@SuppressWarnings("WeakerAccess")
public class CertificadoException extends Exception {

	private String message;
	
	/**
	 * Construtor da classe.
	 * 
	 * @param e
	 */
	public CertificadoException(Throwable e) {
		super(e);
	}

	
	/**
	 * Construtor da classe.
	 * 
	 * @param message
	 */
	public CertificadoException(String message) {
		this((Throwable) null);
		this.message = message;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

}