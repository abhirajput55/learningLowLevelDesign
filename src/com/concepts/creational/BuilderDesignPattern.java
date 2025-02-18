package com.concepts.creational;

public class BuilderDesignPattern {

	public static void main(String[] args) {
		
		Computer builder = new Computer.ComputerBilder(4, 128, "Dell").setIsGrafixCardEnabled(false).builder();
	}
}


class Computer {
	
	private int ram;
	private int rom;
	private String name;
	private boolean isGrafixCardEnabled;
	
	
	public Computer(ComputerBilder builder) {
		this.ram = builder.ram;
		this.rom = builder.rom;
		this.name = builder.name;
		this.isGrafixCardEnabled = builder.isGrafixCardEnabled;
	}
	
	public static class ComputerBilder {
		
		private int ram;
		private int rom;
		private String name;
		private boolean isGrafixCardEnabled;
		
		
		public ComputerBilder(int ram, int rom, String name) {
			this.ram = ram;
			this.rom = rom;
			this.name = name;
		}
		
		public ComputerBilder setIsGrafixCardEnabled(boolean b) {
			this.isGrafixCardEnabled = b;
			return this;
		}
		
		public Computer builder() {
			return new Computer(this);
		}
	}
}
