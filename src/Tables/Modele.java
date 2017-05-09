package Tables;

import java.sql.Date;

public class Modele {
	
	private int brand;
	private String screentype;
	private int weight;
	private int rom;
	private int ram;
	private int os;
	private String cpu;
	private boolean touchscreen;
	private boolean doublesim;
	private String simtype;
	private String simmode;
	private Date dater;
	
	public Modele(int brand, String screentype, int weight, int rom, int ram, int os, String cpu, boolean touchscreen,
			boolean doublesim, String simtype, String simmode, Date dater) {
		this.brand = brand;
		this.screentype = screentype;
		this.weight = weight;
		this.rom = rom;
		this.ram = ram;
		this.os = os;
		this.cpu = cpu;
		this.touchscreen = touchscreen;
		this.doublesim = doublesim;
		this.simtype = simtype;
		this.simmode = simmode;
		this.dater = dater;
	}

	public int getBrand() {
		return brand;
	}

	public void setBrand(int brand) {
		this.brand = brand;
	}

	public String getScreentype() {
		return screentype;
	}

	public void setScreentype(String screentype) {
		this.screentype = screentype;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getRom() {
		return rom;
	}

	public void setRom(int rom) {
		this.rom = rom;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getOs() {
		return os;
	}

	public void setOs(int os) {
		this.os = os;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public boolean isTouchscreen() {
		return touchscreen;
	}

	public void setTouchscreen(boolean touchscreen) {
		this.touchscreen = touchscreen;
	}

	public boolean isDoublesim() {
		return doublesim;
	}

	public void setDoublesim(boolean doublesim) {
		this.doublesim = doublesim;
	}

	public String getSimtype() {
		return simtype;
	}

	public void setSimtype(String simtype) {
		this.simtype = simtype;
	}

	public String getSimmode() {
		return simmode;
	}

	public void setSimmode(String simmode) {
		this.simmode = simmode;
	}

	public Date getDater() {
		return dater;
	}

	public void setDater(Date dater) {
		this.dater = dater;
	}
}
