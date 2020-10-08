package shiyan;

//	import shiyan.*;
	public class Test {
    public static void main(String args[]) {
			CPU cpu=new CPU();
			HardDisk disk=new HardDisk();
			PC pc=new PC();
			
		//	CPU price=new CPU();
		//	HardDisk brand=new HardDisk();
					
		    cpu.setSpeed(2200);
		    cpu.setPrice(284);
		    disk.brand("samsung");
		    disk.setAmount(200);
		    pc.setCPU(cpu);
		    pc.setHardDisk(disk);
		    pc.show();
		    
			
		}

	}

