package patterns.builder;

public class Phone {
	
	private String os;
	private String cpu;
	private int ram;
	private int memory;
	private float screenSize;
	private int battery;
	private boolean hasDoubleSim;
	
	//Hiding constructor so that the only way to construct an instance is through Builder
	private Phone(String os, String cpu, int ram, int memory, float screenSize, int battery, boolean hasDoubleSim) {
		super();
		this.os = os;
		this.cpu = cpu;
		this.ram = ram;
		this.memory = memory;
		this.screenSize = screenSize;
		this.battery = battery;
		this.hasDoubleSim = hasDoubleSim;
	}
	
	//Builder - A way to hide logics of object creation from users, and avoid problems with huge constructors
	//Am going to use it when I have more than 5 fields in the class
	//A place to set default values for specific fields
	public static final class Builder
	{
		
		private String os;
		private String cpu;
		private int ram;
		private int memory = 2;
		private float screenSize = 860;
		private int battery = 500;
		private boolean hasDoubleSim = false;
		
		public Builder() {}
		
		public Builder withOs(String os) {
			this.os = os;
			return this;
		}

		public Builder withCpu(String cpu) {
			this.cpu = cpu;
			return this;
		}

		public Builder withRam(int ram) {
			this.ram = ram;
			return this;
		}

		public Builder withMemory(int memory) {
			this.memory = memory;
			return this;
		}

		public Builder withScreenSize(float screenSize) {
			this.screenSize = screenSize;
			return this;
		}

		public Builder withBattery(int battery) {
			this.battery = battery;
			return this;
		}

		public Builder includeDoubleSim() {
			this.hasDoubleSim = true;
			return this;
		}
		
		public Phone buildPhone()
		{
			//A way of making the initialization of some fields mandatory
			if(os == null || cpu == null || ram == 0)
			{
				throw new IllegalStateException("Your phone MUST contain an operating system, a cpu and ram");
			}
			return new Phone(os, cpu, ram, memory, screenSize, battery, hasDoubleSim);
		}
	}

	@Override
	public String toString() {
		return "You just created your custom phone by using phone builder \nHere is the configuration \nPhone [os=" + os + ", cpu=" + cpu + ", ram=" + ram + ", memory=" + memory + ", screenSize=" + screenSize
				+ ", battery=" + battery + ", hasDoubleSim=" + hasDoubleSim + "]";
	}
	
	
	
}
