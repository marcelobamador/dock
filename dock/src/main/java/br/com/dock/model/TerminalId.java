package br.com.dock.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class TerminalId implements Serializable {

	private static final long serialVersionUID = 5613123628187971136L;

	private Integer logic;
	private String serial;
	private String model;
	private String version;

	/**
	 * @return the logic
	 */
	public Integer getLogic() {
		return logic;
	}

	/**
	 * @param logic the logic to set
	 */
	public void setLogic(Integer logic) {
		this.logic = logic;
	}

	/**
	 * @return the serial
	 */
	public String getSerial() {
		return serial;
	}

	/**
	 * @param serial the serial to set
	 */
	public void setSerial(String serial) {
		this.serial = serial;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

}
