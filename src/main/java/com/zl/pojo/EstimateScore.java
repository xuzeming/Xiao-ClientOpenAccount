package com.zl.pojo;

import java.io.Serializable;

public class EstimateScore implements Serializable {

	private static final long serialVersionUID = -1824992393117767765L;
	private Integer one;
	private Integer two;
	private Integer three;
	private Integer four;
	private Integer five;
	private Integer six;
	private Integer seven;
	private Integer eight;
	private Integer nine;
	private Integer ten;
	private Integer eleven;
	private Integer allScore;
	public Integer getOne() {
		return one;
	}
	public void setOne(Integer one) {
		this.one = one;
	}
	public Integer getTwo() {
		return two;
	}
	public void setTwo(Integer two) {
		this.two = two;
	}
	public Integer getThree() {
		return three;
	}
	public void setThree(Integer three) {
		this.three = three;
	}
	public Integer getfour() {
		return four;
	}
	public void setfour(Integer four) {
		this.four = four;
	}
	public Integer getFive() {
		return five;
	}
	public void setFive(Integer five) {
		this.five = five;
	}
	public Integer getSix() {
		return six;
	}
	public void setSix(Integer six) {
		this.six = six;
	}
	public Integer getSeven() {
		return seven;
	}
	public void setSeven(Integer seven) {
		this.seven = seven;
	}
	public Integer getEight() {
		return eight;
	}
	public void setEight(Integer eight) {
		this.eight = eight;
	}
	public Integer getnine() {
		return nine;
	}
	public void setnine(Integer nine) {
		this.nine = nine;
	}
	public Integer getTen() {
		return ten;
	}
	public void setTen(Integer ten) {
		this.ten = ten;
	}
	
	public Integer getFour() {
		return four;
	}
	public void setFour(Integer four) {
		this.four = four;
	}
	public Integer getNine() {
		return nine;
	}
	public void setNine(Integer nine) {
		this.nine = nine;
	}
	public Integer getEleven() {
		return eleven;
	}
	public void setEleven(Integer eleven) {
		this.eleven = eleven;
	}
	
	public Integer getAllScore() {
		return one+two+three+four+five+six+seven+eight+nine+ten+eleven;
	}
	
	public void setAllScore(Integer allScore) {
		this.allScore = allScore;
	}
	@Override
	public String toString() {
		return "EstimateScore [one=" + one + ", two=" + two + ", three=" + three + ", four=" + four + ", five=" + five
				+ ", six=" + six + ", seven=" + seven + ", eight=" + eight + ", nine=" + nine + ", ten=" + ten
				+ ", eleven=" + eleven + ", allScore=" + allScore + "]";
	}
	
	
	
}
