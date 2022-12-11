package model.entities;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Contract {
	
	private Integer number;
	private LocalDate date;
	private Double totalValuer;
	
	private List<Installment> instalments = new ArrayList<>();
	
	public Contract () {
	}

	public Contract(Integer number, LocalDate date, Double totalValuer) {
		this.number = number;
		this.date = date;
		this.totalValuer = totalValuer;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValuer() {
		return totalValuer;
	}

	public void setTotalValuer(Double totalValuer) {
		this.totalValuer = totalValuer;
	}

	public List<Installment> getInstalments() {
		return instalments;
	}
	
}
