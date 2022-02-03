package br.com.dock.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TERMINAL")
public class TerminalEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6589515782064179157L;

	@EmbeddedId
	private TerminalId terminalId;
	private Integer sam;
	private String ptid;
	private Integer plat;
	private Integer mxr;
	private Integer mxf;
	private String PVERFM;

	/**
	 * @return the terminalId
	 */
	public TerminalId getTerminalId() {
		return terminalId;
	}

	/**
	 * @param terminalId the terminalId to set
	 */
	public void setTerminalId(TerminalId terminalId) {
		this.terminalId = terminalId;
	}

	/**
	 * @return the sam
	 */
	public Integer getSam() {
		return sam;
	}

	/**
	 * @param sam the sam to set
	 */
	public void setSam(Integer sam) {
		this.sam = sam;
	}

	/**
	 * @return the ptid
	 */
	public String getPtid() {
		return ptid;
	}

	/**
	 * @param ptid the ptid to set
	 */
	public void setPtid(String ptid) {
		this.ptid = ptid;
	}

	/**
	 * @return the plat
	 */
	public Integer getPlat() {
		return plat;
	}

	/**
	 * @param plat the plat to set
	 */
	public void setPlat(Integer plat) {
		this.plat = plat;
	}

	/**
	 * @return the mxr
	 */
	public Integer getMxr() {
		return mxr;
	}

	/**
	 * @param mxr the mxr to set
	 */
	public void setMxr(Integer mxr) {
		this.mxr = mxr;
	}

	/**
	 * @return the mxf
	 */
	public Integer getMxf() {
		return mxf;
	}

	/**
	 * @param mxf the mxf to set
	 */
	public void setMxf(Integer mxf) {
		this.mxf = mxf;
	}

	/**
	 * @return the pVERFM
	 */
	public String getPVERFM() {
		return PVERFM;
	}

	/**
	 * @param pVERFM the pVERFM to set
	 */
	public void setPVERFM(String pVERFM) {
		PVERFM = pVERFM;
	}

}
